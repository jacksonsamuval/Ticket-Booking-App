FROM openjdk:17-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} passengerservice.jar

ENTRYPOINT ["java","-jar","/passengerservice.jar"]

EXPOSE 8090