package ua.hillel.dolhykh.homeworks.tictactoe;

import java.util.Scanner;

public class TicTacToeVsPlayer {
    private char[][] board;
    private char currentPlayer;
    private int boardSize;
    private int winCondition;
    private String horizontalLine;
    private Scanner scanner;

    public TicTacToeVsPlayer(int boardSize, int winCondition) {
        this.boardSize = boardSize;
        this.winCondition = winCondition;
        board = new char[boardSize][boardSize];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        initializeBoard();
        generateHorizontalLine();
    }

    private void generateHorizontalLine() { // Метод в котором длина линии масштабируется в соответствии с размером
        // доски.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boardSize * 4 + 1; i++) {
            sb.append("—");
        }
        horizontalLine = sb.toString();
    }

    private void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        System.out.println(horizontalLine);
        for (int i = 0; i < boardSize; i++) {
            System.out.print("| ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(horizontalLine);
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j <= boardSize - winCondition; j++) {
                if (board[i][j] != '-' && checkRowCol(board[i][j], i, j, 0, 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i <= boardSize - winCondition; i++) {
                if (board[i][j] != '-' && checkRowCol(board[i][j], i, j, 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = 0; j <= boardSize - winCondition; j++) {
                if (board[i][j] != '-' && checkRowCol(board[i][j], i, j, 1, 1)) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = winCondition - 1; j < boardSize; j++) {
                if (board[i][j] != '-' && checkRowCol(board[i][j], i, j, 1, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkRowCol(char c, int row, int col, int rowInc, int colInc) {
        for (int i = 1; i < winCondition; i++) {
            if (board[row][col] != board[row + i * rowInc][col + i * colInc]) {
                return false;
            }
        }
        return true;
    }

    private void makeMove(int row, int col) {
        if (row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move! The cell is already occupied. Try again.");
            }
        } else {
            System.out.println("Invalid move! Row and column numbers should be between 1 and " + boardSize + ". Try again.");
        }
    }

    private int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int boardSize = 3; /*
             * Можно изменить число на любой другой размер доски (например 3x3, 4x4 и т.д)
             */

            int winCondition = 3;/*
             * Можно изменить число для изменения условия победы(например в доске 4х4 не
             *
             * 4 для победы, а 3 подряд)
             */
            TicTacToeVsPlayer game = new TicTacToeVsPlayer(boardSize, winCondition);

            while (!game.checkWin() && !game.isBoardFull()) {
                game.printBoard();
                System.out.println("Player " + game.currentPlayer + ", enter your move (row [1-" + boardSize + "] and column [1-" + boardSize + "]): ");

                int row = game.getInput("Row [1-" + boardSize + "]: ") - 1;
                int col = game.getInput("Column [1-" + boardSize + "]: ") - 1;

                game.makeMove(row, col);
            }

            game.printBoard();

            if (game.checkWin()) {
                char winner = (game.currentPlayer == 'X') ? 'O' : 'X';
                System.out.println("Congratulations! Player " + winner + " wins!");
            } else {
                System.out.println("It's a draw! The board is full.");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();

            while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) { /*
             * Добавил проверку на чтоб пользователь ввёл либо "Y" (буква "Y" в верхнем или
             * нижнем регистре), либо "N" (буква "N" в верхнем или нижнем регистре)
             */
                System.out.println("Invalid input! Please enter 'Y' to play again or 'N' to quit.");
                System.out.print("Do you want to play again? (Y/N): ");
                playAgain = scanner.next();
            }

            if (playAgain.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing Tic Tac Toe!");
                break;
            }

        } while (true);

        scanner.close();
    }
}

