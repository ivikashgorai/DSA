package cycle.undirected;
import java.util.*;

public class dfs {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdge(1, 2);
        g.AddEdge(1, 3);
        g.AddEdge(2, 5);
        g.AddEdge(5, 7);
        g.AddEdge(7,6);
        g.AddEdge(6, 3);
        g.AddEdge(3, 4);
        boolean[] vis = new boolean[8];
        cycledfs(g, 2, -1,vis);
    }
    public static void cycledfs(Graph g,int startNode,int parent,boolean[] vis){
        vis[startNode] = true;
        System.out.print(startNode+" ");

        for(int i=0;i<g.list.get(startNode).size();i++){
            if(vis[g.list.get(startNode).get(i)]==false){
            cycledfs(g,g.list.get(startNode).get(i),startNode,vis);
            }
            else if(vis[g.list.get(startNode).get(i)]==true && g.list.get(startNode).get(i)!=parent){
                System.out.println("Cycle exist");
                return;
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
