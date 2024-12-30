# Bipartite Graph

A **bipartite graph** is a specific type of graph in which the set of vertices can be divided into two distinct and disjoint subsets, typically denoted as U and V, such that every edge connects a vertex from one subset to a vertex from the other. This means that there are no edges connecting vertices within the same subset.


### Characteristics of Bipartite Graphs

1. **Two Disjoint Sets**:
   * The vertices can be divided into two sets, with no edges between vertices within the same set.
2. **Edge Connections**:
   * Every edge connects a vertex from one set to a vertex in the other set.
3. **No Odd-Length Cycles**:
   * A bipartite graph cannot have odd-length cycles, as this would mean connecting vertices within the same set.
4. **Two-Colorability**:
   * Bipartite graphs can be colored using two colors, with no two adjacent vertices sharing the same color. This is why they are also called two-colorable graphs.

### Properties of Bipartite Graphs

1. **Perfect Matching**:
   * In a bipartite graph, there can be a perfect matching where every vertex in one set is connected to exactly one vertex in the other set.
2. **Maximum Degree Bound**:
   * The maximum degree of any vertex is limited by the size of the smaller of the two sets.
3. **Chromatic Number**:
   * The chromatic number of a bipartite graph is always 2, as it can be colored with two colors.


### Applications of Bipartite Graphs

1. **Social Networks**:
   * Used to model relationships between two groups, such as users and items.
2. **Matching Problems**:
   * Helps in job assignments or resource allocation.
3. **Network Flow Problems**:
   * Useful in algorithms for flow networks.
