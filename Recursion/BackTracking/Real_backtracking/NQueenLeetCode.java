package backtracking.real_backtracking;

import java.util.ArrayList;

public class NQueenLeetCode {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        ArrayList<ArrayList<String>> list = new ArrayList<>();
       System.out.println(queen(board,0,list));
    }
    static ArrayList<ArrayList<String>>  queen(boolean[][] board,int row,ArrayList<ArrayList<String>> list){
        if(row==board.length){
            list.add(new ArrayList<>());
               String s = "";
             for(int i=0;i<board.length;i++){
                s="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                  s +="Q";
                }
                else{
                    s+=".";
                }
            }
             list.get(list.size()-1).add(s);
        }
            return list;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
            board[row][col] = true;
            queen(board, row+1,list);
            board[row][col] = false;
            }
        }
        return list;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int rightDiagonal = Math.min(row, board.length-1-col);
        for(int i=1;i<=rightDiagonal;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
         int leftDiagonal = Math.min(row, col);
        for(int i=1;i<=leftDiagonal;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        return true;
    }
    // static void display(boolean board[][]){
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board.length;j++){
    //             if(board[i][j]){
    //                 System.out.print("Q ");
    //             }
    //             else{
    //                 System.out.print(". ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
