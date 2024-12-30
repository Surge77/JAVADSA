# Postorder DFS Alogorithm


**Postorder DFS** is a variant of Depth-First Search (DFS), a graph traversal algorithm, where the order of processing nodes is defined by their **postorder traversal**.

In postorder traversal:

* A node is processed **only after** all its descendants (child nodes) have been fully explored.

This approach is commonly used in tree/graph problems where we need to process dependencies before the node itself, such as in **topological sorting** or **evaluating expressions in a tree**.


### **Steps of Postorder DFS**

1. **Visit a Node**:
   * Start at the given node.
2. **Explore All Descendants**:
   * Recursively visit all unvisited neighbors/child nodes first.
3. **Process the Current Node**:
   * Once all its descendants have been explored, add the node to the result list or perform the desired operation on it.


### **Applications of Postorder DFS**

1. **Topological Sorting**:
   * Nodes are added to the result in reverse postorder.
2. **Tree Traversals**:
   * Used to traverse and evaluate expression trees.
3. **Dependency Resolution**:
   * Ensures dependencies are resolved before processing a node.
4. **Strongly Connected Components (SCC)**:
   * Postorder DFS is used in **Kosaraju's algorithm** to find SCCs.
5. **Cycle Detection**:
   * Helps determine if a directed graph is acyclic.
