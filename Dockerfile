FROM openjdk:8-jdk-alpine

MAINTAINER sergey.smirnov

ENV JAVA_OPTS="-server -Xms1024m -Xmx2048m -XX:MaxRAMFraction=2 -XshowSettings:vm -Duser.timezone=Europe/Moscow"

VOLUME /tmp

ARG JAR_FILE=build/libs/articles-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app/app.jar
COPY src/main/resources/production.properties /app/production.properties

ENTRYPOINT exec java $JAVA_OPTS -jar /app/app.jar --spring.config.location=/app/production.properties