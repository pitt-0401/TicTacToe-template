/*
 * Created on 2026-10-08
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe(scanner);
        ticTacToe.startGame();

        scanner.close();
    }
}
