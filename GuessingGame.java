import java.util.Random;
import java.util.Scanner;
 
public class GuessingGame {
 
    public static void main(String[] args) {
        // Initialise a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
 
        System.out.println("Bienvenue dans le jeu de deviner le nombre!");
        System.out.println("Trouvez le nombre mystère entre 1 et 100");
 
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
 
        while (true) {
            // Ask the user for a input
            System.out.print("Votre proposition : ");
 
            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                attempts++;
 
                if (guess < secretNumber) {
                    System.out.println("Le nombre mystère est plus grand. Essayez encore.");
                } else if (guess > secretNumber) {
                    System.out.println("Le nombre mystère est plus petit. Essayez encore.");
                } else {
                    System.out.printf("Félicitations ! Vous avez trouvé le nombre mystère en %d tentatives.%n", attempts);
                    break;
                }
            } else {
                // If the input is not an integer, clear the scanner buffer and ask for a new input
                System.out.println("Erreur de saisie. Veuillez entrer un nombre valide.");
                scanner.next();
            }
        }
 
        // Close the scanner
        scanner.close();
    }
}