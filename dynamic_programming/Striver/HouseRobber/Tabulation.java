package dynamic_programming.Striver.HouseRobber;


import java.util.*;

public class Tabulation {
    public static void main(String[] args) {
        int[] arr = {1,2};
        Solution4 s = new Solution4();
        System.out.println(s.MaxSum(arr));
    }
}

class Solution4 {
	public  int MaxSum(int[] nums) {
		// Write your code here.
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return 0;
        }
       int[] nums1 = new int[nums.length-1]; // not have zero index of nums
       int[] nums2 = new int[nums.length-1]; // not have last index of nums
       int m =0;
       int n =0;
       for(int i=0;i<nums.length;i++){
        if(i!=0){
            nums1[m] = nums[i];
            m+=1; 
        }
        if(i!=nums.length-1){
            nums2[n] = nums[i];
            n+=1;
        }
       }
       int ans1 = Sol(nums1, nums1.length-1);
       int ans2 = Sol(nums2, nums2.length-1);
        return Math.max(ans1,ans2);	
        // return Sol(nums, nums.size()-1);
	}
    public static int Sol(int[] nums,int n){
        int[] dp = new int[n+1];
        dp[0] = nums[0];
       
        for(int i=1;i<=n;i++){
            int a =Integer.MIN_VALUE;
            if(i-2>=0){
            a  = nums[i]+dp[i-2];
            }
            else{
                a = nums[i]+0;
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
