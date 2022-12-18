FROM openjdk:17-alpine
COPY ./target/*.jar ./app/inventory-service.jar
EXPOSE 8082
CMD ["java","-jar","./app/inventory-service.jar"]