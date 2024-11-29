# Usar una imagen base oficial de Java con JDK 11 o 17
FROM openjdk:11-jdk-slim AS base

# Establecer directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el JAR generado al contenedor
ARG JAR_FILE=target/almacen_producto-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Configuración de puertos
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]