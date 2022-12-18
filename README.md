# e-Commerce Microservices Application

This repository contains the source code for an e-commerce application based on microservices. The application is built using a variety of technologies, including Consul, Spring Cloud, and Vault.

## Prerequisites

To run this application, you will need the following software installed on your system:

- [Java 11](https://openjdk.java.net/install/)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Running the Application

To run the application, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/ra-ens/microservice-consul.git
```

2. Navigate to the root directory of the project:

```bash
cd microservice-consul
```

3. Create jar files, for each service execute the following command
```bash
mvn install
```

4. Start the application using Docker Compose:

```bash
docker-compose up
```

This will start all of the necessary services and run the application. 
You should be able to access the application in your web browser at http://localhost:4200.

## Services
The application is made up of the following services:

- **Customer service**: Provides CRUD functionality for customer data.
- **Inventory service**: Provides CRUD functionality for inventory data.
- **Order service**: Provides CRUD functionality for order data.
- **Billing service**: Provides billing functionality using Consul Config and Vault.
- **Frontend web**: The frontend of the application, built with Angular.

## Technologies
The following technologies are used in the application:

- **Consul**: Used for service discovery and configuration.
- **Spring Cloud**: Used for config management and routing.
- **Vault**: Used for securely storing and accessing secrets.
- **Angular**: Used for building the frontend web interface.

## License
This application is licensed under the MIT License.
