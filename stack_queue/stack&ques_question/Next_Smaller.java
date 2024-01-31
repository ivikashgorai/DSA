
import java.util.*;

public class Next_Smaller {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 3, 10, 5, 1, 15, 10, 7, 6 };
        int[] ps = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // if (stack.isEmpty() || stack.peek() < arr[i]) {
            //     if (stack.isEmpty()) {
            //         ps[i] = 0;
            //     } else {
            //         ps[i] = stack.peek();
            //     }
            //     stack.push(arr[i]);
            // } else { // not required
                while (!stack.empty() && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ps[i] = 0;
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
