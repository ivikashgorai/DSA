import java.util.*;

public class PushAtBottom {
    public static void main(String[] args) { // without extra space , time complexity here is O(N)
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.push(7);
        stack.push(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to push");
        int val = sc.nextInt();
        pushAtBottom(stack, val);
        System.out.println(stack);
        sc.close();
    }

    public static void pushAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int a = stack.pop();
        pushAtBottom(stack, value);
        stack.push(a);
    }
}
