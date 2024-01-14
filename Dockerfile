FROM openjdk:17

ARG MY_ENV1
ARG MY_ENV2

ENV MY_ENV1=${MY_ENV1} \
    MY_ENV2=${MY_ENV2}

COPY build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]