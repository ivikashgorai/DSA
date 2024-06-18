package dynamic_programming.Striver.MinimumSumOfAdjacentElement.MyCode;
import java.util.*;

//Question 

public class RecursionSolution {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,1 ,3 ,5 ,8 ,1 ,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Solution s = new Solution();
        System.out.println(s.maximumNonAdjacentSum(list));
    }
}

class Solution {
	public  int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        boolean[] b = new boolean[nums.size()]; // true matlb hi le sakte
        return adj(nums, nums.size()-1,b);
	}
    public static int adj(ArrayList<Integer> list,int n,boolean[] b ){
        if(n==0 && !b[n]){// {1 ,2 ,3 ,1 ,3 ,5 ,8 ,1 ,9};
            return list.get(0);
        }
        if(n==0){
            return 0;
        }
        int a =  0;
        int c = 0;
        if(!b[n]){ // taking boolean array is not a good way to ignore adjacent
            b[n]= true;
           if(n-1>=0){
            b[n-1] = true;
           }
           if(n+1<list.size()){
            b[n+1] = true;
           }
         a = (adj(list, n-1, b)+list.get(n)); 
         b[n]= false;
         if(n-1>=0){
            b[n-1] = false;
           }
           if(n+1<list.size()){
            b[n+1] = false;
           }
           c = adj(list, n-1, b);
        }
        // else{
        //     n = n-1;
        //     return 0;
        // }
        // else{
        //     return list.get
        // }
        return Math.max(a,c);
    }
}