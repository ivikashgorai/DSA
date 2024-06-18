

import java.util.*;

public class Tabulation {
    public static void main(String[] args) {
        int[] arr = {5,6,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Solution2 s = new Solution2();
        System.out.println(s.MaxSum(list));
    }
}

class Solution2 {
	public  int MaxSum(ArrayList<Integer> nums) {
		// Write your code here.
        return Sol(nums, nums.size()-1);
	}
    public static int Sol(ArrayList<Integer> nums,int n){
        int[] dp = new int[n+1];
        dp[0] = nums.get(0);
       
        for(int i=1;i<=n;i++){
            int a =Integer.MIN_VALUE;
            if(i-2>=0){
            a  = nums.get(i)+dp[i-2];
            }
            else{
                a = nums.get(i)+0;
            }
            int b = dp[i-1];
            dp[i] = Math.max(a, b);
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
        // int pick = nums.get(n)+Sol(nums, n-2);
        // int notPick = Sol(nums, n-1);
        // return Math.max(pick,notPick);
    }
}