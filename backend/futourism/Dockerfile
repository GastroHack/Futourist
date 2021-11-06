FROM maven:3.6.3-adoptopenjdk-14 AS builder

RUN mkdir /app
WORKDIR /app

ADD pom.xml ./
RUN mvn install

ADD ./src src/
RUN mvn --batch-mode package -DskipTests=true

FROM openjdk:14-jdk-alpine

ENV APP_USER app
ENV APP_HOME /usr/local/futourism

ARG ENV=PROD
ENV ENV=${ENV}

RUN addgroup -S $APP_USER && adduser -S -D -H $APP_USER -G $APP_USER
RUN mkdir -p $APP_HOME
WORKDIR $APP_HOME

COPY --from=builder /app/target/futourism.jar futourism.jar

ADD data data

RUN chown -R $APP_USER:$APP_USER $APP_HOME
USER $APP_USER

EXPOSE 8080

CMD ["java", "-Xmx3072m", "-Xms512m", "-jar", "/usr/local/futourism/futourism.jar"]
