package basicmathdsa;
public class Prime {
    public static void main(String[] args) { //true = not prime
        //false = prime
        int n = 40;
        boolean primes[] = new boolean[n + 1]; // beacause 0 starting from zero
        primes(n, primes);
    }

    public static void primes(int n, boolean[] primes) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!primes[i]) {
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < primes.length; i++) {
            if(!primes[i]){
                System.out.println(i+" is prime");
            }
        }
        
    }
}
