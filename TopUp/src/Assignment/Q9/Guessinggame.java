package Assignment.Q9;

import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        int secretNumber;
        secretNumber = (int) (Math.random() * 1999 + 1);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter a guess (1-2000): ");
            guess = keyboard.nextInt();
            if (guess == secretNumber)
                System.out.println("Bingo Bingo! ");
            else if (guess < secretNumber)
                System.out
                        .println("Guess a Bigger Number");
            else if (guess > secretNumber)
                System.out
                        .println("Guess a Smaller Number");
        } while (guess != secretNumber);
    }
}