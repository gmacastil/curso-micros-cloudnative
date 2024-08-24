FROM openjdk:21-slim
WORKDIR /app
COPY target/*.jar app.jar
ENV JAVA_OPTS=""
CMD java $JAVA_OPTS -jar app.jar

