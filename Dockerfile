FROM openjdk:8-jdk-alpine
# VOLUME /tmp
COPY ebayk-0.1.0.war app.jar 
RUN echo "Hello"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080
RUN echo "Bye"
