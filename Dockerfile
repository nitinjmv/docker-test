FROM openjdk:11
COPY target/my-docker.jar my-docker.jar
ENTRYPOINT ["java", "-jar", "my-docker.jar"]