package dijkastra;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class PQDij {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();
        // Graph initialization code here...
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

        int[] distance = new int[list.size()];
        boolean[] visited = new boolean[list.size()]; // for like uss node se uske adjacent dekh chuke hai agar true hai toh phir se nhi dekhenge uske adjacent uske respect mein

        // Initialize distances to infinity and mark all nodes as unvisited
        for (int i = 0; i < list.size(); i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Start from node 0
        int startNode = 0;
        distance[startNode] = 0;

        // Priority queue to store nodes based on their distance
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.offer(new Pair(startNode, distance[startNode]));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int currentNode = current.node;
            if (visited[currentNode]) {
                continue;
            }
            visited[currentNode] = true;

            ArrayList<ArrayList<Integer>> adjList = list.get(currentNode);
            for (ArrayList<Integer> edge : adjList) {
                int neighbor = edge.get(0);
                int weight = edge.get(1);
                if (!visited[neighbor] && distance[currentNode] + weight < distance[neighbor]) {
                    distance[neighbor] = distance[currentNode] + weight;
                    pq.offer(new Pair(neighbor, distance[neighbor]));
                }
            }
        }

        // Display the distances
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Node " + i + " distance: " + distance[i]);
        }
    }

    public static void display(ArrayList<ArrayList<ArrayList<Integer>>> list) {
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

class Pair {
    int node;
    int distance;

    public Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}
