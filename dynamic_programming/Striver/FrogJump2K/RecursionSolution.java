package dynamic_programming.Striver.FrogJump2K;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RecursionSolution {
    public static void main(String[] args) {
        // list = new ArrayList<>();
        int[] arr = {40 ,10 ,20 ,70 ,80 ,10 ,20 ,70 ,80 ,60};
        int n =arr.length;
        int k = 4;
        System.out.println(jumpK(arr, k, n-1));
    }
    public static int jumpK(int[] arr,int k,int n){
        if(n==0){
            return 0;
        }
        // int a = Integer.MAX_VALUE;
        // int b = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=k;i++){
            if(n-i>=0){
            list.add(jumpK(arr, k, n-i) + Math.abs(arr[n]-arr[n-i]));
            }
        }
        Collections.sort(list);
        int a = list.get(0);
        list.clear();
        // list.add(a);
        return a;
    }
}
