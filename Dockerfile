# Dockerfile created by using a specific image for Java , not a generic Linux image 
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /usr/src/myapp

# Copy the Java source file into the working directory
COPY GuessingGame.java ./

# Instructions to compile the Java code inside the container
RUN javac GuessingGame.java

# Allow the game to be run in an interactive container
CMD ["java", "GuessingGame"]
