FROM openjdk:8

ADD target/springboot-hello-0.0.1-SNAPSHOT.jat app.jar 

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080