# rest-client-service

This is a simple Docker containerized microservice that loads data to a distributed heap. 
Includes APIs for uploading and downloading data, and hazelcast cluster manager.
Default configs are for Docker swarm deployment.

Prerequisites:

Jdk 1.8
Maven 4
Docker

mvn clean install -Pswarm

docker build --build-arg PORT=9076 --build-arg JAR_FILE=rest-client-service-1.0.jar -t rest-client-service:1.0 -f docker/Dockerfile .

docker stack deploy -c docker/docker-compose.yml micro

http://localhost:9076/api/v1/health

http://localhost:9076/swagger-ui.html#/

