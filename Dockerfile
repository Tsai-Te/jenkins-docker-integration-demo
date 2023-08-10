# Start with a base image containing Java runtime
FROM openjdk:17

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/jenkins-docker-integration-demo.jar jenkins-docker-integration-demo.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/jenkins-docker-integration-demo.jar"]
