FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Run application
ENTRYPOINT ["sh", "-c", "java -jar app.jar && sleep 3600"]