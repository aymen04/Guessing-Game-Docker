# Guessing-Game-Docker


- Prerequisites


Docker must be installed and running on your machine. To install Docker, visit the official Docker website and follow the instructions for your operating system.

https://www.docker.com/products/docker-desktop/


- Clone or Download the Game Repository

Ensure you have the "GuessingGame.java" file and the Dockerfile in the same directory on your local machine.


- Navigate to the Project Directory

Open a terminal.
Navigate (cd) to the directory that contains the Dockerfile and the Java source file (GuessingGame.java).


- Build the Docker Image

Execute the following command in the terminal:

#      docker build -t guessing-game .


This command builds a Docker image named guessing-game based on the instructions in the Dockerfile.


- Launch the Game

Once the image is built, start the game by executing:


#       docker run -it guessing-game


The game will automatically start in the terminal.
Follow the on-screen instructions to guess the randomly generated number.



- Exit the Game

You can exit the game at any time by typing the exit command specified in the game or by pressing CTRL+C in the terminal to stop the Docker container.
