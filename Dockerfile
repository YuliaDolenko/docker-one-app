FROM openjdk:8

ADD target/docker-app-with-db-controller.jar docker-app-with-db-controller.jar

EXPOSE 4040

ENTRYPOINT ["java", "-jar", "docker-app-with-db-controller.jar"]
