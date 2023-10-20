package easy;
public class Impreverse {
      static int sum =0;
    public static void main(String[] args) {
        int n = 350240;
        rev1(n);
        System.out.println(sum); // in palindrome just chek sum == n or not 
    }
    public static void rev1(int n) {
        if (n==0) { // can print sum here also
         return;
        }
        int rem = n % 10;
        sum = rem + sum * 10;
        rev1(n/10);
    }
}
