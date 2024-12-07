import java.util.*;
public class KadaneAlgo {

    public static void main(String[] args) { // maximum subarray sum // 
        int[] arr = {3,4,-5,8,-12,7,6,-2};
        int prefix = 0;
        int last = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            max = Math.max(max,prefix);
            if(prefix<0){
                last = i;
                prefix = 0;
            }
        }
        for(int i=0;i<last;i++){
            prefix+=arr[i];
            max = Math.max(max,prefix);
            if(prefix<0){
                prefix = 0;
            }
        }
        System.out.println(max);
    }
}