# Guessing-Game-Docker


- Prérequis

Docker doit être installé sur votre machine et lançer. Pour installer Docker, visitez le site officiel de Docker et suivez les instructions pour votre système d'exploitation.

https://www.docker.com/products/docker-desktop/


- Cloner ou Télécharger le Répertoire du Jeu

Assurez-vous d'avoir le fichier GuessingGame.java et le Dockerfile dans le même répertoire sur votre machine locale.


- Naviguer vers le Répertoire du Projet

Ouvrez un terminal.
Naviguez (cd) vers le répertoire qui contient le Dockerfile et le fichier source Java (GuessingGame.java).


- Construire l'Image Docker

Exécutez la commande suivante dans le terminal :

#      docker build -t guessing-game .


Cette commande construit une image Docker nommée guessing-game basée sur les instructions dans le Dockerfile.


- Lancer le Jeu

Une fois l'image construite, démarrez le jeu en exécutant :


#       docker run -it guessing-game




Le jeu démarrera automatiquement dans le terminal.
Suivez les instructions à l'écran pour deviner le nombre généré aléatoirement.



- Quitter le Jeu

Vous pouvez quitter le jeu à tout moment en tapant la commande de sortie spécifiée dans le jeu ou en appuyant sur CTRL+C dans le terminal pour arrêter le conteneur Docker.
