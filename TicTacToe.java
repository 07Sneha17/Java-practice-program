import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {

            printBoard();

            System.out.println("Player " + currentPlayer + ", enter position (1-9): ");
            int position = sc.nextInt();

            if (!placeMark(position)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (checkWinner()) {
                printBoard();
                System.out.println("Yeah! Player " + currentPlayer + " Wins!");
                gameOver = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a Draw!");
                gameOver = true;
            } else {
                switchPlayer();
            }
        }

        sc.close();
    }

    // Display Board
    static void printBoard() {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2)
                System.out.println("---|---|---");
        }

        System.out.println();
    }

    // Place X or O
    static boolean placeMark(int position) {

        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (position < 1 || position > 9)
            return false;

        if (board[row][col] == 'X' || board[row][col] == 'O')
            return false;

        board[row][col] = currentPlayer;
        return true;
    }

    // Switch Player
    static void switchPlayer() {
        if (currentPlayer == 'X')
            currentPlayer = 'O';
        else
            currentPlayer = 'X';
    }

    // Check Winner
    static boolean checkWinner() {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer)
                return true;
        }

        // Diagonal
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        // Anti-Diagonal
        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }

    // Check Draw
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O')
                    return false;
            }
        }
        return true;
    }
}