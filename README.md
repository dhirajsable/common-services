# Common Services
These services are commonly used for micorservice in Spring boot. This module contains following services:- 

### Discovery Service 
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.

How to build Discovery Server
    1. docker build . -t discovery-service
    2. docker run -p 8761:8761 <DOCKER_IMAGE_ID>

How to clear docker cache
    1. docker builder prune
    2. docker rmi -f $(docker images -a -q)

If you dont wantn to build the code locally then you can pull docker image from docker hub 
docker pull sabledhiraj/discovery-service:latest

### Discovery Client
    1. docker build -t discovery-client .
    2. docker run -p 4002:4002 <DOCKER_IMAGE_ID>
    
If you dont wantn to build the code locally then you can pull docker image from docker hub 
docker pull sabledhiraj/discovery-client:latest
 
### Config Service
    1. docker build -t config-service .
    2. docker run -p 8888:8888 <DOCKER_IMAGE_ID>
    
If you dont wantn to build the code locally then you can pull docker image from docker hub 
docker pull sabledhiraj/config-service:latest
    
### Autojob Service (Development under progress)
    1. docker build -t config-service .
    
## Build and Run Docker Images
    ./gradlew clean
    ./gradlew clean classes build
    docker-compose up --build
    
## Usage
    1. Get Discovery Service at http://localhost:8761

### Docker Commands
    docker kill $(docker ps -q)
    docker rm $(docker ps -a -q)
    docker rmi $(docker images -q)
    Create External Docker Network:- docker network create contactlogin
    Check docker networks:- docker network ls
    Remove docker network:- docker network rm  contactlogin
