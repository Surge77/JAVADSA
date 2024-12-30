=> Bubble Sort:

Suppose we have been given an array

unsorted  sorted
<-----> <----->
14 6 8  33 35

1. The data is divided into two parts where 2nd part is sorted and the first part is unsorted
2. The max value from unsorted region is lesser than or equal to the least element of sorted region
3. We cannot immediately shift the element but instead we have to bubble up (swapping)

Like real life scenario where the bigger bubble always rise up first

- In every iteration bubble up the max element to it's correct position
-----------------------------------------------------------------------------------------------------------------------------------------

# Time complexity of Bubble sort => O(n^2) -> Worst case

The worst case complexity looks similar to selection sort, but in worst case it is a bit worse than selection sort because in selection 
sort we were just having n^2 comparisons but in bubble we have b^2 comparisons and n^2 swaps

No of swaps are high in bubble sort

- The bubble sort is efficient when the array is already sorted.
-----------------------------------------------------------------------------------------------------------------------------------------

# Is bubble sort in-place? => Because we are using the same array in order to compare the adjacent elements

# is bubble sort stable => yes