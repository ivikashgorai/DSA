
import java.util.*;


public class Memoize {
    public static void main(String[] args) {
        int[] arr = {5,6,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Solution1 s = new Solution1();
        System.out.println(s.MaxSumMemo(list));
    }
}

class Solution1 {
    static HashMap<Integer,Integer> map;
	public  int MaxSumMemo(ArrayList<Integer> nums) {
        map = new HashMap<>();
		// Write your code here.
        return Sol(nums, nums.size()-1);
	}
    public static int Sol(ArrayList<Integer> nums,int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0){
            return nums.get(n);
        }
        if(n<0){
            return 0;
        }
        int pick = nums.get(n)+Sol(nums, n-2);
        int notPick = Sol(nums, n-1);
        if(!map.containsKey(n)){
            map.put(n, Math.max(pick,notPick));
        }
        return Math.max(pick,notPick);
    }
}