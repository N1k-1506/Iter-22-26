import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Array of arraylist implementation 

public class Graphtraversal {
    protected static class Edge {
        int src, dest;
        public Edge(int x, int y) {
            src = x;
            dest = y;
        }
    }/*
      *      0
      *    / | \
      *  /  |   \
      * 1   2   3
      * |   |   |
      * 4   5   6
      *  \  |  /
      *   \ | /
      *     7
      */
    
    static void addEdge(int src, int dest, ArrayList<Edge> list[]) {
        list[src].add(new Edge(src, dest));
        list[dest].add(new Edge(dest, src));
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }
    static void Bfs(ArrayList<Edge> graph[]){
       Queue <Integer> Q=new LinkedList();
       boolean visited[]=new boolean[graph.length];// Intially Value of all elements of visited will be false !!
       Q.add(0);//Intializing Queue !!
       while (!Q.isEmpty()){
          int curr=Q.remove();
          if(visited[curr]==false){
            System.out.print(curr+" ");
            visited[curr]=true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e=graph[curr].get(i);
                Q.add(e.dest);
            }
          }
       } 

    }

    static void Dfs(ArrayList<Edge> graph[]){
        Stack <Integer> S=new Stack();
        boolean visited[]=new boolean[graph.length];
        // Push the first vertex to the stack. It is assumed that the first vertex is always 0.
        S.push(0);
        /* One by one process all vertices */
            while (!S.empty()) { 
                int curr = S.pop(); 
                if(visited[curr] == false){
                visited [curr]=true;
                System.out.print(curr + " ");
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e=graph[curr].get(i);
                    S.push(e.dest);
                }
                }
            }   
    }
    public static void main(String[] args) {
        // Create a graph given in above diagram
        ArrayList<Edge> graph[] = new ArrayList[8];
        createGraph(graph);
        addEdge(0, 1, graph);
        addEdge(0, 2, graph);
        addEdge(0, 3, graph);
        addEdge(1, 4, graph);
        addEdge(2, 5, graph);
        addEdge(3, 6, graph);
        addEdge(4, 7, graph);
        addEdge(5, 7, graph);
        addEdge(6, 7, graph);
        System.out.println("Bfs  traversal of the given graph:");
        Bfs(graph);
        System.out.println("\n Dfs traversal of the given graph:");
         Dfs(graph);
    }

}
