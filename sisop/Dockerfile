# Build stage
FROM maven:3.8.3-openjdk-17 AS build

# Establece el directorio de trabajo
WORKDIR /home/app

# Copia el archivo pom.xml y el código fuente
COPY pom.xml .
COPY src ./src

# Construye la aplicación
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo para la etapa de ejecución
WORKDIR /home/app

# Copia el JAR generado desde la etapa de construcción
COPY --from=build /home/app/target/sisop-0.0.1-SNAPSHOT.jar .
    
# Expone el puerto en el que tu aplicación se ejecuta
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "sisop-0.0.1-SNAPSHOT.jar"]