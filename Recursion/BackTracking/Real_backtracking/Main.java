package backtracking.real_backtracking;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        nQueen(board, 0);
    }
    public static void nQueen(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return;
        }
        for(int col=0;col<board[0].length;col++)
        {
           if(isSafe(board,row,col)){
            board[row][col] = true;
            nQueen(board, row+1);
            board[row][col] = false;
           }
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        //check for up straight col
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // check left diagonal
        int lr = row;
        int lc = col;
        while(lr>=0 && lc>=0){
            if(board[lr][lc]){
                return false;
            }
            lr-=1;
            lc-=1;
        }
         // check right diagonal
    lr = row;
        lc = col;
        while(lr>=0 && lc<board[0].length){
            if(board[lr][lc]){
                return false;
            }
            lr-=1;
            lc+=1;
        }
        return true;
    }
    public static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
