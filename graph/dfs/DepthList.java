package dfs;
import java.util.*;

class Graph{
    int num_of_nodes;
    ArrayList<ArrayList<Integer>> list;

    public Graph(int num_of_nodes){
        this.num_of_nodes = num_of_nodes;
        list = new ArrayList<>();
        for(int i=0;i<this.num_of_nodes;i++){
            list.add(new ArrayList<>());
        }
    }

    void AddEdge(int src,int dst){
        list.get(src).add(dst);
        list.get(dst).add(src);
    }

    void It (int src) {
        System.out.print("\n "+src+" : ");
        int itr =  list.get(src).size();
        for(int i=0;i<itr;i++){
            System.out.print(list.get(src).get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.AddEdge(0,1);
        g.AddEdge(0,2);
        g.AddEdge(1,3);
        g.AddEdge(1,4);
        g.AddEdge(2,3);
        g.AddEdge(3,5);
        g.AddEdge(4,6);
        g.AddEdge(5,6);
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[8];
        dfs(g,list,vis,0);
        System.out.println(list);
    }

    public static void dfs(Graph g,ArrayList<Integer> list,boolean vis[],int node){
        vis[node] = true;
        list.add(node);

        for(int i=0;i<g.list.get(node).size();i++){
            if(vis[g.list.get(node).get(i)]==false){
            dfs(g,list,vis,g.list.get(node).get(i));
            }
        }
    }
}