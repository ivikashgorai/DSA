import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(2);
        stack.push(1);
        reverse(stack);
        System.out.println(stack);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int a = stack.pop();
        reverse(stack);
        pushAtBottom(stack, a);
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
