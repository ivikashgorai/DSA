package easy;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Entert the number to be factorial");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));
        sc.close();
    }
    public static int fact(int a) {
        if(a<2){
            return 1;
        }
        return a *fact(a-1);
    }
}
