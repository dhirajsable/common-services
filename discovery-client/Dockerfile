FROM gradle:6.4.0-jdk11 as app-builder

USER root
RUN mkdir -p /usr/discovery-client
WORKDIR /usr/discovery-client
COPY src ./src
COPY build.gradle .
RUN gradle clean build bootJar -x test

RUN ls -ltr
RUN ls -ltr build/libs
RUN ls -ltr

FROM openjdk:14-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=app-builder /usr/discovery-client/build/libs/discovery-client-0.0.1-SNAPSHOT.jar .
ENV JAVA_OPTS=""
EXPOSE 8083

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar ./discovery-client-0.0.1-SNAPSHOT.jar"]