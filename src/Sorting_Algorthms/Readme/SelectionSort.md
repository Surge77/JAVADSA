 => We will try to build the intuition of Selection sort
 
-> This is a comparison based sort

Let's take a situation: 

- We take an array of length n
- In this array we have two partitions 
- The first partition is already arranged in increasing order i.e sorted
- The second part is randomly arranged i.e not sorted
- x is the last element of the sorted area
- y is the minimum element of unsorted region which is greater than or equal to x (x <= y)
- We can also conclude that x is the largest element in sorted region

# condition 1: Array is divided into 2 parts where first half is perfectly sorted and the second half is unsorted 

# condition 2: The last element of sorted region (x) is less than or equal to the minimum element of the unsorted region

-> So the question is how can we expand the sorted region and shrink the unsorted region.

> If x <= y and x is the largest element of sorted region and y is the smallest element of unsorted region and x <= y
> Then we can arrange y just after x
-----------------------------------------------------------------------------------------------------------------------------------------------

Q -> Given n integer values, arrange them in increasing order

Ex -> [14,2,54,-2,32,17,63]

> At the start of the algorithm the sorted region will be empty as the whole array is unsorted or in unsorted region
> So we get the minimum element from the unsorted region and swap it with the first element in the array

=> So another question is how can we get minimum element from the unsorted region:

-> We run a for loop in the unsorted region with comparing each and every element :

for (int i=0 ; i < n ; i++){
    ans = i;
}
And for every element we check whether it is smaller than ans.

We can store index as an answer because from index we can get element but not index from element/vice versa
-----------------------------------------------------------------------------------------------------------------------------------------------

=> Time and Space complexity:

# Time Complexity : O(n^2) for all cases (best,average,worst)
# space complexity : O(1) 
-----------------------------------------------------------------------------------------------------------------------------------------------

> Is selection sort In place? 

# An algorithm is considered In place if they do not depend on extra data structures for modifying data and implementing algorithm

=> In place means that you have not used any extra data structure to modify the data and implement the algorithm
In the selection sort program we are not taking any extra space, with the same input we are doing the modifications.

-> There are algorithms like merge sort which takes extra space and in that extra space they transfer the data to original array
Such kind of algorithms are not In place

-> Let's say we use recursion, in this there is space involved known as call stack, in that case your algorithm will be still 
In place but space complexity will be more than O(1), because we used that space for recursion and not for modifying the data.
Our data is still getting modified in the same data structure that was given in the input

-> The space complexity of algorithm can be higher and still be In place
-----------------------------------------------------------------------------------------------------------------------------------------------

# Is selection sort stable? => The answer is No
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Use cases of selection sort: We can use selection sort where swap operations are heavy Ex : Heavy files
