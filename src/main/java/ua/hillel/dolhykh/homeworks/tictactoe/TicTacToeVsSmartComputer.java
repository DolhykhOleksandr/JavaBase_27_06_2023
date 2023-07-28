package ua.hillel.dolhykh.homeworks.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeVsSmartComputer {
    private char[][] board;
    private char currentPlayer;
    private int boardSize;
    private int winCondition;
    private int computerDifficulty;
    private String horizontalLine;
    private Scanner scanner;

    public TicTacToeVsSmartComputer(int boardSize, int winCondition, int computerDifficulty) {
        this.boardSize = boardSize;
        this.winCondition = winCondition;
        this.computerDifficulty = computerDifficulty;
        board = new char[boardSize][boardSize];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        initializeBoard();
        generateHorizontalLine();
    }

    private void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void generateHorizontalLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boardSize * 4 + 1; i++) {
            sb.append("-");
        }
        horizontalLine = sb.toString();
    }

    private void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            System.out.println(horizontalLine);
            for (int j = 0; j < boardSize; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(horizontalLine);
    }

    private boolean isBoardFull() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin(char player) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j <= boardSize - winCondition; j++) {
                if (checkRowCol(player, i, j, 0, 1)) {
                    return true;
                }
            }
        }

        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i <= boardSize - winCondition; i++) {
                if (checkRowCol(player, i, j, 1, 0)) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = 0; j <= boardSize - winCondition; j++) {
                if (checkRowCol(player, i, j, 1, 1)) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = winCondition - 1; j < boardSize; j++) {
                if (checkRowCol(player, i, j, 1, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkRowCol(char player, int row, int col, int rowInc, int colInc) {
        for (int i = 0; i < winCondition; i++) {
            if (board[row + i * rowInc][col + i * colInc] != player) {
                return false;
            }
        }
        return true;
    }

    private int minimax(char player, int depth) {
        if (checkWin('X')) {
            return -1;
        }
        if (checkWin('O')) {
            return 1;
        }
        if (isBoardFull()) {
            return 0;
        }

        if (depth == 0) {
            return evaluate();
        }

        int bestScore = (player == 'O') ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        List<int[]> emptyCells = getEmptyCells();
        for (int[] cell : emptyCells) {
            int row = cell[0];
            int col = cell[1];
            board[row][col] = player;

            if (player == 'O') {
                int score = minimax('X', depth - 1);
                bestScore = Math.max(bestScore, score);
            } else {
                int score = minimax('O', depth - 1);
                bestScore = Math.min(bestScore, score);
            }

            board[row][col] = ' ';
        }

        return bestScore;
    }

    private int evaluate() {
        int xCount = countChar('X');
        int oCount = countChar('O');
        return xCount - oCount;
    }

    private int countChar(char ch) {
        int count = 0;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == ch) {
                    count++;
                }
            }
        }
        return count;
    }

    private List<int[]> getEmptyCells() {
        List<int[]> emptyCells = new ArrayList<>();
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == ' ') {
                    emptyCells.add(new int[]{i, j});
                }
            }
        }
        return emptyCells;
    }

    private void makeComputerMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = null;

        List<int[]> emptyCells = getEmptyCells();
        for (int[] cell : emptyCells) {
            int row = cell[0];
            int col = cell[1];
            board[row][col] = 'O';

            int score = minimax('X', computerDifficulty);

            if (score > bestScore) {
                bestScore = score;
                bestMove = cell;
            }

            board[row][col] = ' ';
        }

        board[bestMove[0]][bestMove[1]] = 'O';
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

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize && board[row][col] == ' ';
    }

    public void play() {
        while (!checkWin('X') && !checkWin('O') && !isBoardFull()) {
            printBoard();

            if (currentPlayer == 'X') {
                int row, col;
                do {
                    System.out.println("Player X, enter your move (row [1-" + boardSize + "] and column [1-" + boardSize + "]): ");
                    row = getInput("Row [1-" + boardSize + "]: ") - 1;
                    col = getInput("Column [1-" + boardSize + "]: ") - 1;
                } while (!isValidMove(row, col));

                board[row][col] = currentPlayer;
            } else {
                System.out.println("Computer's turn:");
                makeComputerMove();
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        printBoard();

        if (checkWin('X')) {
            System.out.println("Congratulations! Player X wins!");
        } else if (checkWin('O')) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a draw! The board is full.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int boardSize = 4; // Можно изменить размер доски
            int winCondition = 4; // Можно изменить условия выиграша
            int computerDifficulty = 3; // Можно изменить сложность компьютера
            TicTacToeVsSmartComputer game = new TicTacToeVsSmartComputer(boardSize, winCondition, computerDifficulty);
            game.play();

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();

            while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
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
