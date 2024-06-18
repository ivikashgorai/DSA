package dynamic_programming.AdityaVerma.LCS.LongestCommonSubsequence.PrintLCS;

public class Tabulation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abede";
        int m = s1.length();
        int n = s2.length();
       String ans = LongestCommonSubsTab(s1, s2, m, n);
       System.out.println(ans);
    }
    static String LongestCommonSubsTab(String s1,String s2,int m,int n){
        String[][] dp = new String[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0] = "";
        }
        for(int j=0;j<n+1;j++){
            dp[0][j] = "";
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
               dp[i][j] = dp[i-1][j-1]+""+s1.charAt(i-1);
             
        }
        else{
  
        //   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
          if(dp[i-1][j].length()>dp[i][j-1].length()){
            dp[i][j] = dp[i-1][j];
          }
          else{
            dp[i][j] = dp[i][j-1];
          }
                }
            }
        }
        return dp[m][n];

    }
}
