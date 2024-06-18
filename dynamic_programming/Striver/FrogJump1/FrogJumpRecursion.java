package dynamic_programming.Striver.FrogJump1;

public class FrogJumpRecursion {
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
        if(n==0){
            return 0;
        }

        int a  =Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        // if(map.containsKey(n)){
        //     return map.get(n);
        // }
        a =  jump(arr, n-1)+Math.abs(arr[n]-arr[n-1]);
        if(n-2>=0){
            b = jump(arr, n-2)+ Math.abs(arr[n]-arr[n-2]);
        }
        return Math.min(a,b);

    }

}

