# Use an official Tomcat runtime as the base image
FROM tomcat:9.0-jdk11-openjdk

# Set the working directory inside the container
WORKDIR /usr/local/tomcat

# Remove the default webapps (optional, if you don't want the default examples)
RUN rm -rf webapps/*

# Copy the generated .war file to the Tomcat webapps directory
COPY target/FrontEnd-1.0-SNAPSHOT.war webapps/ROOT.war

# Expose the port Tomcat runs on
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
