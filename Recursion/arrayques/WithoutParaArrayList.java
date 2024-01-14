package arrayques;

import java.util.*;
public class WithoutParaArrayList {
  public static void main(String[] args) {
   int[] nums = {1,2,3,0,5,3,4,9};
   
    System.out.println(sort(nums,0,3));
}
  public static ArrayList<Integer> sort(int[] arr,int index,int ans) {
    ArrayList<Integer> list = new ArrayList<>();
    if(index==arr.length){
      return list;
    }
    if(arr[index]==ans){
      list.add(index);
    }
    ArrayList<Integer> answerFromBelowCalls =  sort(arr,index+1,ans); // when base condition met it is returning the list
    list.addAll(answerFromBelowCalls);
    return list;
}
} 