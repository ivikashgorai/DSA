package backtracking.real_backtracking;
import java.util.*;

public class KnightTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = -1;
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        mat[0][0] = 0;
        knight(n, list, 0, 0, 1, mat);
    //    System.out.println(list);
        


    }
    static void knight(int n,List<List<Integer>> list,int row,int col,int num,int[][] mat){
        if(num==(n*n)){
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
           }
           System.out.println();
        }
        if(isSafe(row-1,col+2,n) && mat[row-1][col+2]==-1){
            mat[row-1][col+2] = num;
            knight(n, list, row-1, col+2, num+1, mat);
            mat[row-1][col+2] = -1;
          }
          if(isSafe(row+1,col+2,n) && mat[row+1][col+2]==-1){
           mat[row+1][col+2] = num;
           knight(n, list, row+1, col+2, num+1, mat);
           mat[row+1][col+2] = -1;
          }
          if(isSafe(row-1,col-2,n) && mat[row-1][col-2]==-1){
            mat[row-1][col-2] = num;
            knight(n, list, row-1, col-2, num+1, mat);
            mat[row-1][col-2] = -1;
          }
          if(isSafe(row+1,col-2,n) && mat[row+1][col-2]==-1){
            mat[row+1][col-2] = num;
            knight(n, list, row+1, col-2, num+1, mat);
            mat[row+1][col-2] = -1;
          }
          if(isSafe(row-2,col+1,n) && mat[row-2][col+1]==-1){
            mat[row-2][col+1] = num;
            knight(n, list, row-2, col+1, num+1, mat);
            mat[row-2][col+1] = -1;
          }
          if(isSafe(row-2,col-1,n) && mat[row-2][col-1]==-1){
            mat[row-2][col-1] = num;
            knight(n, list, row-2, col-1, num+1, mat);
            mat[row-2][col-1] = -1;
          }
          if(isSafe(row+2,col+1,n) && mat[row+2][col+1]==-1){
            mat[row+2][col+1] = num;
            knight(n, list, row+2, col+1, num+1, mat);
            mat[row+2][col+1] = -1;
          }
          if(isSafe(row+2,col-1,n) && mat[row+2][col-1]==-1){
            mat[row+2][col-1] = num;
            knight(n, list, row+2, col-1, num+1, mat);
            mat[row+2][col-1] = -1;
          }
    }
    static boolean isSafe(int row,int col,int len ){
        if(row>=0 && row<len && col>=0 && col<len){
          return true;
        }
        return false;
      }
}
