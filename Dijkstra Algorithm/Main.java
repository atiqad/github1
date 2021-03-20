import java.util.*;


public class Main
{
    public static void main(String arg[])
    {
        int V = 6;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Node> > adj = new ArrayList<List<Node> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Inputs for the DPQ graph
        adj.get(0).add(new Node(1, 16));
        adj.get(0).add(new Node(3, 4));
        adj.get(0).add(new Node(4, 8));
        adj.get(1).add(new Node(2, 2));
        adj.get(1).add(new Node(5, 5));
        adj.get(3).add(new Node(4, 3));
        adj.get(4).add(new Node(1, 7));
        adj.get(4).add(new Node(5, 1));

        // Calculate the single source shortest path
        DPQ dpq = new DPQ(V);
        dpq.dijkstra(adj, source);

        // Print the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");
        //String arr[] = {"Karachi" , "Lahore" , "Rawalpindi" , "Islamabad" , "Gilgit"};

        for (int i = 0; i < dpq.dist.length; i++)
        {
                System.out.println(source + " to " + i + " is " + dpq.dist[i]);
        }


    }

}
