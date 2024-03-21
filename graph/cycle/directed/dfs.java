package cycle.directed;
import java.util.*;
public class dfs {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.AddEdge(1, 2);
        g.AddEdge(2, 3);
        g.AddEdge(3, 4);
        g.AddEdge(4, 5);
        g.AddEdge(5, 6);
        g.AddEdge(3, 7);
        g.AddEdge(7, 5);
        g.AddEdge(8, 2);
        g.AddEdge(8, 9);
        g.AddEdge(9, 10);
        // g.AddEdge(10, 8);
        boolean[] vis = new boolean[g.num_nodes];
        boolean[] path = new boolean[g.num_nodes];
        for(int i=1;i<=10;i++){
            directedCycle(g, vis, path,i);
        }

    }
    public static void directedCycle(Graph g,boolean[] vis,boolean[] path,int start){
        vis[start] = true;
        path[start] = true;

        for(int i =0;i<g.list.get(start).size();i++){
            if(vis[g.list.get(start).get(i)] == false){
            directedCycle(g,vis,path,g.list.get(start).get(i));
            }
            else if(vis[g.list.get(start).get(i)]==true && path[g.list.get(start).get(i)]==true){
                System.out.println("Cycle");
            }
        }
        path[start] = false;
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
    }
}
