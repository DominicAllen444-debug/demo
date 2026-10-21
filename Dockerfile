FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/simple-java-app-1.0.jar app.jar
CMD ["java", "-cp", "app.jar", "com.example.App"]