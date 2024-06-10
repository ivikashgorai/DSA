package striver_playlist_question;

import java.util.*;

public class CombinationSumLC39 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int  target = 7;
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
            if(target-arr[index]>=0){
                store.add(arr[index]);
                CombSum(list, target-arr[index], arr, store,index);  // index+1 isiliye nhi kar rahe kyuki har element ko kitni bhi baar le sakte hai
                store.remove(store.size()-1);
            }
            CombSum(list, target, arr, store,index+1);
    }
}
