import java.util.*;

public class SubarrayRecursion {
    public static void main(String[] args) {
        // Solution5 s = new Solution5();
        int[] arr = {1,1,2};
        rec(arr, 0, new ArrayList<>());
        
    }
    static void rec(int[] arr,int in,List<Integer> list){
        if(in==arr.length){
            System.out.println(list);
            return;
        }
            list.add(arr[in]);
            rec(arr,in+1,list);
            list.remove(list.size()-1);

            rec(arr, in+1, list);
    }
}
