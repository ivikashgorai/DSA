package basicmathdsa.sqrt;
public class SqrtNewton {
    public static void main(String[] args) {
        System.out.println(newton(36));
    }

    public static double newton(int n) {
        double x = n;
        double root;
        while (true) {
            root = (x + (n / x)) * 0.5;
            if (Math.abs(root - x) < 1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
