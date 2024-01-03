
import java.util.*;

public class array{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n1 = 10;
        list.add(n1);//adding element
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());//can also add element in arraylist like this
        }
          for(int i=0;i<5;i++){
            System.out.println(list.get(i));
            //printing 5 element in array
        }

System.out.println(list.size());
        // System.out.println(list); // print like list to string
   sc.close();
    }
}