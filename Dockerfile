FROM openjdk:17

WORKDIR /app

COPY target/Lab9_containerrrr-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Lab9_containerrrr-0.0.1-SNAPSHOT.jar"]