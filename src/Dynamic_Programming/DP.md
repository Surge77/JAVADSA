# Dynamic Programming

- It is an algorithmic paradigm
- It is an optimization technique
- Generally at the beginning the brute force is optimized

### 1. Key Concepts of Dynamic Programming

* **Overlapping Subproblems**: Problems that can be broken down into smaller, repetitive subproblems. For instance, calculating Fibonacci numbers involves calculating many of the same smaller Fibonacci values multiple times if we were to use a naive recursive approach.
* **Optimal Substructure**: A problem has optimal substructure if an optimal solution to the problem can be constructed from optimal solutions to its subproblems. For example, finding the shortest path in a graph exhibits optimal substructure since the shortest path to a destination node can be constructed by combining the shortest paths of intermediate nodes.

### 2. Dynamic Programming Approach: Top-Down vs. Bottom-Up

DP can be implemented in two primary ways:

* Top-Down Approach (Memoization): This approach uses recursion and stores the results of subproblems in a table (array or dictionary). When a subproblem is encountered, the algorithm checks if it has been solved before by looking it up in the table. If so, it reuses the stored result instead of recalculating it.

  * *Example*: Calculating Fibonacci numbers using memoization, where we store previously calculated Fibonacci values and reuse them as needed.
* Bottom-Up Approach (Tabulation): This approach avoids recursion. Instead, it solves all possible subproblems first, starting with the smallest ones, and stores their results in a table. These results are then used to solve larger subproblems in a systematic way.

  * *Example*: Calculating Fibonacci numbers iteratively, where we start from `F(0)` and `F(1)` and use these to build up to the desired Fibonacci number.

### 3. Steps in Dynamic Programming

To apply dynamic programming effectively, follow these steps:

* **Define the Problem in Terms of Subproblems**: Break down the problem into smaller, simpler subproblems.
* **Identify Recurrence Relation**: Find a formula or rule to relate the solution of the main problem to the solutions of its subproblems.
* **Decide Memoization or Tabulation**: Choose between the top-down (memoization) or bottom-up (tabulation) approach.
* **Initialize the DP Table**: For the bottom-up approach, initialize a table with base values.
* **Fill the Table**: Solve the subproblems iteratively (bottom-up) or recursively (top-down), using the values stored in the DP table to avoid redundant computations.
* **Extract the Solution**: Retrieve the final result, typically stored in the last cell or computed through the recursion.


### When Not to Use Dynamic Programming

* **Non-Overlapping Subproblems**: DP is inefficient if subproblems don’t overlap, as there’s no need to store and reuse solutions.
* **High Space Complexity**: Some DP approaches can use a lot of memory. If the problem is memory-intensive, alternatives may be better.


### Why Dynamic Programming?

* **Efficiency**: DP helps solve problems faster by avoiding redundant calculations. Many problems, like finding Fibonacci numbers or shortest paths, involve repeated computations of the same subproblems. DP saves these results to reuse, reducing time complexity from exponential to polynomial in many cases.
* **Optimization**: It’s particularly useful for optimization problems, where we need to maximize or minimize a value under certain constraints. By exploring all subproblem solutions, DP guarantees an optimal solution without unnecessary calculations.
* **Solving Problems with Overlapping Subproblems**: When a problem has overlapping subproblems (e.g., in recursive structures like divide-and-conquer algorithms), DP ensures each subproblem is solved only once, saving time and computational resources.
* **Real-World Applications**: DP is used in various fields, including economics (e.g., investment decision-making), machine learning (e.g., Viterbi algorithms in hidden Markov models), and operations research (e.g., resource allocation and scheduling).
