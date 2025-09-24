package backtracking.real_backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        char[][] board = {
                { '5', '3', '0', '0', '7', '0', '0', '0', '0' },
                { '6', '0', '0', '1', '9', '5', '0', '0', '0' },
                { '0', '9', '8', '0', '0', '0', '0', '6', '0' },
                { '8', '0', '0', '0', '6', '0', '0', '0', '3' },
                { '4', '0', '0', '8', '0', '3', '0', '0', '1' },
                { '7', '0', '0', '0', '2', '0', '0', '0', '6' },
                { '0', '6', '0', '0', '0', '0', '2', '8', '0' },
                { '0', '0', '0', '4', '1', '9', '0', '0', '5' },
                { '0', '0', '0', '0', '8', '0', '0', '7', '9' }
        };
        solve(board, 0, 0);
        // for (int i = 0; i < 9; i++) {
        //     System.out.println(Arrays.toString(board[i]));
        // }
    }

    static boolean solve(char[][] board,int row,int col){
        int n = board.length;

        if(row==board.length){
              for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        return true;
        }
        if(col==board.length){
            return solve(board, row+1, 0);
        }
        
        if(board[row][col]=='0'){
            for(int i=1;i<=9;i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i+'0');
                    if(solve(board, row, col+1)){
                        return true;
                    }
                    board[row][col] = '0';
                }
            }
        }
        else{
           return solve(board, row, col+1);
        }
        return false;
        
    }

    static boolean isSafe(char[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (num + '0')) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - (row % sqrt);
        int startCol = col - (col % sqrt);
        for (int i = 0; i < 3; i++) {
            if (board[startRow][startCol + i] == (char) (num + '0')) {
                return false;
            }
        }
        startRow += 1;
        for (int i = 0; i < 3; i++) {
            if (board[startRow][startCol + i] == (char) (num + '0')) {
                return false;
            }
        }
        startRow += 1;
        for (int i = 0; i < 3; i++) {
            if (board[startRow][startCol + i] == (char) (num + '0')) {
                return false;
            }
        }
        return true;
    }
}
