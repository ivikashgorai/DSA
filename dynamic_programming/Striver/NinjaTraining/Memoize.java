package dynamic_programming.Striver.NinjaTraining;

import java.util.HashMap;

public class Memoize {
    public static void main(String[] args) {
        int[][] arr = { { 10,40,70 },
                { 20, 50, 80 },
            {30,60,90}};
        int n = arr.length;
        int[][] dp = new int[n+1][arr[0].length+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<arr[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(NinjaMemo(arr, n , -1,dp));
    }
    static int NinjaMemo(int[][] arr, int row, int prevCol,int[][] dp) {
        if (row == 0) { // empty array
            return 0;
        }
        if(prevCol!=-1){
        if(dp[row-1][prevCol]!=-1){
            return dp[row-1][prevCol];
        }
    }
        int a = Integer.MIN_VALUE;
        // int b = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int col = 0; col < arr[0].length; col++) {
            if (prevCol != col) {
                a = NinjaMemo(arr, row - 1, col,dp) + arr[row-1][col];
                // b = Ninja2(arr, row-1, -1);
                ans = Math.max(ans,a);

            }
        } 
        // System.out.print(Math.max(a, b) + " ");
        if(prevCol!=-1){
        dp[row-1][prevCol] = ans;
        }
        return ans;
    }
}
