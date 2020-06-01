# common-services
common-services

## Build and Run Docker Images
    1. docker-compose up --build (Fresh setup might take some time to build)
    
## Usage
    1. Get Discovery Service at http://localhost:8761
### Discovery Service 
    1. docker build . -t discovery-service
    2. docker tag <DOCKER_IMAGE_ID> sabledhiraj/discovery-service:<version>
    3. docker push sabledhiraj/discovery-service:<version>
### Discovery Client
    1. docker build -t discovery-client .
    2. docker tag <DOCKER_IMAGE_ID> sabledhiraj/discovery-client:<version>
    3. docker push sabledhiraj/discovery-client:<version>
### Discovery Client
    1. docker build -t discovery-service .
    2. docker tag <DOCKER_IMAGE_ID> sabledhiraj/config-service:<version>
    3. docker push sabledhiraj/config-service:<version>