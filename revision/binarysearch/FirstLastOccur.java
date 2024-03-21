package revision.binarysearch;
import java.util.*;

public class FirstLastOccur {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        System.out.println(firstOcc(arr, 7));

    }
    public static int firstOcc(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]==target){
                end  = mid-1;

            }
        }
        return start;
    }
}
