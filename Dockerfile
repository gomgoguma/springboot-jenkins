FROM openjdk:17

ARG MY_ENV1

ENV MY_ENV1=${MY_ENV1}

COPY build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]