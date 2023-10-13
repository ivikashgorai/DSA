package recursion.easy;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
        // one(n);
        // reverse(n);
        both(n);
    }

    public static void one(int n) { // 5 4 3 2 1
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            one(n - 1);
        }
    }

    public static void reverse(int n) { // 1 2 3 4 5
        if (n == 1) {
            System.out.println(1);
        } else {
            reverse(n - 1);
            System.out.println(n);
        }
    }

    // now hoe to print both 12345 and 54321 in one function just do

    public static void both(int n) { // 5 4 3 2 1 1 2 3 4 5 
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            both(n - 1);
            System.out.println(n);
        }
    }
}