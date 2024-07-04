package heaps.implement_kunal.ArrayAlreadyGiven;

import java.util.Arrays;

public class Heapify {
    public static void main(String[] args) {
        int[] arr = {12,7,9,10,5,6,2};
        // int n = arr.length;
       for(int i=arr.length/2 -1 ;i>=0;i--){
        HeapifyDownHeap(arr, i);
       }
        System.out.println(Arrays.toString(arr));

    }
    static void HeapifyDownHeap(int[] arr, int parentIn) {
        int n = arr.length;
    
        // Base case: if parentIn is out of range
       
        int largest = parentIn;
        int child1 = parentIn * 2 + 1;
        int child2 = parentIn * 2 + 2;


        if (child1 < n && arr[largest] < arr[child1]) {
          largest = child1;
            
        }
    
        if (child2 < n && arr[largest] < arr[child2]) {
       largest = child2;
        }
    
        // Continue heapifying the next parent node
        if(largest!=parentIn){
            int temp = arr[parentIn];
            arr[parentIn] = arr[largest];
            arr[largest] = temp;
            HeapifyDownHeap(arr, largest);
        }
    }
       
    
}
