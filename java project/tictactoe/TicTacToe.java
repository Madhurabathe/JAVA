import java.util.Scanner;

public class TicTacToe{
    private static char[][] board = new char[3][3]; 
    private static char currentPlayer = 'X';      

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Main  loop
    private static void playGame() {
        boolean gameRunning = true;

        while (gameRunning) {
            displayBoard();
            playerMove();
            gameRunning = !checkWin(); //win
            if (gameRunning) {
                gameRunning = !checkDraw(); // draw
            }
            if (gameRunning) {
                switchPlayer(); 
            }
        }
        displayBoard();
    }

    // Display 
    private static void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
                if (j < 2) System.out.print(" |"); 
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---"); 
        }
    }

    
    private static void playerMove() {
        Scanner s= new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("\nPlayer " + currentPlayer + ", enter your move (row and column: 1-3):");
            row = s.nextInt() - 1; 
            col = s.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    
    private static boolean checkWin() {
       
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        return false;
    }
    private static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        System.out.println("It's a draw!");
        return true;
    }

   
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
