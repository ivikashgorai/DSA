package BackTracking.Real_backtracking;

public class Maze_all {
    public static void main(String[] args) {
        // let matrix is 3 X 3
        String empty = "";
        boolean[][] matrix = new boolean[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = true;
            }
        }
         all(empty,0,0,matrix);
    }
    static void all(String empty,int row,int col,boolean matrix[][]){
        if(row==2 && col ==2){
            System.out.println(empty);
            return;
        }
        if(!matrix[row][col]){
            return;
        }
       matrix[row][col] = false;

        if(row<2){
            all(empty+"D",row+1,col,matrix);
        }
        if(col<2){
            all(empty+"R", row, col+1,matrix);
        }
        if(col>0){
            
            all(empty+"L",row,col-1,matrix);
        }
        if(row>0){
            all(empty+"U",row-1,col,matrix);
        }
        // this is where the function is over
        // so before the function get removed also remove the changes made by that function
        matrix[row][col] = true;
    }
}
