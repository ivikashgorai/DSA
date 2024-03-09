import java.util.*;
import javafx.util.Pair;

public class main {
    public static void main(String[] args) {
        System.out.println(fact(5));
        Queue<Pair<Integer,Integer>[]> q = new LinkedList<>();
    }
    public static int fact(int n){
        if(n<=1){
            return n;
        }
        return fact(n-1)*n;
    }
}
