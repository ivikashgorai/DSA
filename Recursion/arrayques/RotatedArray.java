package arrayques;

public class RotatedArray {
    //Example {5,6,7,8,1,2,3,4}
    public static void main(String[] args) {
        int[]  arr = {3,5,6,1,2};
        int end = arr.length-1;
        int start =0;
        int peakindex;
        if(arr[0]<arr[arr.length-1]){
            peakindex = 0;
        }
        else{
        peakindex = peak(arr,end,start);
        }
        System.out.println(peakindex);
    }
    public static int peak(int[] arr,int end,int start){
        int mid = start+(end-start)/2;
        if(mid!=arr.length-1 && mid!=0 && arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
            return mid;
        }
        else if(arr[mid]>arr[0] && mid!=arr.length-1 && mid!=0){
            return peak(arr, end, mid+1);
        }
        else if(arr[mid]<arr[0] && mid!=arr.length-1 && mid!=0){
            return peak(arr,mid-1, start);
        }
        else if(mid==arr.length-1 || mid ==0 ){
            return end;
        }
        return peak(arr, end, start);
    }
}
