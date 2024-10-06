# Use the official Tomcat image as the base
FROM tomcat:9.0-jdk11-openjdk

# Set the working directory inside the container
WORKDIR /usr/local/tomcat

# Remove the default webapps (optional, cleans up the container)
RUN rm -rf webapps/*

# Copy the generated WAR file to the Tomcat webapps directory without renaming
COPY target/SearchGames-1.0-SNAPSHOT.war webapps/SearchGames.war

# Expose the port that the application will run on
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
