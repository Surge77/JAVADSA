# Minimum Cost Spanning Tree

A **Minimum Cost Spanning Tree (MST)** is a subset of edges from a weighted, connected, undirected graph that:

1. **Forms a spanning tree**:
   * It connects all the vertices of the graph.
   * There are no cycles in the tree.
2. **Has the minimum possible total edge weight**:
   * Among all spanning trees of the graph, the MST has the smallest total weight of edges.


### **Key Properties of MST**

1. **Unique for a Unique Weight Graph**:
   * If all edge weights are distinct, the MST is unique.
2. **∣V∣−1** Edges:
   * A spanning tree of a graph with V vertices always has ∣V∣−1 edges.
3. **Minimizes Cost**:
   * The total weight of the edges in the MST is minimized.
4. **Connectivity**:
   * The MST ensures that all vertices are connected without forming any cycles.


### **Algorithms to Find MST**

#### **1. Kruskal’s Algorithm**

**Steps**:

1. **Sort Edges**:
   * List all edges in ascending order of their weights.
2. **Select Edges**:
   * Start adding edges to the MST one by one, beginning with the smallest weight.
   * Avoid forming cycles (use a disjoint-set/union-find data structure).
3. **Stop**:
   * Stop when the MST contains ∣V∣−1 edges.

**Time Complexity**: O(Elog⁡E), where E is the number of edges.

---

#### **2. Prim’s Algorithm**

**Steps**:

1. **Start with Any Vertex**:
   * Begin with an arbitrary vertex, and initialize an empty MST.
2. **Add the Smallest Edge**:
   * Add the smallest edge that connects a vertex in the MST to a vertex outside it.
3. **Repeat**:
   * Continue adding edges until all vertices are included.

**Time Complexity**:

* O(V2) for simple implementations.
* O(E+log⁡V) using a priority queue and adjacency list.

---

#### **Comparison of Kruskal’s and Prim’s**


| **Aspect**          | **Kruskal’s Algorithm**         | **Prim’s Algorithm**              |
| ------------------- | -------------------------------- | ---------------------------------- |
| **Approach**        | Edge-based                       | Vertex-based                       |
| **Best For**        | Sparse graphs                    | Dense graphs                       |
| **Cycle Detection** | Uses a union-find data structure | No explicit cycle detection needed |


### **Applications of MST**

1. **Network Design**:
   * Designing cost-efficient networks like electrical grids, computer networks, or transportation networks.
2. **Approximation Algorithms**:
   * Used in algorithms for problems like the Traveling Salesman Problem (TSP).
3. **Cluster Analysis**:
   * Grouping similar data points in machine learning and pattern recognition.
4. **Circuit Design**:
   * Optimizing the layout of electronic circuits.
