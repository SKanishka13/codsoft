import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalWins = 0;

         System.out.println(" HELLO!! Welcome to the Number Guessing Game!");
        
        // Game loop for multiple rounds
        while (true) {
            rounds++;
            int tries=0;
            int maxAttempts=5; // Set maximum attempts per round
            
            // Generate a random number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1;
            
            System.out.println("\n------------------------------------------");
            System.out.println("ROUND " +rounds);
            System.out.println("\nThis is your Round " + rounds + ": Try to guess the number between 1 to 100: ");
            
            boolean Correct = false;
            
            while (tries < maxAttempts) {
                tries++;
                
                // Prompt the user for their guess
                System.out.print("Attempt " + tries + " of " + maxAttempts + ". Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                // Check if the guess is correct
                if (userGuess == numberToGuess) {
                    System.out.println("CORRECT!! you guessed the right number in " + tries + " attempts.");
                    totalWins++;
                    Correct = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!Correct) {
                System.out.println("ohh sorry! you have used all your" + maxAttempts + " attempts. The number was: " + numberToGuess);
            }
            
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            
            if (playAgain.equalsIgnoreCase("no")) {
                break; // Exit the game loop
            }
        }
        
        System.out.println("\n GAME OVER");
        System.out.println("the number of attempts taken:" +rounds);
        System.out.println("the number of rounds you won: " +totalWins);
    
        
        scanner.close();
    }
}
