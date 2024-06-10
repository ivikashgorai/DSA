package subset_subsequence_string.combination.subset;


import java.util.*;

public class WithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        comb(arr, list, 0);
        System.out.println(list);
    }
    static void comb(int[] arr, List<List<Integer>> list,int index){
        if(index==arr.length){
            return;
        }   
        
        int n = list.size();
        for(int i=0;i<n;i++){
            List<Integer> subs = new ArrayList<>(list.get(i));
            subs.add(arr[index]);
            list.add(subs);
        }
        comb(arr, list, index+1);
    }
}
