import java.util.*;
public class PreviousGreaterDistance {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,85,100,120};
        int[] brr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        brr[0]=1;
        stack.push(0);
       for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[stack.peek()]){
               brr[i] = i-stack.peek();
               stack.push(i);
            }
            else if(arr[i]>=arr[stack.peek()]){ // if equal then also run
                while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    brr[i] = i+1;
                }
                else{
                    brr[i] = i-stack.peek();
                }
                stack.push(i);
            }
       }
       System.out.println(Arrays.toString(brr));
    }
}
