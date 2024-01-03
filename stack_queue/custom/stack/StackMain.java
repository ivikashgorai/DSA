package stack_queue.custom.stack;

public class StackMain {
  public static void main(String[] args) {
    CustomStack stack1 = new CustomStack();
    CustomStack stack2 = new CustomStack();
    int max=15;
    stack1.push(9);
    stack1.push(5);
    stack1.push(4);
    stack1.push(6);
    stack2.push(1);
    stack2.push(3);
    stack2.push(5);
    stack2.push(4);
    System.out.println(find(stack1,stack2,0,max));
  }  

  static int find(CustomStack stack1,CustomStack stack2,int count,int max){
    if(count>=max){
      return 1;
    }
    if(count+stack1.peek()<=max){
    stack1.pop();
    count+= find(stack1, stack2, count, max);
  }
  else if(count+stack2.peek()<=max){
    stack2.pop();
    count+= find(stack1, stack2, count, max);
  }
  return count;
}
}
