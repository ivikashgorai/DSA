package practice_ques.bit_manipulation;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int t = (int)Math.pow(2, n);
        ArrayList<Integer>  list = new ArrayList<>();
        subset.add(list);
        for(int i=1;i<t;i++){
            ArrayList<Integer>  list1 = new ArrayList<>();
            int count = 0;
            int j = i;
            while(j!=0){
                if((j&1)==1){
                    list1.add(arr[count]);
                }
                count+=1;
                j = j>>1;
            }
            subset.add(list1);
        }
        System.out.println(subset);
    }
}
