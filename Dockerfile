ARG GRADLE_VERS=5.2-jdk11
FROM gradle:${GRADLE_VERS} as builder

COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle build

FROM openjdk:11-jdk
COPY --from=builder /app/build/libs/. /app
EXPOSE 80

ENV ACTIVE_PROFILE="local"
ENTRYPOINT exec java -Dspring.profiles.active=$ACTIVE_PROFILE -jar /app/docker-ex.jar