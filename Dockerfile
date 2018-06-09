FROM openjdk:8
ADD target/Dockerdemo.jar Dockerdemo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar", "Dockerdemo.jar"]