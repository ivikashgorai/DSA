package backtracking.real_backtracking;

import java.util.Arrays;

public class Maze_all_part2 {
    public static void main(String[] args) {
        // let matrix is 3 X 3
        String empty = "";
        boolean[][] matrix = new boolean[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = true;
            }
        }
        int step =1;
        int[][] path = new int[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                path[i][j] = 0;
            }
        }
         all(empty,0,0,matrix,step,path);
    }
    static void all(String empty,int row,int col,boolean matrix[][],int step,int[][] path){
        if(row==2 && col ==2){
              path[row][col] = step;
            System.out.println(empty);
           for (int[] is : path) {
            System.out.println(Arrays.toString(is));
           }
            return;
        }
        if(!matrix[row][col]){
            return;
        }
       matrix[row][col] = false;
        path[row][col] = step;
        if(row<2){
            all(empty+"D",row+1,col,matrix,step+1,path);
        }
        if(col<2){
            all(empty+"R", row, col+1,matrix,step+1,path);
        }
        if(col>0){
            
            all(empty+"L",row,col-1,matrix,step+1,path);
        }
        if(row>0){
            all(empty+"U",row-1,col,matrix,step+1,path);
        }
        // this is where the function is over
        // so before the function get removed also remove the changes made by that function
        path[row][col] =0;
        matrix[row][col] = true;
    }
}
