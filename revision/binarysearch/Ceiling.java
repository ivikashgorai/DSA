package revision.binarysearch;
import java.util.*;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt(); // 2 3 5 9 14 16 18
        } 
        System.out.println(binary(arr,15));

    }
    public static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid =  start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start =  mid+1;
            }
            else if (arr[mid]==target){
                return arr[mid];
            }
        }
        return arr[start];
    }
}
