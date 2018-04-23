FROM openjdk:8-jre-alpine

COPY /maven/zipkin-server.jar /zipkin-server.jar

EXPOSE 8080
ENTRYPOINT java -jar /zipkin-server.jar
