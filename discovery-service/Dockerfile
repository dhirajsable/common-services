FROM openjdk:14-jdk-alpine

VOLUME /tmp
ADD build/libs/discovery-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar"]