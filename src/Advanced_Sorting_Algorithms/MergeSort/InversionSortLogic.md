Q ==> Let A[0...n-1] be an array of n distinct positive integers.If i<j and A[i] > A[j] then the pair (i,j) is called 
an inversion of A.Given n and an array A, your task is to find the number of inversion of A.We have to count inversion pairs.

- n is the length of the array
The length of the array is as big as n <=10^6

Definition of inversion pair:

(a[i] , a[j]) where i < j and a[i] > a[j]

For ex: A -> [2,3,8,6,1]

ans => 5 => (2,1) (3,1) (8,1) (6,1) (8,6) 

Brute force => let's try to find all pairs of elements in the array and filter the inversion pair

Here the time complexity will be O(n^2) which will be TLE (time limit exceeded)

# So we need a better strategy to solve this: