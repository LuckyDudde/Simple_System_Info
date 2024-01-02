FROM openjdk:17
ADD target/simple_app-1.0.0.jar simple_app-1.0.0.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "simple_app-1.0.0.jar"]
