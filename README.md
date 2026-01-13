# Java Rock Paper Scissors - OOP Implementation

A robust, object-oriented implementation of the classic Rock Paper Scissors game built with Java. This project demonstrates the use of the Model-View-Controller (MVC) design pattern and dynamic rule definition.

## Features
Extensible Rule System: Rules are not hardcoded. Each Action (Rock, Paper, or Scissor) knows what it beats and what it loses to.

MVC Architecture: Clear separation between data (Model), logic (Controller), and execution (View).

Encapsulation: Uses private fields and public getters to maintain data integrity.

## Project Structure
The project is organized into the following packages:

**model**: Contains the core data structures.

Action.java: Defines a move and its relationships (wins/losses).

Hand.java: Represents a player's selection.

Result.java: An Enum representing WIN, LOSE, or DRAW.

**controller**:

GameController.java: Contains the logic to compare two Hand objects and determine the outcome.

**view**:

Game.java: The entry point that initializes the rules, sets up the players, and triggers the game.

## How it Works
Instead of checking if (rock && scissor), this application uses a Relationship-Based Logic:

Rule Definition: In the Game class, we define that Rock "wins against" Scissor and "loses against" Paper.

Comparison: The GameController checks if the first player's action's "win list" contains the second player's action.
