# Use lightweight Java 21 runtime
FROM eclipse-temurin:21-jre

# Set working directory
WORKDIR /app

# Copy your already built JAR into the container
COPY target/SPE_Mini_Project-1.0-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]

