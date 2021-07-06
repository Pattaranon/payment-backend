# Use official base image of Java Runtime
FROM openjdk:16-alpine

# Who is MAINTAINER
MAINTAINER Pattaranon Plyduang, pattaranon.ply@gmail.com

# Copy jar file to container
COPY ./target/payment-api.jar payment-api.jar

# Set port
EXPOSE 9980

# Run the JAR file
ENTRYPOINT ["java","-jar","/payment-api.jar"]


