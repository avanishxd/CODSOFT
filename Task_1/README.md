# Number Guessing Game - JAVA

## Overview

This is a simple console-based number guessing game implemented in Java. The game challenges players to guess a randomly generated number between 1 and 100 within a limited number of attempts. Players receive feedback on whether their guess is too high or too low and can choose to play multiple rounds.

## Features

- **Play the Game**: Players have 5 attempts to guess the correct number.
- **Feedback**: The game provides feedback if the guess is too high or too low.
- **Score Calculation**: Scores are calculated based on the number of attempts taken to guess correctly.
- **Play Again**: Players can choose to play again or stop after each round.
- **Game End**: The game shows the correct number if the player fails to guess within the given attempts.

## Usage

1. **Compile and Run**:
   - Ensure you have Java Development Kit (JDK) installed on your machine.
   - Compile the Java files:
     ```sh
     javac com/codsoft/GuessGame.java
     javac com/codsoft_test/GuessGame_Test.java
     ```
   - Run the game:
     ```sh
     java com.codsoft_test.GuessGame_Test
     ```

2. **Game Instructions**:
   - Upon starting the game, enter `start` to begin or `stop` to exit.
   - You will be given 5 attempts to guess the number.
   - After each guess, you'll be informed if your guess is too high or too low.
   - If you guess correctly, you'll see your score and be asked if you want to play again.
   - If you run out of attempts, the correct number will be revealed, and you'll be given the option to play again or stop.

## Example

Here’s an example of how the game might look:

Welcome to the guessing game!
You will get 5 attempts to guess the correct number.
Enter 'start' to start the game or 'stop' to stop the game.
Enter choice: start

Game Started! Try to guess the number between 1 and 100.
Attempts left: 5
Enter a number: 50

Guessed Number is too High

Attempts left: 4
Enter a number: 25

Guessed Number is too Low

Attempts left: 3
Enter a number: 37

Correct Guess :)
Congratulations! You Won!
Your Score: 285
You guessed the number in 3 attempts.

Enter 'y' to play again or 'n' to stop:

## Requirements

- Java Development Kit (JDK) 8 or higher.


## Contact

For any questions or feedback, please reach out to email - avanishmore25@gmail.com
