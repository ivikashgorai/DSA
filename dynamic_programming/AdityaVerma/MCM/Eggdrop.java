package dynamic_programming.AdityaVerma.MCM;

import java.util.*;

public class Eggdrop {
    public static void main(String[] args) {
        int f = 2;
        int egg = 2;
        int[][] dp  = new int[f+1][egg+1];
        for(int i=0;i<f+1;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(egg(f,egg,dp));
    }
    static int egg(int f,int egg,int[][] dp){
        if(egg==1){
            return f;
        }
        if(f==0 || f==1){
            return f;
        }
        if(dp[f][egg]!=-1){
            return dp[f][egg];
        }
        int ans  = Integer.MAX_VALUE;
        for(int k = 1;k<=f;k++){
           int temp = 1+ Math.max(egg(k-1, egg-1,dp),egg(f-k, egg,dp)); // worst case nikalna hai
            ans = Math.min(temp,ans); // phir worst case mein se sabse aacha nikalna hai
        }
        dp[f][egg] = ans;
        return ans;
    }
}
