package dynamic_programming.AdityaVerma.MCM;
import java.util.*;

public class PalindromePartiotion {
    static int[][] dp;
    public static void main(String[] args) {
        // “a|babbbab|babab|a” is a palindrome partitioning of “ababbbabbababa” ans = 3
        String s = "ababbbabbababa";
        int n = s.length();
        char[] st = s.toCharArray();
        if(Ispalin(st, 0, n-1)==0){ // 0 is true
            System.out.println(0);
        }
        else{
            dp = new int[n+1][n+1];
            for(int i=0;i<n+1;i++){
                Arrays.fill(dp[i],-1);
            }
        System.out.println(MinimumCost(st, 0, n-1));
        }
    }
    static int MinimumCost(char[] arr, int i, int j) { // Memoize when necessary
        if (i >= j) {
            return 0;
        }
        if(Ispalin(arr, i, j)==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int tempAns = 0;
            int a  =0;
            int b = 0;
            if(dp[i][k]!=-1){
                a = dp[i][k];
            }
            else{
                a = MinimumCost(arr, i, k);
            }
            if(dp[k+1][j]!=-1){
                b = dp[k+1][j];
            }
            else{
            b = MinimumCost(arr, k+1, j);
            }
            tempAns = a+b+1;
           
            min = Math.min(tempAns, min);
        }
        dp[i][j] = min;
        return min;
    }
    static int Ispalin(char[] ch,int i,int j){
       while(i<=j){
        if(ch[i]!=ch[j]){
            return 1;
        }
        i+=1;
        j-=1;
       }
       return 0;
    }
}
