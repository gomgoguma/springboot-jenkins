FROM openjdk:17

ENV ENV_VAR1=${MY_ENV1} \
    ENV_VAR2=${MY_ENV2}

COPY build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]