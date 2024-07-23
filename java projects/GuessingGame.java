import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        int random, guess, attempts;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(100) + 1;
        attempts = 1;
        System.out.println("Let's think about a number between 0 & 100, what do you think it is?");
        guess = keyboard.nextInt();
        int prevGuess = guess; // Store the previous guess
        while (guess != random) {
            if (guess < random) {
                System.out.println("Higher!");
            } else if (guess > random) {
                System.out.println("Lower!");
            }
            attempts += 1;
            prevGuess = guess; // Update the previous guess
            guess = keyboard.nextInt();
        }
        System.out.println(random + " is the correct answer and it took you " + attempts + " attempts to guess it");
    }
}