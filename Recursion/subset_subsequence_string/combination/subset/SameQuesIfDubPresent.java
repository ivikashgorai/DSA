package subset_subsequence_string.combination.subset;

import java.util.*;

public class SameQuesIfDubPresent {
    public static void main(String[] args) {
        int[] arr = { 1, 2,2,3,3}; // subset of this without recursion
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        System.out.print(ans);
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int end =0;
        int newSubAdded= 0;
        for (int i=0;i<arr.length;i++) { //[[], [1], [2], [1, 2], [2,2],[1,2,2]] // leave find final array then if duplicate found remove it;
            int start = 0;
            int n = outer.size();
            if(i>0 && arr[i]==arr[i-1]){
            start = n-newSubAdded;
            }
            newSubAdded = 0;
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
