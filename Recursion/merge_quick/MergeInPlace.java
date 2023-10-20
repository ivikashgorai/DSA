package merge_quick;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,3,2,1,6,4,3,6,9,2};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr,int s, int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;
        mergesort(arr, s,mid);
        mergesort(arr, mid,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[] arr,int start,int mid,int end){
        int[]  mix = new int[end-start];
        int i=start;
        int j =mid;
        int k =0;
        while(i<mid && j<end){
            if(arr[i]>arr[j]){
                mix[k]= arr[j];
                j++;
            }
            else{
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }
     for(int p=0;p<mix.length;p++){
        arr[start+p] = mix[p];
     }
    }
}
