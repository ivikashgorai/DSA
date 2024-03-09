package representation;
import java.util.List;
import java.util.ArrayList;

class Graph {

    int nodes; // no. of nodes
    List<List<Integer>> adjlist;

    public Graph (int arg_nodes) {
        nodes = arg_nodes;
        adjlist = new ArrayList<>(nodes);
        for (int i=0; i<=nodes; i++)
            adjlist.add(new ArrayList<>());
    }

    void AddEdge (int src, int dst) {
        adjlist.get(src).add(dst);
        adjlist.get(dst).add(src);
    }

    void Iterate (int src) {
        System.out.print("\n "+src+" : ");
        int itr =  adjlist.get(src).size();
        for(int i=0;i<itr;i++){
            System.out.print(adjlist.get(src).get(i)+" ");
        }
    }
    
    
    public static void main (String[] args) {

        Graph g = new Graph(7);
        g.AddEdge(0,1);
        g.AddEdge(0,2);
        g.AddEdge(1,3);
        g.AddEdge(1,4);
        g.AddEdge(2,3);
        g.AddEdge(3,5);
        g.AddEdge(4,6);
        g.AddEdge(5,6);

        System.out.print("Adjacency list implementation for graph");

        g.Iterate (0);
        g.Iterate (1);
        g.Iterate (4);
    }
}
