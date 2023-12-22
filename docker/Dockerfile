FROM eclipse-temurin:17-jdk-focal
ADD target/demo-0.0.1-jar-with-dependencies.jar demo-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-0.0.1.jar"]