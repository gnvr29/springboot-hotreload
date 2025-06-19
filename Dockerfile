FROM maven:3.9-eclipse-temurin-24-alpine AS build

WORKDIR /app

ENTRYPOINT ["mvn", "spring-boot:run", "-Dspring-boot.run.host=0.0.0.0"]