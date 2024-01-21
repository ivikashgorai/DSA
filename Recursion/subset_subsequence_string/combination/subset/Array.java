package subset_subsequence_string.combination.subset;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // subset of this without recursion
        ArrayList<ArrayList<Integer>> ans = subset(arr);
            System.out.print(ans);
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int i=0;i<arr.length;i++) {
            int n = outer.size(); // gives size of number of internal arraylist inside therefore in 1D arraylist it will give number of element inside the arraylist
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));//outer.get(i) will give a copy to internal named list from ith list of outer
              //  jaise pehle iteration ke baad jab j=1 hoga toh i =0 mein khali dabba hoga usme 3 add hoga => [3], phir i=1 ka dabba hoga usme phir 3 add hoga => [1,3]
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
