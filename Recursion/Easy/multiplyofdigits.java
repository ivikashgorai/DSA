public class multiplyofdigits {
    public static void main(String[] args) {
        int n = 2420;
        System.out.println(mul(n));
    }
    public static int mul(int n) {
        if(n%10==n){ // this case will only happen when 1 last digit is remaining
            return n;
        }
        return (n%10)*mul(n/10);
    }
}
