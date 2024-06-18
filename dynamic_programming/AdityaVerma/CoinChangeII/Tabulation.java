

public class Tabulation {
    public static void main(String[] args) {
     int[] coins = {1,2,3};
     int n = coins.length;
     int Sum = 5;
     int ans =  coinTab(coins, n, Sum);
     System.out.println(ans);
    }
    static int coinTab(int[] coins,int n,int W){
        int[][] dp =  new int[n+1][W+1];

        //intialization from base condition // see recursive code
        
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j] = Integer.MAX_VALUE-1;
        }
        for(int i=1;i<W+1;i++){
            if(i%coins[0]==0){
                dp[1][i] = i/coins[0];
            }
            else{
                dp[1][i] = Integer.MAX_VALUE-1;
            }
        }
       


       for(int i=1;i<n+1;i++){
        for(int j = 1;j<W+1;j++){
           if(j-coins[i-1]>=0){
            dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
           }
           else{
            dp[i][j] = dp[i-1][j];
           }
        }
       }
    //    System.out.println(dp[n][W]);
       return dp[n][W];
    }
}
