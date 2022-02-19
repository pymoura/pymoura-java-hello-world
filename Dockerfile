FROM maven:3.8.4-amazoncorretto-8

RUN yum update -y && yum install git -y

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install

ENTRYPOINT ["java","-jar","/app/target/pymoura-java-hello-world-1.0-SNAPSHOT.jar"]

