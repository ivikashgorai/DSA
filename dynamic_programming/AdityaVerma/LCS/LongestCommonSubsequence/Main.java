import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.lengthOfLIS(new int[] {4,10,4,3,8,9}));
    }
}
class Solution1 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
        if(i==0){
            list.add(nums[i]);
        }
        else if(list.get(list.size()-1)<nums[i]){
            list.add(nums[i]);
        }
        else{
                int a  = binary(list,nums[i]); // gives index of element if have else give just bigger than that
            list.set(a,nums[i]);
        }
       }
       return list.size();
      
    }
   static int binary(ArrayList<Integer> list,int target){
    int start = 0;
    int end = list.size()-1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(list.get(mid)>target){
            end = mid-1;
        }
        else if(list.get(mid)<target){
            start = mid+1;
        }
        else{
            return mid;
        }
    }
    return start;
   }
}