# BFS (Breadth-first-search) or Level Order Traversal

**Breadth-First Search (BFS)** in graph theory is a systematic algorithm for traversing or searching all the nodes in a graph. BFS starts from a chosen source node, exploring its immediate neighbors first, and then it expands outward layer by layer until all reachable nodes are visited. This approach is particularly useful for finding the shortest path in unweighted graphs and understanding the structure of the graph.


### **Key Concepts in BFS**

* **Queue**: BFS uses a queue (FIFO - First In, First Out) to keep track of nodes to visit next, processing nodes layer by layer.
* **Visited Array/Set**: This keeps track of nodes already visited to prevent revisiting them, which could lead to infinite loops.
* **Layers or Levels**: BFS explores nodes in levels. If we start from a source node S, the nodes reachable from S with one edge will be explored first, then those reachable with two edges, and so on.


### **Applications of BFS in Graphs**

* **Shortest Path in Unweighted Graphs**: BFS is used to find the shortest path between two nodes since it explores the closest nodes layer by layer.
* **Connected Components**: In undirected graphs, BFS can identify distinct connected components.
* **Cycle Detection**: BFS can detect cycles in undirected graphs by checking if a node is revisited from a node other than its parent.
* **Web Crawlers**: BFS is used in web crawlers to explore URLs layer by layer, often starting from a root URL.
* **Social Networks**: BFS helps find levels of connections (e.g., degrees of separation between users).
