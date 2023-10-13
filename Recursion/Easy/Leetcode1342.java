public class Leetcode1342{
    static int sum =0;
    public static void main(String[] args) {
        int n = 9;
        dec(n);
        System.out.println(sum);
    }
    public static void dec(int n){
        if(n==0){
            return;
        }
        else if(n%2==0){
            n=n/2;
        }
        else if(n%2!=0){
            n = n-1;
           
        }
        dec(n);
    }
}