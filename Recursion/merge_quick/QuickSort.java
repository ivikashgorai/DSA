package merge_quick;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-1,2,-8,-10};
        quick1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void quick1(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start<=end){// if already sorted ,it will not do any action thats why we prefer quick sort over merge sort
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick1(arr,low,end);
        quick1(arr, start, high);
    }
}
