package com.codsoft;
import java.util.*;

public class GuessGame {

    public Random r = new Random();
    public int guess;
    public int score = 0;
    public int total_attempts = 0;
    public int high_score = 0;
    public String choice;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\tWelcome to the guessing game!");
        System.out.println("You will get 5 attempts to guess the correct number.");
        System.out.println("Enter 'start' to start the game or 'stop' to stop the game.");
        choice = sc.nextLine().toLowerCase();
        run();
    }

    public void run() {
        if (choice.equals("stop")) {
            end();
            return;
        }

        while (choice.equals("start")) {
            int rand = r.nextInt(100) + 1;
            int attempts = 5;
            total_attempts = 0;
            System.out.println("\nGame Started! Try to guess the number between 1 and 100.");

            while (attempts > 0) {
                System.out.println("Attempts left: " + attempts);
                System.out.print("Enter a number: ");
                
                try {
                    guess = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    continue;
                }

                total_attempts++;

                if (guess == rand) {
                    System.out.println("Correct Guess :)");
                    win();
                    break;
                } else if (guess > rand) {
                    System.out.println("Guessed Number is too High");
                } else if(guess < rand){
                    System.out.println("Guessed Number is too Low");
                }

                attempts--;

                if (attempts == 0) {
                    System.out.println("Oops! Out of Attempts. You lost :(");
                    loose();
                }
            }

            break;
        }
    }

    public void win() {
        score++;
        System.out.println("Congratulations! You Won!");
        score = (1000/total_attempts)*100;
        System.out.println("Your Score: " + score);
        System.out.println("You guessed the number in " + total_attempts + " attempts.");
        playAgain();
    }

    public void loose() {
        System.out.println("The correct number was: " + (r.nextInt(100) + 1));
        playAgain();
    }

    public void playAgain() {
        System.out.println("Enter 'y' to play again or 'n' to stop:");
        String ch = sc.nextLine().toLowerCase();

        if (ch.equals("y")) {
            start();
        } else {
            end();
        }
    }

    public void end() {
        System.out.println("\tThank you for playing!");
        sc.close();
    }
}
