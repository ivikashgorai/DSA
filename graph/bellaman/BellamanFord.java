package bellaman;

import java.util.*;

public class BellamanFord {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(5);
        list.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(-3);
        list.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(3);
        list3.add(1);
        list.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(2);
        list4.add(6);
        list.add(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(-2);
        list.add(list5);

        List<Integer> list6 = new ArrayList<>();
        list6.add(2);
        list6.add(4);
        list6.add(3);
        list.add(list6);

        List<Integer> list7 = new ArrayList<>();
        list7.add(3);
        list7.add(4);
        list7.add(-2);
        list.add(list7);

        int[] dist = new int[6]; //length = number of node (0 indexed)

        for(int i=0;i<6;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;

        for(int i=0;i<6;i++){
            for(int j=0;j<list.size();j++){
                int a = dist[list.get(j).get(0)]+list.get(j).get(2);
                int b = dist[list.get(j).get(1)];
                if(a<b){
                    dist[list.get(j).get(1)] = a;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
 


       
    }

    public static void AddEdge(List<List<Integer>> list,int i,int u,int v,int wt){
        
    }
}
