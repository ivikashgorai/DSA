

public class Tabulation {
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";
        int m = s1.length();
        int n = s2.length();
       int ans = LongestCommonSubsTab(s1, s2, m, n);
       System.out.println(ans);
    }
    static int LongestCommonSubsTab(String s1,String s2,int m,int n){
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<n+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
        if(s1.charAt(i-1)==s2.charAt(j-1) ){
               dp[i][j] = 1+ dp[i-1][j-1];
             
        }
        else{
  
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

                }
            }
        }
        return dp[m][n];

    }
}
