# Hangman Game

## Description
This Hangman game is a simple console-based Java application where players can guess letters to uncover a hidden word. The game features different difficulty levels and keeps track of player stats such as games won and games played.

## Features
- Three difficulty levels: Easy, Medium, and Hard.
- Randomly selected words based on difficulty level.
- Player stats tracking: games won and games played.
- Hangman drawing for visual representation of strikes.
- Error handling for invalid user input.
- Object-Oriented Programming (OOP) implementation with multiple classes.

## Getting Started
To run the Hangman game, make sure you have Java installed on your machine. Then, follow these steps:
1. Clone this repository to your local machine.
2. Navigate to the directory containing the Java files (`App.java`, `Player.java`, `HangMan.java`, and `Words.java`).
3. Compile the Java files using the following command:
    ```
    javac App.java
    ```
4. Run the compiled program using the following command:
    ```
    java App
    ```
5. Follow the prompts to play the game.

## How to Play
1. Choose the difficulty level by entering `1`, `2`, or `3` for Easy, Medium, or Hard respectively.
2. Guess letters to uncover the hidden word.
3. For each incorrect guess, a part of the hangman drawing will be displayed.
4. Win the game by correctly guessing all the letters in the word or lose by accumulating too many incorrect guesses.

## License
This project is licensed under the [MIT License](LICENSE).
