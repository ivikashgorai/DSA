package dijkastra;

import java.util.ArrayList;

public class Adj {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();

        ArrayList<ArrayList<Integer>> zero = new ArrayList<>();
        ArrayList<Integer> zo = new ArrayList<>();
        zo.add(1);
        zo.add(4);
        zero.add(zo);
        ArrayList<Integer> ztwo = new ArrayList<>();
        ztwo.add(2);
        ztwo.add(4);
        zero.add(ztwo);
        list.add(zero);//0 list added

        ArrayList<ArrayList<Integer>> one = new ArrayList<>();
        ArrayList<Integer> oz = new ArrayList<>();
        oz.add(0);
        oz.add(4);
        one.add(oz);
        ArrayList<Integer> ot = new ArrayList<>();
        ot.add(2);
        ot.add(2);
        one.add(ot);
        list.add(one);//1 list added

        ArrayList<ArrayList<Integer>> two = new ArrayList<>();
        ArrayList<Integer> tz = new ArrayList<>();
        tz.add(0);
        tz.add(4);
        two.add(tz);
        ArrayList<Integer> tt = new ArrayList<>();
        tt.add(1);
        tt.add(2);
        two.add(tt);
        ArrayList<Integer> tr = new ArrayList<>();
        tr.add(3);
        tr.add(3);
        two.add(tr);
        ArrayList<Integer> tf = new ArrayList<>();
        tf.add(5);
        tf.add(6);
        two.add(tf);
        ArrayList<Integer> tfi = new ArrayList<>();
        tfi.add(4);
        tfi.add(1);
        two.add(tfi);
        list.add(two);//2 list added

        ArrayList<ArrayList<Integer>> three = new ArrayList<>();
        ArrayList<Integer> thz = new ArrayList<>();
        thz.add(2);
        thz.add(3);
        three.add(thz);
        ArrayList<Integer> thf = new ArrayList<>();
        thf.add(5);
        thf.add(2);
        three.add(thf);
        list.add(three);//3 list added

        ArrayList<ArrayList<Integer>> four = new ArrayList<>();
        ArrayList<Integer> foz = new ArrayList<>();
        foz.add(2);
        foz.add(1);
        four.add(foz);
        ArrayList<Integer> fof = new ArrayList<>();
        fof.add(5);
        fof.add(3);
        four.add(fof);
        list.add(four);//4 list added

        ArrayList<ArrayList<Integer>> five = new ArrayList<>();
        ArrayList<Integer> fivz = new ArrayList<>();
        fivz.add(2);
        fivz.add(6);
        five.add(fivz);
        ArrayList<Integer> fivt = new ArrayList<>();
        fivt.add(3);
        fivt.add(2);
        five.add(fivt);
        ArrayList<Integer> fivfo = new ArrayList<>();
        fivfo.add(4);
        fivfo.add(3);
        five.add(fivfo);
        list.add(five);//5 list added

        // adjacency list created

        
    }

public static void display(ArrayList<ArrayList<ArrayList<Integer>>> list){
    for (int i = 0; i < list.size(); i++) {
        System.out.println("List " + i + ":");
        ArrayList<ArrayList<Integer>> outer = list.get(i);
        for (ArrayList<Integer> inner : outer) {
            System.out.print("[");
            for (Integer value : inner) {
                System.out.print(value + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
}


class Pair{
    int node;
    int distance;
    public Pair(int node,int distance){
        this.node = node;
        this.distance = distance;
    }
}
