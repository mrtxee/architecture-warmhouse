# Build stage
FROM openjdk:21-slim

# Set working directory
WORKDIR /app

COPY warmhouse-temperature-one.jar /app/warmhouse-temperature-one.jar

# Открываем порт, который использует приложение
EXPOSE 8081

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "warmhouse-temperature-one.jar"]

# Command to run the application
#CMD ["./smarthome"]