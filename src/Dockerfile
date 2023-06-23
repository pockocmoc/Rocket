# Стадия сборки
FROM openjdk:11 AS build
COPY . /app
WORKDIR /app
RUN javac Rocket.java && jar cfe rocket.jar Rocket Rocket.class && rm Rocket.java Rocket.class

# Финальный образ
FROM openjdk:11-jre-slim
COPY --from=build /app/rocket.jar /
CMD ["java", "-jar", "/rocket.jar"]
