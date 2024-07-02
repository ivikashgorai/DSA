import java.util.*;

public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        int[] arr = {1,3,-1,-3,5,3,6,7,1,0,5};
        int k = 3;
        int i =0;
        int j = 0;
        int n = arr.length;
        while(j<n){
            while(j-i+1<=k){
                if(q.isEmpty()){
                    q.add(arr[j]);
                }
                else{
                    while(q.getLast()<arr[j]){
                        q.removeLast();
                        if(q.isEmpty()){
                            break;
                        }
                    }
                    q.addLast(arr[j]);
                }
                j+=1;
            }
            System.out.print(q.peek()+" ");
            if(q.peek()==arr[i]){
                q.removeFirst();
            }
            i+=1;
        } 
    }
}
