
public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        sort(arr,n,0,1);
    }
    public static void sort(int arr[], int n,int start, int end){
        if(arr[start]<=arr[end]){
            System.out.println("Not Sorted");
            return;
        }
        else if(end==n){
            System.out.println("Sorted");
            return;
        }
        sort(arr,n,start+=1,end+=1);
    }
}
