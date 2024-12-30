# Algorithm Paradigms:

1. Brute Force
2. Greedy
3. Dynamic Programming 
4. Divide and conquer 
5. Backtracking
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Brute Force : 

This is the simplest approach where all possible solutions are generated and checked. It guarantees finding a solution but is often inefficient for large datasets
This approach tries all possible solutions to find the best one. While simple, it is usually inefficient and impractical for large problems.

Examples:
String Matching: Compares a pattern against all possible positions in a text.
Exhaustive Search: Searches through all subsets or permutations to find the best result.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Divide and conquer :

Concept: This paradigm involves dividing a problem into two or more smaller problems of the same or similar type, solving them independently, and then combining their solutions to solve the original problem.
Applications: It’s widely used in algorithms like Merge Sort, Quick Sort, Binary Search, and Fast Fourier Transform (FFT).
Advantages: Highly efficient for large datasets; parallelizable.
Challenges: Requires a clear way to divide the problem and combine solutions, which might not be straightforward for all problem types.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Dynamic Programming : 

Concept: Dynamic programming is used to solve problems by breaking them down into overlapping sub-problems, solving each sub-problem just once, and storing their solutions – usually in a table – to avoid the computation of the same sub-problem again.
Applications: Optimal in many optimization problems like the Knapsack Problem, Shortest Path problems in graphs (like the Floyd-Warshall algorithm), and in computing the nth Fibonacci number.
Advantages: Reduces the time complexity significantly for problems with overlapping sub problems.
Challenges: Determining the state and formulating the state transition can be difficult.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Greedy Algorithms:

Concept: A greedy algorithm makes the locally optimal choice at each step, hoping to find the global optimum.
Applications: Used in problems like the Huffman Coding (for data compression), Prim’s and Kruskal’s algorithms (for finding Minimum Spanning Trees), and Dijkstra’s algorithm (for shortest paths in graphs).
Advantages: Often simpler and faster than other techniques.
Challenges: Doesn’t always produce the optimal solution for all problems; proving the correctness can be tricky.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Backtracking :

Concept: Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, and removing those solutions that fail to satisfy the constraints of the problem at any point of time.
Applications: Common in puzzles and in problems like the N-Queens problem, Sudoku solver, and permutation problems.
Advantages: Offers a systematic approach to traverse through all the possible configurations of a search space.
Challenges: Can be slow, as it explores all potential solutions in worst-case scenarios. 