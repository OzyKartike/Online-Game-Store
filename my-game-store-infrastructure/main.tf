provider "aws" {
  region = "us-east-1"  # Update with your desired region
}

# Create a VPC
resource "aws_vpc" "main" {
  cidr_block = "10.0.0.0/16"

  tags = {
    Name = "my-game-store-vpc"
  }
}

# Create Subnets
resource "aws_subnet" "public" {
  vpc_id            = aws_vpc.main.id
  cidr_block        = "10.0.1.0/24"
  availability_zone = "us-east-1a"  # Update with your desired AZ

  tags = {
    Name = "my-game-store-public-subnet"
  }
}

# Create Security Group
resource "aws_security_group" "ecs" {
  vpc_id = aws_vpc.main.id

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Name = "ecs-security-group"
  }
}

# Create ECS Cluster
resource "aws_ecs_cluster" "my_game_store" {
  name = "my-game-store-cluster"
}

# Create IAM Role for ECS Task Execution
resource "aws_iam_role" "ecs_execution_role" {
  name               = "ecsExecutionRole"
  assume_role_policy = jsonencode({
    Version = "2012-10-17"
    Statement = [
      {
        Action    = "sts:AssumeRole"
        Principal = {
          Service = "ecs-tasks.amazonaws.com"
        }
        Effect    = "Allow"
        Sid       = ""
      },
    ]
  })
}

# Attach policy to the execution role to allow access to ECR
resource "aws_iam_role_policy_attachment" "ecs_execution_role_policy" {
  policy_arn = "arn:aws:iam::aws:policy/service-role/AmazonECSTaskExecutionRolePolicy"
  role       = aws_iam_role.ecs_execution_role.name
}

# Task Definition
resource "aws_ecs_task_definition" "my_game_store_task" {
  family                   = "my-game-store-task"
  requires_compatibilities = ["FARGATE"]
  network_mode            = "awsvpc"
  cpu                     = "256"
  memory                  = "512"
  execution_role_arn      = aws_iam_role.ecs_execution_role.arn  # Specify the execution role

  container_definitions = jsonencode([
    {
      name      = "frontend"
      image     = "724772065286.dkr.ecr.us-east-1.amazonaws.com/frontend-service:latest"
      essential = true
      portMappings = [
        {
          containerPort = 8080
          hostPort      = 8080
          protocol      = "tcp"
        }
      ]
    },
    {
      name      = "searchgame"
      image     = "724772065286.dkr.ecr.us-east-1.amazonaws.com/searchgame-service:latest"
      essential = true
      portMappings = [
        {
          containerPort = 8081
          hostPort      = 8081
          protocol      = "tcp"
        }
      ]
    },
    {
      name      = "viewprofile"
      image     = "724772065286.dkr.ecr.us-east-1.amazonaws.com/viewprofile-service:latest"
      essential = true
      portMappings = [
        {
          containerPort = 8082
          hostPort      = 8082
          protocol      = "tcp"
        }
      ]
    }
  ])
}

# Create ECS Service
resource "aws_ecs_service" "my_game_store_service" {
  name            = "my-game-store-service"
  cluster         = aws_ecs_cluster.my_game_store.id
  task_definition = aws_ecs_task_definition.my_game_store_task.arn
  desired_count   = 2
  launch_type     = "FARGATE"

  network_configuration {
    subnets          = [aws_subnet.public.id]
    security_groups  = [aws_security_group.ecs.id]
    assign_public_ip = true
  }
}
