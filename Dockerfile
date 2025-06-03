# Use OpenJDK as base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar (assumes you built it first with `mvn clean package`)
COPY target/coffeebook-0.0.1-SNAPSHOT.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
