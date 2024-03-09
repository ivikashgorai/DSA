package cycle.undirected;

import java.util.*;

public class bfs {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdge(1, 2);
        g.AddEdge(1, 3);
        g.AddEdge(2, 5);
        g.AddEdge(5, 7);
        g.AddEdge(7,6);
        g.AddEdge(6, 4);
        g.AddEdge(3, 4);
        cyclebfs(g);

    }
    public static void cyclebfs(Graph g){
        Queue<int[]> q = new LinkedList<>();
        boolean vis[] = new boolean[g.num_nodes];
        int arr[] = new int[2];
        arr[0] = 1;
        arr[1] = -1;
        q.add(arr);
        vis[1] = true;

        while(!q.isEmpty()){
            int[] a = q.poll();
            int val = a[0];
            int from = a[1];
            for(int i=0;i<g.list.get(val).size();i++){
                if(vis[g.list.get(val).get(i)]==false){
                    int b[] = new int[2];
                    b[0] = g.list.get(val).get(i);
                    b[1] = val;
                    q.add(b);
                    vis[g.list.get(val).get(i)] = true;
                }
                else if(vis[g.list.get(val).get(i)]==true && g.list.get(val).get(i)!=from){
                    System.out.println("Cycle exist");
                }
            }
        }
    }
}

class Graph{
    int num_nodes;
    ArrayList<ArrayList<Integer>> list;

    public Graph(int num_nodes){
        this.num_nodes =  num_nodes+1;
        list = new ArrayList<>();
        for(int i=0;i<this.num_nodes;i++){
            list.add(new ArrayList<>());
        }
    }

    public void AddEdge(int src,int dst){
        list.get(src).add(dst);
        list.get(dst).add(src);
    }
}
