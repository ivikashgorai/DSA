package dynamic_programming.Striver.NinjaTraining;

public class Tabulation {
    public static void main(String[] args) {
        int[][] arr = { { 1,2,5 },
                { 3, 1, 1 }};
        System.out.println(TableNinja(arr));
    }
    static int TableNinja(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row+1][col+1];
        for(int i=0;i<row;i++){
            arr[i][0] = 0;
        }
        for(int j=0;j<col;j++){
            arr[0][j] = 0;
        }
        int prevCol = -1;
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(j!=prevCol){
                int a = dp[i-1][j-1] + arr[i-1][j-1];
                prevCol = j;
                ans = Math.max(ans,a);
                dp[i][j] = ans;
                }
            }
        }
        return dp[row][col];




    }
}
