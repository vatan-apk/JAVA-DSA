import java.util.*;

public class Adjacency_List {

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create empty list for every vertex
        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        // Print Adjacency List
        for(int i = 0; i < V; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}