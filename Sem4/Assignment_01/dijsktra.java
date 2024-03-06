import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
class graph{
    
    static void creategraph(ArrayList<Edge> Gr[]){
        for(int i=0;i<Gr.length;i++){
            Gr[i]=new ArrayList<>();
        }
    }
     /*      2
             0 -----> 1
            |   \     /
            |  6 \   / 3
            |     \|/
           \|/     2
            3 <----| 
                4   
           */
    static void addEdge(int src,int dest,int wt,ArrayList<Edge> Gr[]){
        Edge e=new Edge(src, dest, wt);
        Gr[src].add(e);
    }
    public static void main(String[] args){
        int v=4;
        ArrayList <Edge> G1[] = new ArrayList[v];
        creategraph(G1);
        addEdge(0,1,2,G1);
        addEdge(1,2,3,G1);
        addEdge(0,2,6,G1);
        addEdge(2,3,4,G1);
        dijsktra(0, 4, G1);
    }
    
    public static void dijsktra(int src,int V,ArrayList<Edge> E[]) {
         int[] dist=new int[V]; 
         int[] parent=new int[V];
         for (int i=0;i<dist.length;i++){ 
            dist[i]=Integer.MAX_VALUE;
            parent[i] = -1;
         }
        Comparator<Edge> edgeComparator = Comparator.comparingInt(edge->edge.wt);
        PriorityQueue<Edge> pq=new PriorityQueue<>(edgeComparator);
        for (Edge  e: E[0]) {
            pq.add(e);
        }
        dist[src] = 0;

        while(!pq.isEmpty()){
            Edge e=pq.poll();
            int u=e.src;
            int v=e.dest;
            int w=e.wt;
            if (dist[v]>dist[u]+w) {
                dist[v]=dist[u]+w;
                parent[v]=u;
                for (Edge ed : E[v]) {
                    pq.add(ed);
                }
            }
        }
        for (int i=0;i<dist.length;i++){
            System.out.print("Path from source to "+i+": ");
            printPath(i,parent);
            System.out.println("\tDistance = "+dist[i]);
         }
         
    }
    static void printPath(int dest,int parent[]){
        if(parent[dest]==-1){ 
            System.out.print(dest+" ");
            return;
        }
        printPath(parent[dest],parent);
        System.out.print("-> "+dest);
    }
}
// class Edge{
//     int src,dest,wt;
//     Edge (int x,int y,int w){
//         src=x;
//         dest=y;
//         wt=w;
//     }
//     Edge(){
//     }
// }