/*
 * Created on 2026-10-08
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class GameBoard {
    private /* TODO type of gameboard */ board;

    // 'final' means that SIZE is a constant and cannot be changed after initialization
    // Java convention: Constants in Java are written in all upper-case letters
    // The size indicates the gameboard size (3x3)
    public static final int SIZE = 3;

    public GameBoard() {
        // TODO: The constructor should initialize the board
        // and set an empty space character, e.g., '-'
    }

    // makeMove places the symbol in the given cell if that cell is still empty
    // Returns true if the symbol was placed; false if the cell is already occupied
    public boolean makeMove(int row, int col, char symbol) {
        // TODO: place symbol (check if cell is occupied)
        return false;
    }

    // Checks if a player has placed three symbols in a row, column, or diagonal
    // If yes, that player has won
    public boolean checkWin() {
        // Hint: Define additional methods to keep your code organized and readable!
        // TODO: Check rows

        // TODO: Check columns

        // TODO: Check diagonals

        return false;
    }

    // Checks if every cell of the gameboard is occupied
    // (TicTacToe checks for a win first, so a full board without a winner is a draw)
    public boolean isFull() {
        // TODO
        return true;
    }

    public void printBoard() {
        // TODO: implement
        System.out.println("Should print out the game board's current status.");
    }
}
