### **Simple TODO list with Vue, Spring and Psql**

_____________
Prerequisites:

- Java 8+
- Maven
- Docker 
- Docker compose
- Postgresql (if you want to boot app locally)
______________

In order to run application, you need to execute following commands:

1. Clean and build target directory `mvn clean package`
2. Build application image `docker build -t todo`
3. Run Application via docker-compose `docker-compose up -d`
4. Go to http://localhost:8080 and start planning your task (If you use Docker Toolbox, go to http://192.168.99.100)
