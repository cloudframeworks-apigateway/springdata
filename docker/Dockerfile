FROM openjdk:alpine
MAINTAINER lucienchu<lucienchu@hotmail.com>

WORKDIR /app

RUN apk update \
    && apk upgrade \
    && apk add maven \
    && mkdir -p /app/.m2

COPY springdemo /app
COPY settings.xml /app

RUN mvn -s /app/settings.xml clean package

CMD ["java -jar /app/target/*.jar"]

#EXPOSE 80
