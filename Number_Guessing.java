import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxRange = 100; 
        int numberToGuess = random.nextInt(maxRange) + 1; 
        int attempts = 5;
        
        System.out.println("Welcome to the Number Guessing Game!!");
        System.out.println("I have selected a random number between 1 and " + maxRange + ". You have " + attempts + " attempts to guess it.");
        
        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations!! You guessed the correct number.");
                break;
            } 
            else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again..... ");
            }
            else {
                System.out.println("Your guess is too high. Try again....");
            }
            
            if (attempt == attempts) {
                System.out.println("Sorry! you've run out of attempts. The correct number was " + numberToGuess + ".");
            }
        }
        
        scanner.close();
    }
}
