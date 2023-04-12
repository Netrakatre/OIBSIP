import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 100;
        int maxTries = 10;
        int totalRounds = 5;
        int totalScore = 0;

        System.out.println("Welcome to the number guessing game!");

        for (int round = 1; round <= totalRounds; round++) {
            int numberToGuess = random.nextInt(maxNumber) + 1;
            int currentScore = maxTries;

            System.out.println("Round " + round + ": I'm thinking of a number between 1 and " + maxNumber);
            System.out.println("You have " + maxTries + " tries to guess it. Let's begin!");

            for (int tryNumber = 1; tryNumber <= maxTries; tryNumber++) {
                System.out.print("Guess #" + tryNumber + ": ");
                int guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations, you guessed the number in " + tryNumber + " tries!");
                    currentScore -= tryNumber - 1;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                currentScore--;
            }

            System.out.println("Round " + round + " score: " + currentScore);
            totalScore += currentScore;
        }

        System.out.println("well tried! Your total score is " + totalScore);
    }
}
