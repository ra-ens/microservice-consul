FROM openjdk:17-alpine
COPY ./target/*.jar ./app/config-service.jar
EXPOSE 8888
CMD ["java","-jar","./app/config-service.jar"]