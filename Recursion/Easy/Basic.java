package easy;
public class Basic{
    public static void main(String[] args) {
        print(1); // function to print 1 2 3 4 5
    }
    public static void print(int n) {
        if(n==6){
            return; // it will return nothing this is called base case  
        }
        System.out.println(n);
        print(n+1);
    }
}
