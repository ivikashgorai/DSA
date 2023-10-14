package recursion.pattern;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,8,1,3,2};
        int n = arr.length-1;
        int index =0;
        bubble(arr,n,index);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static void bubble(int arr[],int n,int index){
        if(n==0){
            return;
        }
        if(n>index){
            if(arr[index]>arr[index+1]){
                int temp;
                temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubble(arr, n, index+1);
        }
        else{
            bubble(arr, n-1, 0);
        }
    }
}
