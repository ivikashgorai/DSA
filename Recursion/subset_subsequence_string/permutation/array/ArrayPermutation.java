package subset_subsequence_string.permutation.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        SubPerm(arr, 0,list);
        System.out.println(list);

    }
    public static void SubPerm(int[] arr,int index,ArrayList<ArrayList<Integer>> list){
        if(index==arr.length-1){
            ArrayList<Integer> per = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                per.add(arr[i]);
            }
            list.add(per);
            return;
        }
        for(int i=index;i<arr.length;i++){ // question copy
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            SubPerm(arr, index+1, list); 
        }
    }
}
