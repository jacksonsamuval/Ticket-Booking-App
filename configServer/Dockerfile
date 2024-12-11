FROM openjdk:17-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} configserver.jar

ENTRYPOINT ["java","-jar","/configserver.jar"]

EXPOSE 8088