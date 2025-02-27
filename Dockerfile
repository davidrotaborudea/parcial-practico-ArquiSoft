FROM openjdk:11-jdk-slim AS base

WORKDIR /app


ARG JAR_FILE=target/almacen_producto-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]