
import java.util.*;

public class PreviousSmaller {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 4, 2,1,5,6,3,2,4,2};
        int[] ps = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // if (stack.isEmpty() || arr[i] > stack.peek()) {
            //     if (stack.isEmpty()) {
            //         ps[i] = -1; // when anyelement have no previous smaller
            //     } else {
            //         ps[i] = stack.peek();
            //     }
            //     stack.push(arr[i]);
            // } else { // not required of this
                while (!stack.isEmpty() && stack.peek()>=arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ps[i] = -1;
                } else {
                    ps[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
        // }
        System.out.println(Arrays.toString(ps));
        ;
    }
}