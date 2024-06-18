package dynamic_programming.AdityaVerma.LCS.LongestCommonSubsequence;
import java.util.*;

public class Memoize {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abe";
        int m = s1.length();
        int n = s2.length();
        int[][] dp =  new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }

        System.out.println(LongestCommonSubsMemo(s1, s2,s1.length(),s2.length(),dp));
    }
    static int LongestCommonSubsMemo(String s1,String s2,int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m-1][n-1]!=-1){
            return dp[m-1][n-1];
        }
       
        if(s1.charAt(m-1)==s2.charAt(n-1)){
              return dp[m-1][n-1] = 1+ LongestCommonSubsMemo(s1, s2, m-1, n-1,dp);
             
        }
        else{
         return dp[m-1][n-1] = Math.max(LongestCommonSubsMemo(s1, s2, m-1, n,dp),LongestCommonSubsMemo(s1, s2, m, n-1,dp));

                }

    }
}
