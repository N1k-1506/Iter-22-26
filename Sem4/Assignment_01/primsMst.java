import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
public class primsMst {
    static void creategraph(ArrayList<Edge> Gr[]) {
        for (int i = 0; i < Gr.length; i++) {
            Gr[i] = new ArrayList<>();
        }
    }
    /*       2
     *   0 ----- 1
     *    \     /
     *   6 \   / 3
     *      \ /
     * 3 --- 2
     *    4
     * 
     */
    static void addEdge(int src, int dest, int wt, ArrayList<Edge> Gr[]) {
        Edge e = new Edge(src, dest, wt);
        Edge e1 = new Edge(dest, src, wt);
        Gr[src].add(e);
        Gr[dest].add(e1);
    }
    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> G1[] = new ArrayList[v];
        creategraph(G1);
        addEdge(0, 1, 2, G1);
        addEdge(1, 2, 3, G1);
        addEdge(0, 2, 6, G1);
        addEdge(2, 3, 4, G1);
        prims(0, v, G1);
    }
    public static void prims(int src, int V, ArrayList<Edge> E[]) {
        int[] key = new int[V];
        int[] parent = new int[V];
        boolean[] inMST = new boolean[V];
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
        PriorityQueue<Edge> pq = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.wt));
        key[src] = 0;
        pq.offer(new Edge(-1, src, 0));
        while (!pq.isEmpty()) {
            int u = pq.poll().dest;
            inMST[u] = true;
            for (Edge a : E[u]) {
                int v = a.dest;
                int wt = a.wt;
                if (!inMST[v] && wt < key[v]) {
                    key[v] = wt;
                    parent[v] = u;
                    pq.offer(new Edge(u, v, key[v]));
                }
            }
        }
        int mincost=0;
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++){
            System.out.println(parent[i] + " - " + i + "\t" + key[i]);
            mincost+=key[i];
        }
        System.out.println("Total Cost: "+mincost);
    }
}

class Edge {
    int src, dest, wt;

    Edge(int x, int y, int w) {
        src = x;
        dest = y;
        wt = w;
    }

    Edge() {
    }
}