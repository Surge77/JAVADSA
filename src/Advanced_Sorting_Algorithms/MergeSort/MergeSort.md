# Merge Sort =>

- Given 2 sorted arrays of different sizes combine them such that the combined array is sorted
- This sometimes also asked as merge two sorted arrays
- A -> [1,5,7,10] of size n
- B -> [2,3.9,12,16] of size m
- C -> Merged array -> [1,2,3,5,7,9,10,12,16] => output of size n + m

- Constraints:
- Size of both the arrays will be different
- The size can be b/w  1 < n, m <=10^7

# How can we solve the question:

- Brute force approach :-> Let's just follow the expected steps in the questions

- Combine one array after the other and them sort them
- A -> n , B -> m , result -> C -> (n+m)length

1. We can create a new array of size n + m
2. We will copy the data of array A first and then array B
3. Sort the array C with selection/insertion/bubble sort -> which takes O((n+m)^2)
4. Maybe we can use quick sort/heap sort / merge sort -> which can take O ((n+m) log(n+m))

> This above is a brute force which is a bit inefficient
------------------------------------------------------------------------------------------------------------------

=> How can we optimize?

- A -> [1,5,7,10] of size n

- B -> [2,3.9,12,16] of size m

> If we try to figure out the smallest element of the final output, what will be the element??
> It will be one of the smallest element in given arrays A and B

- So the output array will be C[0] = min(A[0],B[0]), -> A[0] -> 1

> In the final output which element will be the second smallest in the output C[1] ?
> The candidates are 
1. The element that didn't become the smallest (the two who fought for smallest)
2. the smallest element from remaining array A

- C[1] = min(A[1], B[0]) => B[0] -> 2

=> In every iteration of this logic we can eliminate exact one element by just one comparison
=> so a comparison is a constant time operation
=> Time complexity => O(n+m)
=> Space => O(1)

# So we need two pointers i and j for array A and B respectively
# We also keep an pointer k to iterate in output array
---------------------------------------------------------------------------------------------------------------------------

- Is merge sort stable => yes
- Is it In place => No