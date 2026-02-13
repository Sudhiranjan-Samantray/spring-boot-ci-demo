FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 5058

ENTRYPOINT ["java", "-jar", "app.jar"]
