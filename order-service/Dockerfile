FROM openjdk:17-alpine
COPY ./target/*.jar ./app/order-service.jar
EXPOSE 8083
CMD ["java","-jar","./app/order-service.jar"]