package BackTracking.Real_backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board =  {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solve(board);
        for(int i=0;i<9;i++){
            System.out.println(Arrays.toString(board[i]));
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row =-1;
        int col =-1;

        boolean emptyleft = true;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0)
                {
                    row = i;
                    col =j;
                    emptyleft = false;
                    break;
                }
            }
            if(emptyleft == false){
                break;
            }
        }
        if(emptyleft==true){
            return true;
        }
        for(int number =1; number<=9;number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col]= 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
         for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int startRow = row - (row%sqrt);
        int startCol = col - (col%sqrt); 
        for(int i=0;i<3;i++){
            if(board[startRow][startCol+i]==num){
                return false;
            }
        }
        startRow+=1;
         for(int i=0;i<3;i++){
            if(board[startRow][startCol+i]==num){
                return false;
            }
        }
        startRow+=1;
         for(int i=0;i<3;i++){
            if(board[startRow][startCol+i]==num){
                return false;
            }
        }
        return true;
    }
}
