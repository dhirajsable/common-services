FROM gradle:6.4.0-jdk11 as app-builder
USER root
RUN mkdir -p /usr/discovery-client
WORKDIR /usr/discovery-client

COPY src ./src
COPY build.gradle .
RUN gradle clean build -x test bootJar
RUN ls -ltr
RUN ls -ltr build/libs
ARG JAR_FILE=build/libs/discovery-client=0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} discovery-client.jar

RUN ls -ltr

FROM openjdk:14-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=app-builder /usr/discovery-client/discovery-client.jar .

ENV JAVA_OPTS=""
EXPOSE 8083

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar ./discovery-client.jar"]