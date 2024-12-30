# Graph Terminologies

#### Multi Graph

An undirected graph in which multiple edges are allowed between any 2 vertices.

#### Simple Graph

AN undirected graph in which both multiple edges and loops are not allowed

#### Complete Graph

A graph is which every vertex is directly connected to every vertex

#### Connected graph

A connected graph has a path from every vertex to all other vertex.

#### Path

A sequence of vertices connected by edges, where each adjacent pair in the sequence is connected by an edge.

#### Cycle

Path that starts and ends at the same vertex, with no vertex repeated except for the starting/ending vertex.A cycle can also be a part of another graph

#### DAG (Directed acyclic graph)

A graph with no cycles. If the graph is directed, it is called a **Directed Acyclic Graph** (DAG)

#### Degree

Degree of a vertex in a graph is the total no of edges incident to it/associated with it (for undirected graph)

> Note : In a directed graph the out degree of a vertex is total no of outgoing edges and indegree is total no of incoming edges

#### Tree

It is a connected graph with no cycles.If we remove all cycles from a DAG we will get a tree.And if we remove an edge from a tree, it is called forest.

#### Forest

An undirected graph where any 2 vertice s are connected by atmost 1 path.Collection of multiple trees.

#### Component

A subgraph where each pair of vertices is connected directly or indirectly, and which is isolated from other such subgraphs in the graph.

If there is a disconnected graph,then the set of vertices which are connected forms a component.

### Connected Components of a graph

A connected component of a graph is a subgraph of a graph in which if I can choose any two nodes I can visit them.

#### Why Connected Components Matter

Connected components help analyze a graph’s structure, offering insight into which nodes are isolated, which groups are tightly connected, and understanding clusters or communities within the data represented by the graph.

Applications include:

* **Social Networks**: Finding clusters of friends or followers.
* **Network Analysis**: Identifying isolated networks or subnetworks.
* **Image Processing**: Segmenting pixels into connected regions.
* **Biology**: Analyzing gene interaction or protein-protein interaction networks.

Connected components represent clusters of connected nodes in a graph. In an undirected graph, each connected component is a group of vertices where every vertex is reachable from any other vertex within the same group. In directed graphs, connected components are defined as **strongly connected components** where each vertex can reach every other vertex in the component following directed paths. Identifying connected components is crucial in network analysis, clustering, and understanding graph structure. Algorithms like DFS/BFS for undirected graphs and Kosaraju’s or Tarjan’s for directed graphs are efficient methods for finding these components.
