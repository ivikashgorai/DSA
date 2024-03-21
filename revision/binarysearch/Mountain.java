package revision.binarysearch;
import java.util.*;
public class Mountain {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,6,7,3,2,1}; // mountain array should have minimum 3 element
    System.out.println(peak(arr));

}   
public static int peak(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid]<arr[mid+1]){
            start = mid+1;
        }
        else if(arr[mid]>arr[mid+1]){
            end = mid-1;
        }
        else if(arr[mid]>arr[mid+1]){
            if(arr[mid]>arr[mid-1]){
                return arr[mid];
            }
        }
    }
    return arr[start];
} 
}
