FROM openjdk:17

ENV mysql_port = 3307

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ws.jar

ENTRYPOINT ["java","-jar","ws.jar"]