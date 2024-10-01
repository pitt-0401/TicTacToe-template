/*
 * Created on 2026-10-08
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner;

    public TicTacToe(Scanner scanner) {
        this.scanner = scanner;
        // TODO: read player names and create both players
    }

    // Plays games until the players no longer want to play
    public void startGame() {
        // TODO: After each game, ask whether the players want to play again (yes/no)
        // and keep starting new games until they answer "no"
        // Hint: Write a helper method that keeps asking until the answer is valid
        playGame();
    }

    // Plays a single game on a fresh board until a player wins or the board is full
    private void playGame() {
        gameBoard = new GameBoard();
        currentPlayer = player1; // player1 starts every game
        boolean gameEnded = false;
        while (!gameEnded) {
            gameBoard.printBoard();
            promptPlayerMove();
            if (gameBoard.checkWin()) {
                gameBoard.printBoard();
                // TODO: System.out.println(/* current player name */ +" wins!");
                gameEnded = true;
            } else if (gameBoard.isFull()) {
                gameBoard.printBoard();
                System.out.println("The game ended in a tie!");
                gameEnded = true;
            } else {
                switchPlayers();
            }
        }
    }

    // Prompts the player to place a move and checks for its validity
    private void promptPlayerMove() {
        boolean validMove = false;
        // Keep asking until the player has placed a valid move
        /* Flow: 
         * promptPlayerMove() 
         *   -> requestMove()  reads a row and column from the user
         *   -> attemptMove()  checks the move and places it on the gameBoard
         */
        while (!validMove) {
            // TODO: read a move, try to place it, and update validMove

            if (!validMove) {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    // Read a move from the user as two integers separated by a space: row and column (e.g., 1 2)
    private int[] requestMove() {
        // TODO: Prompt the user until a valid row and column have been entered
        // Also apply proper error handling: non-integer input; keep prompting until the
        // user enters two numbers
        return null;
    }

    // Validate the move (bounds check) and attempts to place it on the board
    // true if the move is successfully placed; false otherwise
    private boolean attemptMove(int row, int col) {
        // TODO: Bounds check (move within GameBoard)

        // Delegate to GameBoard for "cell occupied?" logic
        // TODO: uncomment and fix the next line
        // return gameBoard.makeMove(/* TODO */);
        return false;
    }

    // Switch players
    // Sets the player that is not the currentPlayer as currentPlayer
    private void switchPlayers() {
        // TODO: Implement.
    }
}
