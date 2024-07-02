package dynamic_programming.Striver.DpOnGrids;

public class MinimunPathSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = {{1,2},
    {1,1}};
        System.out.println(s.minPathSum(grid));
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        return min(grid,0,0);
    }
    static int min(int[][] grid,int row,int col){
        if(row==grid.length-1 && col==grid[0].length-1){
            return grid[row][col];
        }
        int a  = Integer.MAX_VALUE;
        int b  =Integer.MAX_VALUE; 
        // int temp =  a+b;
        // int ans  = Integer.MAX_VALUE;
        if(row+1<=grid.length-1){
            a = grid[row][col] + min(grid,row+1,col);
        }
        if(col+1<=grid[0].length-1){
            b = grid[row][col] + min(grid,row,col+1);
        }
          
        return Math.min(a,b);
    }
}
