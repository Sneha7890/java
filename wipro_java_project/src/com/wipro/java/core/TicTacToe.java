package com.wipro.java.core;

import java.util.Scanner;

public class TicTacToe {
    
    // Define the game board as a 3x3 2D array
    private static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    // Keep track of the current player
    private static char currentPlayer = 'X';
    
    // Create a scanner to read player inputs
    private static Scanner scanner = new Scanner(System.in);
    
    // Main function to start the game
    public static void main(String[] args) {
        // Display the initial empty board
        printBoard();
        
        // Loop to take turns until there's a winner or draw
        while (true) {
            System.out.println("Player " + currentPlayer + ", it's your turn!");
            
            // Get the player's move (row and column)
            int row = -1;
            int col = -1;
            
            while (true) {
                System.out.print("Enter row (1-3): ");
                row = scanner.nextInt() - 1;  // Input is 1-3, so subtract 1 for array index
                System.out.print("Enter column (1-3): ");
                col = scanner.nextInt() - 1;  // Input is 1-3, so subtract 1 for array index
                
                // Check if the input is within bounds and the cell is empty
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    break;  // Valid move
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            }
            
            // Make the move
            board[row][col] = currentPlayer;
            
            // Print the updated board
            printBoard();
            
            // Check if the current player has won
            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;  // End the game
            }
            
            // Check if it's a draw
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;  // End the game
            }
            
            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    
    // Function to print the board
    private static void printBoard() {
        System.out.println("-----");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-----");
        }
    }
    
    // Function to check if the current player has won
    private static boolean checkWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            // Check columns
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        
        return false;
    }
    
    // Function to check if the board is full (draw condition)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;  // Found an empty space, so the board is not full
                }
            }
        }
        return true;  // No empty spaces, board is full
    }
}

