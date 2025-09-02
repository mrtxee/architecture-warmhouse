# Build stage with Maven
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# Set working directory
WORKDIR /build

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the project and create JAR
RUN mvn clean package -DskipTests

# Build stage
FROM openjdk:21-slim

# Set working directory
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /build/target/warmhouse-temperature-one*.jar /app/warmhouse-temperature-one.jar

#COPY warmhouse-temperature-one.jar /app/warmhouse-temperature-one.jar

# Открываем порт, который использует приложение
EXPOSE 8081

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "warmhouse-temperature-one.jar"]

# Command to run the application
#CMD ["./smarthome"]
