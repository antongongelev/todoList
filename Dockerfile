FROM openjdk:8
ADD target/TodoList-1.0.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]
