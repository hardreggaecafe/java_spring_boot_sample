FROM eclipse-temurin:11-jdk AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests
FROM openjdk:11-jdk-slim
COPY --from=build /target/backendaccountant-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT [“java”,“-jar”,“demo.jar”]