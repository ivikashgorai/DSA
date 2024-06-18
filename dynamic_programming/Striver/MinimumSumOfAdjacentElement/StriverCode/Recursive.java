

import java.util.ArrayList;

public class Recursive {
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Solution s = new Solution();
        System.out.println(s.MaxSum(list));
    }
}

class Solution {
	public  int MaxSum(ArrayList<Integer> nums) {
		// Write your code here.
        return Sol(nums, nums.size()-1);
	}
    public static int Sol(ArrayList<Integer> nums,int n){
        if(n==0){
            return nums.get(n);
        }
        if(n<0){
            return 0;
        }
        int pick = nums.get(n)+Sol(nums, n-2);
        int notPick = Sol(nums, n-1);
        return Math.max(pick,notPick);
    }
}