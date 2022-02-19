FROM maven:3.8.4-amazoncorretto-8

RUN yum update -y && yum install git -y

COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean install
RUN ls
RUN pwd
RUN ls /app

ENTRYPOINT ["java","-jar","pymoura-java-hello-world-1.0-SNAPSHOT.jar"]