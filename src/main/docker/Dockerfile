FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ebayk-0.1.0.war app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
