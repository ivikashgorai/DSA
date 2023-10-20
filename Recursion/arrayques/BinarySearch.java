package arrayques;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,6,9,11,15,17,21,25};
        int target = 6;
        int start = 0;
        int end  = arr.length-1;
        System.out.println(binary(arr, target,start,end));

    }
    public static int binary(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]<target){
            start = mid+1;
            binary(arr,target,start,end);
        }
        else if(arr[mid]>target){
            end = mid -1;
            binary(arr,target,start,end);
        }
        else{
            return mid;
        }
        return  binary(arr,target,start,end);
    }
}