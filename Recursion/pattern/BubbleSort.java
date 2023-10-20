package pattern;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,2,5,67,1,23,53};
        int n = arr.length-1;
        int index = 0;
        System.out.println(Arrays.toString(sort(arr, n, index)));
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] arr,int n, int index){ // this will return a array, also this willll change the original array
        if(n==0){
            return arr;
        }
        if(n>index){
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            return sort(arr,n,index+1);
        }
      
           return sort(arr,n-1,0);
        
    }

     public static void sort2(int[] arr,int n, int index){ // this will change the original array
        if(n==0){
            return;
        }
        if(n>index){
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            sort2(arr,n,index+1);
        }
      else{
           sort2(arr,n-1,0);
      }
    }
}