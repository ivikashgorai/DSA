package recursion.pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,26,13,45,12};
        int n = arr.length-1;
        int index =0;
        int max = Integer.MIN_VALUE;
        int swapindex =-1;
        System.out.println(Arrays.toString(sort(arr,n,index,max,swapindex)));
    }
    static int[] sort(int[] arr,int n,int index,int max,int swapindex){
        if(n==0){
            return arr;
        }
        if(n>=index){ // as it will chek till last index
            if(arr[index]>max){
                max = arr[index];
                swapindex = index;
            }
          return sort(arr, n,index+1,max,swapindex);
        }
       else{
            int temp = arr[n];
            arr[n] = max;
            arr[swapindex] = temp;
       }
        return sort(arr,n-1,0,Integer.MIN_VALUE,-1);
       
    }
}
