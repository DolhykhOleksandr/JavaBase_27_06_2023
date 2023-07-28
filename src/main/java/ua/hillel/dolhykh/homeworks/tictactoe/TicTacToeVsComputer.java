package ua.hillel.dolhykh.homeworks.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeVsComputer {
    private char[][] board;
    private char currentPlayer;
    private int boardSize;
    private int winCondition;
    private String horizontalLine;
    private Scanner scanner;

    public TicTacToeVsComputer(int boardSize, int winCondition) {
        this.boardSize = boardSize;
        this.winCondition = winCondition;
        board = new char[boardSize][boardSize];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        initializeBoard();
        generateHorizontalLine();
    }

    private void generateHorizontalLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boardSize * 4 + 1; i++) {
            sb.append("—");
        }
        horizontalLine = sb.toString();
    }

    private void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = ' ';
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
                if (board[i][j] == ' ') {
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
                if (board[i][j] != ' ' && checkRowCol(board[i][j], i, j, 0, 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i <= boardSize - winCondition; i++) {
                if (board[i][j] != ' ' && checkRowCol(board[i][j], i, j, 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = 0; j <= boardSize - winCondition; j++) {
                if (board[i][j] != ' ' && checkRowCol(board[i][j], i, j, 1, 1)) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= boardSize - winCondition; i++) {
            for (int j = winCondition - 1; j < boardSize; j++) {
                if (board[i][j] != ' ' && checkRowCol(board[i][j], i, j, 1, -1)) {
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
            if (board[row][col] == ' ') {
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

    private void makeComputerMove() {
        Random random = new Random();
        int row, col;

        do {
            row = random.nextInt(boardSize);
            col = random.nextInt(boardSize);
        } while (board[row][col] != ' ');

        makeMove(row, col);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int boardSize = 4; // Можно изменить размер доски
            int winCondition = 4; // Можно изменить условия выиграша
            TicTacToeVsComputer game = new TicTacToeVsComputer(boardSize, winCondition);

            while (!game.checkWin() && !game.isBoardFull()) {
                game.printBoard();

                if (game.currentPlayer == 'X') {
                    System.out.println("Player X, enter your move (row [1-" + boardSize + "] and column [1-" + boardSize + "]): ");

                    int row = game.getInput("Row [1-" + boardSize + "]: ") - 1;
                    int col = game.getInput("Column [1-" + boardSize + "]: ") - 1;

                    game.makeMove(row, col);
                } else {
                    System.out.println("Computer's turn:");
                    game.makeComputerMove();
                }
            }

            game.printBoard();

            if (game.checkWin()) {
                char winner = (game.currentPlayer == 'X') ? 'O' : 'X';
                if (winner == 'X') {
                    System.out.println("Congratulations! Player X wins!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else {
                System.out.println("It's a draw! The board is full.");
            }

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






