import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String a  = "abc";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<a.length();i++){
            stack.push(a.charAt(i));
        } 
        String b = "";
        for(int i=0;i<a.length();i++){
            b+=stack.pop();
        }
     
        System.out.println(b);

    }
}
