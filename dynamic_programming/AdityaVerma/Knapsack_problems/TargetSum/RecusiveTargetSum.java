package dynamic_programming.AdityaVerma.Knapsack_problems.TargetSum;

import java.util.*;

public class RecusiveTargetSum {
    public static void main(String[] args) {
        int[] arr = {-1,1,2,3};
        int n = arr.length;
        int target  = 1;
        List<String> list = new ArrayList<>();
        System.out.println(sumPlusMinus(arr, n,target,list,""));
        System.out.println(list);
    }
    static int sumPlusMinus(int[] arr,int n,int target,List<String> list,String s){
        if(n==0 && target==0){ // every element should be used
                list.add(s);
            return 1;
        }
        if(n==0){
            return 0;
        }
        return sumPlusMinus(arr, n-1, target-arr[n-1],list,s+","+(-arr[n-1]))+sumPlusMinus(arr, n-1, target+arr[n-1],list,s+","+(arr[n-1]));
    }
}
