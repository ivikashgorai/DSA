package recursion.merge_quick;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(merge(arr)));
    }
    public static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid)) ; // left side exclusive - boundry point not included // mid se ek kam tak lega
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return newarray(left,right);
    }
    public static int[] newarray(int[] left,int[] right){
        int[] arr2 = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                arr2[k] = right[j];
                j++;
            }
            else{
                arr2[k] = left[i];
                i++;
            }
            k++;
        }
            while(i<left.length){
                arr2[k]=left[i];
                i++;
                k++;
            }
                while(j<right.length){
                    arr2[k]=right[j];
                    j++;
                    k++;
                }
            return arr2;
        }
    }
