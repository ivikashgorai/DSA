import java.util.*;
// import java.util.Queue;

public class FirstNegativeNoSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        Queue<Integer> q = new LinkedList<>();
        int i =0;
        int j =0;
        int n = arr.length;
        while(j<n){
            while(j-i+1!=k){ // window size of k
                if(arr[j]<0){
                    q.add(arr[j]);
                }
                j++;
            }
            if(j>=n){ // K window size bana hi nhi
                break;
            }
            if(!q.isEmpty()){
            System.out.println(q.peek());
            if(arr[i]==q.peek()){
                q.remove();
            }
        }
        else{
            System.out.println(0);
        }
            i+=1;
        }
    }
}
