package Graphs;
import java.util.*;

/***
 * This is a adjacency List Implementation of graph -> Array of LinkedList
 * In this implementation we going to take care of both unidirectional and bidirectional edges
 * LinkedList will always store adjacent neighbours of the node
 * And this is considered as the most optimized implementation
 * To represent whether an edge we are adding is unidirectional or bidirectional we use a boolean flag value to take care of that
 */

/***
 * What are Connected Components?
 * In an undirected graph, a connected component is a subgraph where there exists a path between every pair of nodes within the component.
 * If two nodes are in different components, there is no path connecting them. For example, in a social network, each isolated group of friends could represent a connected component.
 *
 * Why is connectedComponents Important?
 *
 * Identifying connected components helps understand the structure of the graph:
 * Analyzing Clusters: It shows how many isolated clusters exist.
 * Graph Traversal: Knowing the components is essential for graph algorithms, as it ensures all nodes are covered.
 * Applications: In social networks, connected components can represent groups of friends; in network design, they represent parts of the network that are not connected.
 */

public class Graph_Implementation {

    private int v; //Will tell us total number of vertices

    private LinkedList<Integer>[] adj;

    //Constructor
    public Graph_Implementation(int v){

        this.v = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    //Adds edges between two nodes or vertices, the boolean value is to identify whether the edge is uni/bidirectional
    public void addEdge(int u, int v,boolean bidir){

        adj[u].add(v);
        if (bidir){
            adj[v].add(u);
        }

    }

    //For printing the List
    public void printList(){

        for (int i = 0; i < v; i++){
            System.out.print(i + "->");
            for (int node: adj[i]){
                System.out.print(node + ", ");
            }
            System.out.println();
        }
    }

    public void dfs(int src){

        Map<Integer,Boolean> visited = new HashMap<>();
        dfsHelper(src,visited);
    }

    private void dfsHelper(int src,Map<Integer,Boolean> visited){
        visited.put(src,true);
        System.out.print(src + " ");
        for (int neighbour: adj[src]){
            if(!visited.containsKey(neighbour)){
                dfsHelper(neighbour,visited);
            }
        }
    }


    public void bfs(int src){

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v + 1];

        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbour : adj[node]){
               if(!visited[neighbour]){
                   q.add(neighbour);
                   visited[neighbour] = true;
               }
            }
        }

    }

    public void ShortestPath(int src, int dest) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        int[] dist = new int[v];
        int[] parent = new int[v];

        Arrays.fill(parent, -1); // Initialize parent array with -1.

        // BFS Initialization
        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbour : adj[node]) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;

                    // Update distance and parent.
                    dist[neighbour] = dist[node] + 1;
                    parent[neighbour] = node;
                }
            }
        }

        System.out.println("The shortest path is " + dist[dest]);

        // Printing shortest distances from the source to all nodes.
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < v; i++) {
            System.out.println("Node " + i + ": " + dist[i]);
        }
    }


    //The connectedComponents function relies on DFS to mark all nodes in each connected component.c
    public int connectedComponents(){

        Map<Integer,Boolean> visited = new HashMap<>();
        int components = 0;

        for (int i = 0; i < v; i++){
            if (!visited.containsKey(i)){
                dfsHelper(i,visited);
                components++;
            }
        }

        return components;
    }

    public boolean isBipartite(){

        //this array will store the color assigned for every node in the graph

        int[] colors = new int[v];


        Arrays.fill(colors,-1); //initialize all vertices with no color

        for(int i = 0; i < v; i++){
            if(colors[i] == -1){
                if(!isBipartiteBFS(i,colors)){
                    return false; //if BFS on this component is not bipartite return false
                }
            }
        }
        return true; //if BFS on all components is bipartite you return true
    }

    private boolean isBipartiteBFS(int src, int[] colors) {

        Queue<Integer> q = new LinkedList<>();
        colors[src] = 0;

        q.add(src);

        while (!q.isEmpty()){
            int node = q.poll();

            for (int neighbour : adj[node]){
                if(colors[neighbour] == -1){
                    q.add(neighbour);
                    //if the neighbour has not been colored, assign the opposite color
                    colors[neighbour] = 1 - colors[node];
                } else if (colors[neighbour] == colors[node]) {

                    //if the neighbour has the same color as the current node
                    //then the graph is not bipartite
                    return false;

                }
            }
        }

        //if the bfs traversal of this component is bipartite then return true
        return true;

    }

    public static void main(String[] args) {

        Graph_Implementation g = new Graph_Implementation(6);
        g.addEdge(0,1,true);
        g.addEdge(1,3,true);
        g.addEdge(1,2,true);
        g.addEdge(0,2,true);
        g.addEdge(4,5,true);

        System.out.println(g.isBipartite());


    }
}
