FROM maven:3.8.4-amazoncorretto-8

RUN yum update -y && yum install git -y

COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]