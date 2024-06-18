package dynamic_programming.Striver.MinimumSumOfAdjacentElement.MyCode;
import java.util.*;

public class Memoize {
    
    public static void main(String[] args) {
        int[] arr = {9,9,8,2,12};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Solution s = new Solution();
        System.out.println(s.maximumNonAdjacentSum(list));
    }
}

class Solution {
    static HashMap<Integer,Integer> map;
	public  int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        map = new HashMap<>();
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
        if(!b[n]){
            if(map.containsKey(n)){
                return map.get(n);
            }
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
           if(map.containsKey(n)){
            return map.get(n);
        }
           c = adj(list, n-1, b);
        }
        else{
            return adj(list, n-1, b);
        }
        // else{
        //     return list.get
        // }
        if(!map.containsKey(n)){
            map.put(n,Math.max(a,c));
        }
        return Math.max(a,c);
    }
}

