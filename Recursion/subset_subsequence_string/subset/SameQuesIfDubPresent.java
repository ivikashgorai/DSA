package subset_subsequence_string.subset;

import java.util.*;

public class SameQuesIfDubPresent {
    public static void main(String[] args) {
        int[] arr = { 1, 2,2,3}; // subset of this without recursion
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = subset(arr);
            System.out.print(ans);
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int i=0;i<arr.length;i++) {
            int n = outer.size(); 
               int start =0;
            if(i>0 && arr[i]==arr[i-1]){
                start = (int)Math.pow(2,i-1);
            }
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
