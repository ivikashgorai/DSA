package hashing.hashset;
import java.util.*;
public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        int inter = 0;
        int union = 0;
        HashSet<Integer> set = new HashSet<>();
        if(arr1.length<arr2.length){
            for(int i : arr2){
                set.add(i);
            }
        }
        else{
            for(int i : arr1){
                set.add(i);
            }
        }

        if(arr1.length<arr2.length){
            for(int i : arr1){
               if(set.contains(i)){
                inter+=1;
               }
            }
        }
        else{
            for(int i : arr2){
                if(set.contains(i)){
                    inter+=1;
                }
            }
        }

        if(arr1.length<arr2.length){
            for(int i : arr1){
               if(set.add(i)){
               }
            }
        }
        else{
            for(int i : arr2){
                if(set.add(i)){
                }
            }
        }
        System.out.println(inter);
        System.out.println(set.size());
        
    }
}
