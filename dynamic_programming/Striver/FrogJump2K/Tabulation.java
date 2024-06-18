package dynamic_programming.Striver.FrogJump2K;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tabulation {
    public static void main(String[] args) {
        int[] arr = {40 ,10 ,20 ,70 ,80 ,10 ,20 ,70 ,80 ,60};
        int n =arr.length;
        int k = 4;
        System.out.println(jumpT(arr, k, n-1));
        // System.out.println(dp);
    }
    public static int jumpT(int[] arr,int k,int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                list.add(dp[i-j] + Math.abs(arr[i] - arr[i-j]));
                }
            }
            Collections.sort(list);
            int a = list.get(0);
            list.clear();
            dp[i] = a;
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
