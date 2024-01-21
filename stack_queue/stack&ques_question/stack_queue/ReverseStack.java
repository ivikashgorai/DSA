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
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        
    }

}
