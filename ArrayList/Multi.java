import java.util.ArrayList;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
        for (int i = 0; i < 3; i++) { // adding 3 arraylist inside a arraylist
            list.add(new ArrayList<>());//main array list ke andar 3 array list add ho gaYA HAI // adding arraylist is compulsory
        }
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) { 
        list.get(i).add(sc.nextInt()); //getting arraylist(i) inside main arraylist and then adding elements to it(j);
    }
    
}
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println(list.get(i).get(j));
    }
    
}
    }
}
