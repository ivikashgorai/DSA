package BackTracking.Real_backtracking;

import java.util.Arrays;

public class Nkinght {
    public static void main(String[] args) {
        int n =3;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,n);
    }
    static void knight(boolean[][] board,int row,int col,int target){
        if(target==0){
            for(int i=0;i<board.length;i++){
                System.out.println(Arrays.toString(board[i]));
            }
            System.out.println();
            return;
        }
        if(row == board.length-1 && col == board.length){
            return;
        }
        if(col==board.length){
            knight(board, row+1, 0, target);
            return;
        }
            if(isSafe(board,row,col)){
                board[row][col] = true;
                knight(board, row,col+1,target-1);
                board[row][col] = false;
            }
            knight(board, row, col+1, target);//in case no place is safe just move in another row
    }
    static boolean isSafe(boolean[][] board, int row,int col){
        if(isValid(board, row-2, col-1)){
        if(board[row-2][col-1]){
            return false;
        }
    }
    if(isValid(board, row-2, col+1)){
         if(board[row-2][col+1]){
            return false;
        }
    }
    if(isValid(board, row-1, col+2)){
         if(board[row-1][col+2]){
            return false;
        }
    }
    if(isValid(board, row-1, col-2)){
         if(board[row-1][col-2]){
            return false;
        }
    }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }
}
