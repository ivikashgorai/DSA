package pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,26,13,45,12};
        int n = arr.length-1;
        int index =0;
        int max = Integer.MIN_VALUE;
        int swapindex =-1;
        sort(arr,n,index,max,swapindex);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int n,int index,int max,int swapindex){
        if(n==0){
            return;
        }
        if(n>=index){ // as it will chek till last index
            if(arr[index]>max){
                max = arr[index];
                swapindex = index;
            }
          sort(arr, n,index+1,max,swapindex);
        }
       else{
            int temp = arr[n];
            arr[n] = max;
            arr[swapindex] = temp;
       }
        sort(arr,n-1,0,Integer.MIN_VALUE,-1);
       
    }
}
