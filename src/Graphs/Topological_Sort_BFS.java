import java.util.*;

public class Topological_Sort_BFS{
    // Stores a directed edge from src to dest.
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
        this.dest=d;
        this.src=s;
        }
    }

    // Creates the directed graph used by the example.
    static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i] = new ArrayList<>();
    }

    graph[2].add(new Edge(2,3));
    graph[3].add(new Edge(3,1));
    graph[4].add(new Edge(4,0));

    graph[4].add(new Edge(4,1));
    graph[5].add(new Edge(5,0));

    graph[5].add(new Edge(5,2));
   
}

// Calculates how many incoming edges each vertex has.
public static void calcIndeg(ArrayList<Edge> graph[],int indeg[]){
    for(int i=0;i<graph.length;i++){
        int V = i;
        for(int j=0;j<graph[V].size();j++){
            Edge e = graph[V].get(j);
            indeg[e.dest]++;
        }
    }
}

public static void topoSort(ArrayList<Edge> graph[]){
    int indeg[] = new int[graph.length];
    calcIndeg(graph, indeg);
    Queue<Integer> q= new LinkedList<>();

    // A vertex with no incoming edges can appear first in the ordering.
    for(int i=0;i<indeg.length;i++){
        if(indeg[i]==0){
            q.add(i);
        }
    }
    // Process vertices in BFS order and remove their outgoing edges.
    while(!q.isEmpty()){
        int curr = q.remove();
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            indeg[e.dest]--;
            // The destination is ready once all incoming edges are removed.
            if(indeg[e.dest]==0){
                q.add(e.dest);
            }
        }
    }
    System.out.println();
 }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topoSort(graph);
    }
}
