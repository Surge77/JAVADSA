# Topological Sorting


**Topological sorting** is a method of arranging the vertices of a **Directed Acyclic Graph (DAG)** in a linear order such that for every directed edge (u,v)**(**u**,**v**)**, vertex u**u** appears before v**v** in the ordering.

In simpler terms:

* If one task depends on another, the dependent task comes later in the order.

### **Key Requirements**

1. The graph must be a **DAG**:
   * Directed: All edges have a direction.
   * Acyclic: The graph must not contain any cycles (a path cannot loop back to itself).
2. Every edge (u,v)**(**u**,**v**)** implies that u**u** should come before v**v** in the sorted order.


### **Algorithms for Topological Sorting**

There are two main algorithms to perform topological sorting:

---

#### **1. Kahn’s Algorithm (BFS-Based)**

**Steps**:

1. **Calculate In-Degree**:
   * For each vertex, count the number of incoming edges (in-degree).
2. **Initialize Queue**:
   * Add all vertices with in-degree 0 to a queue (these have no dependencies).
3. **Process Vertices**:
   * Remove a vertex from the queue, add it to the result list, and reduce the in-degree of its neighbors by 1.
   * If any neighbor’s in-degree becomes 0, add it to the queue.
4. **Repeat**:
   * Continue until the queue is empty.
5. **Check for Cycles**:
   * If the result list contains all vertices, the graph is a DAG. Otherwise, it contains a cycle, and topological sorting is not possible.

**Time Complexity**: O(V+E)


#### **2. Depth-First Search (DFS-Based)**

**Steps**:

1. **Visit Vertices**:
   * Start with any unvisited vertex and perform a DFS.
2. **Postorder Stack**:
   * When a vertex has no unvisited neighbors, push it onto a stack (indicating it’s "done").
3. **Repeat**:
   * Continue the DFS until all vertices are visited.
4. **Output Order**:
   * The topological order is the reverse of the stack.

**Time Complexity**: O(V+E)
