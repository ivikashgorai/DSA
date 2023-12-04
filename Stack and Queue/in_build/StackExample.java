package in_build;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(10);
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20); // push element on the top
        System.out.println(stack.search(10)); // search from the top and give count from top and remove -1 if not found
        System.out.println(stack.pop()); // removes from top // if not any element then it will give empty stack exception
        System.out.println(stack.peek()); // returns value of top object
        System.out.println(stack.empty()); // returns true if empty else false
        System.out.println(stack.size());
        System.out.println(stack);
    }
}
