import java.util.Random;
import java.util.Scanner;

class Numberguess {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the Random Number Guessing Game!");

        do {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
        } while (numberOfTries <5);
        System.out.println("over");

        scanner.close();
    }
}

