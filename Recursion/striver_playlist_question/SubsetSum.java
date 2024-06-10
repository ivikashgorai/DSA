package striver_playlist_question;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        List<Integer> list = new ArrayList<>();
        SubSum(list, 0, 0, arr);
        Collections.sort(list);
        System.out.println(list);
        
    }
    static void SubSum(List<Integer> list,int sum,int index,int[] arr){
        if(index==arr.length){
            list.add(sum);
            return;
        }
        SubSum(list, sum, index+1, arr);
        SubSum(list, sum+arr[index], index+1, arr);
    }
}
