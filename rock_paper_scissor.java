 import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                 
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "y";

        while (playAgain.equals("y")) {
            // Player input
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            // Validate choice
            if (!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice!! Try again.");
                continue; // restart loop
            }

            // Computer choice
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // Determine result
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                     (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                     (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Won!!");
            } 
            else {
                System.out.println("Computer Won!!");
            }

            // Play again?
            System.out.print("Wanna play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
