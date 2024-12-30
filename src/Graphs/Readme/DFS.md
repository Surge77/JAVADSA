# DFS (Depth first Search)

**Depth-First Search (DFS)** is a fundamental graph traversal algorithm that explores as far as possible down one path before backtracking. Unlike Breadth-First Search (BFS), which explores neighbors at the same level first, DFS dives deep into one branch and goes back only when there are no further nodes to visit in that direction.


### **Overview of DFS in Graphs**

* DFS is commonly used on **both directed and undirected graphs**.
* It can also be applied to **trees**, which are a special type of graph.
* In DFS, we start from a **source node** and explore each node by visiting its unvisited neighbors, moving "deep" into the graph along one path until no further moves are possible.


### **Key Concepts in DFS**

* **Stack**: DFS can be implemented using either recursion (using the system call stack) or an explicit stack data structure.
* **Visited Set/Array**: Keeps track of visited nodes to avoid revisiting them, which could lead to infinite loops.
* **Backtracking**: DFS backtracks whenever it hits a node that has no unvisited neighbors, resuming from the most recent node with remaining unvisited neighbors.


### **Applications of DFS**

* **Pathfinding**: DFS can be used to find paths between nodes.
* **Cycle Detection**:
  * In an undirected graph, DFS can detect cycles by checking if a node is revisited from a node that isn’t its parent.
  * In directed graphs, back edges (from a node to one of its ancestors) indicate a cycle.
* **Connected Components**: By starting DFS from any unvisited node, we can explore and mark an entire connected component.
* **Topological Sorting**: DFS is used to order tasks (nodes) that have dependencies in directed acyclic graphs (DAGs).
* **Solving Puzzles and Games**: DFS can explore possible moves in puzzles, such as mazes or the Knight’s Tour on a chessboard.
