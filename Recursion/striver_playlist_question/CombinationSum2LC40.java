package striver_playlist_question;

import java.util.*;

public class CombinationSum2LC40 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int  target = 8;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> store = new ArrayList<>();
        CombSum(list, target, arr, store,0);
        System.out.println(list);
    }
    static void CombSum(List<List<Integer>> list,int target,int[] arr,List<Integer> store ,int index){
        if(target==0){
            list.add(new ArrayList<>(store)); // reason why we create new ArrayList because agar hum direct list.add(store) karte toh store mein kuch bhi change hota toh yaha reflect karta isliye humlog naya arraylist banke copy karke daal re
            return;
        }
        if(index==arr.length){
            return;
        }
          for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(target-arr[i]>=0){
                store.add(arr[i]);
                CombSum(list, target-arr[i], arr, store, i+1);
                store.remove(store.size()-1);
            }
          }
            // CombSum(list, target, arr, store,index+1);
    }
}
