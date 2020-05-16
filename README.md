# common-services
common-services

## Build Docker Images
### Discovery Service 
    1. docker build -t discovery-client .
    2. http://localhost:5000/actuator/health
### Discovery Client
    1. docker build -t discovery-service .
    2. http://localhost:4002/api/v1/client/service-instances/<APP_NAME>
    3. http://localhost:5001/actuator/health