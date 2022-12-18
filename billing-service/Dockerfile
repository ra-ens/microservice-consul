FROM openjdk:17-alpine
COPY ./target/*.jar ./app/billing-service.jar
EXPOSE 8084
CMD ["java","-jar","./app/billing-service.jar"]