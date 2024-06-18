package dynamic_programming.Striver.FrogJump1;

import java.util.*;

public class FrogJumpTabulation { // coding ninja
    public static void main(String[] args) {
        int[] arr = {7 ,4 ,4 ,2 ,6 ,6 ,3 ,4 };
        Solution s = new Solution();
        System.out.println(s.frogJump(arr.length,arr));
    }
}
class Solution {
    public  int frogJump(int n, int arr[]) {

        // Write your code here..
        return jump(arr, n-1);


       
    }
    public static int jump(int[] arr,int n){
       int[] dp = new int[n+1];
       dp[0] = 0;

        int a  =Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        // if(map.containsKey(n)){
        //     return map.get(n);
        // }
        for(int i=1;i<=n;i++){
        a = dp[i-1] +Math.abs(arr[i]-arr[i-1]);
        if(i-2>=0){
            b = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
        }
        dp[i] = Math.min(a, b);
    }
    return dp[n];
    }

}
