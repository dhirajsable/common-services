FROM openjdk:14-jdk-alpine

VOLUME /tmp
echo $JAVA_OPTS
ADD build/libs/discovery-client-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar"]