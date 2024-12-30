# Graph Coloring Algorithm

Given a graph G, and K colors, assign a color to each node so that the adjacent nodes get different colors.

OR

Graph coloring is a concept in graph theory where **colors are assigned to vertices, edges, or regions of a graph** such that certain constraints are satisfied. The most common type of graph coloring is **vertex coloring**, where no two adjacent vertices share the same color.

#### Key Terminology:

1. **Vertex Coloring**: Assigning colors to vertices so that no two adjacent vertices have the same color.
2. **Edge Coloring**: Assigning colors to edges so that no two edges sharing a common vertex have the same color.
3. **Chromatic Number**: The minimum number of colors needed to color a graph under the given constraints.
4. **Region Coloring**: Assigning colors to regions (in planar graphs, like maps) so that no two adjacent regions have the same color.

> No one knows a fast algorithm for determining chromatic number.
>
> For finding chromatic number you have to try exponential number of possiblities
>
> The **chromatic number** of a graph is the **minimum number of colors required** to color its vertices such that no two adjacent vertices share the same color. It represents a fundamental property of a graph in graph theory.
>
> ### Denotation:
>
> The chromatic number of a graph G**G** is often denoted as χ(G)**χ**(**G**).
>
> Graph coloring is a NP - complete problem

- NP complete problems are problems whose status is unknown
- No polynomial time algorithm has been discovered for any NP complete pattern
- It is also not established that no polynomial time algorithm will even exist

### What Are NP-Complete Problems?

NP-complete problems are a class of computational problems that are both:

1. **NP (Nondeterministic Polynomial Time):**
   * The solutions to these problems can be *verified* in polynomial time by a deterministic Turing machine.
   * In simpler terms, if someone provides a solution to an NP problem, you can quickly (in polynomial time) check whether the solution is correct.
2. **NP-Hard:**
   * These problems are at least as hard as the hardest problems in NP.
   * If an efficient algorithm (polynomial-time solution) is found for any NP-complete problem, then all problems in NP can also be solved efficiently.


### Approximation Algorithm (greedy)

Starts with the highest degree of graph -> Welsh powell algorithm

1. Order the noes V1,V2.....Vn
2. Order the colors C1,C2.....
3. Process nodes one at a time for i = 1,2......n. Assign the lowest degree color to the particular

The **Welsh-Powell Algorithm** is a graph coloring algorithm designed to efficiently assign colors to the vertices of a graph. It is a **heuristic algorithm**, meaning it doesn’t always guarantee the optimal solution (minimum number of colors), but it often provides good results in a reasonable amount of time.

The Welsh-Powell Algorithm operates as follows:

1. **Sort Vertices by Degree**:
   * List all vertices and sort them in descending order of their degree (number of edges connected to each vertex). The highest-degree vertex comes first.
2. **Assign Colors**:
   * Start with the first vertex in the sorted list and assign it the first color.
   * Proceed to the next vertex. Assign it the first available color that does not conflict with any adjacent vertices (no two adjacent vertices should have the same color).
   * Repeat this process for all vertices.
3. **Use the Next Color**:
   * If no available color exists for a vertex, introduce a new color.
4. **Continue Until All Vertices Are Colored**:
   * Keep coloring vertices until every vertex in the graph has been assigned a color.

----------------------------

### Real-Life Applications of Graph Coloring

1. **Map Coloring**:
   * **Application**: Assigning colors to different countries on a map such that no two neighboring countries have the same color.
   * **Significance**: Ensures clarity and avoids confusion in visual representation. This is famously known as the **Four-Color Theorem**, which states that four colors are sufficient to color any map.
2. **Scheduling Problems**:
   * **Application**: Assigning time slots to exams or jobs such that no overlapping events share the same time slot.
   * **Example**: In a university, exams for subjects with common students are scheduled at different times. Each subject is a vertex, and an edge connects two subjects with common students.
3. **Frequency Assignment in Communication Networks**:
   * **Application**: Assigning frequencies to radio towers so that towers in proximity (vertices) do not interfere (edges).
   * **Significance**: Minimizes signal interference while using the minimum number of frequencies.
4. **Register Allocation in Compilers**:
   * **Application**: Assigning variables to a limited number of CPU registers during program execution.
   * **Significance**: Optimizes resource allocation in computing.
5. **Traffic Light Phasing**:
   * **Application**: Assigning phases to traffic lights at intersections so that conflicting directions do not have green lights simultaneously.
   * **Significance**: Prevents accidents and optimizes traffic flow.
6. **Sports Scheduling**:
   * **Application**: Scheduling matches so that teams do not play multiple games on the same day or at the same venue.
   * **Example**: The Indian Premier League (IPL) scheduling matches for teams across different cities.
