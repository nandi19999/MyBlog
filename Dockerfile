# ---------- build stage ----------
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
# Leverage Docker cache
COPY mvnw* ./
COPY .mvn .mvn
COPY pom.xml .
RUN ./mvnw -q -B -DskipTests dependency:go-offline
COPY src src
RUN ./mvnw -q -B -DskipTests package

# ---------- runtime stage ----------
FROM eclipse-temurin:21-jre
WORKDIR /app
# Copy the built jar (adapt artifact name if different)
COPY --from=build /app/target/*.jar app.jar

# Health endpoint (Spring Boot actuator is optional; if not used, keep this CMD)
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/app.jar"]
