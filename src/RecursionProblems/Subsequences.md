In Common Data structures there are four terms we come across a lot

- Subarray
- Substring
- Subset
- Subsequence

Subarray and substring are pretty similar.Both of them talk about a contiguous section of array or a string 

Subarray -> suppose we have a array [1,2,3]

So the possible combinations will be [1,2,3] , [2,3] , [1,3] , [1] , [2] , [3].

Here [1,3] is not a subarray because they are not contiguous as they are not continuous,it's losing the sense of continuity

Same about string abc -> a,b,c, ab, bc, abc are all substrings
---------------------------------------------------------------------------------------------------------------------

- Subsequence : In a subsequence we build a string/array by removing one or more given elements and maintain the default order.

Suppose we have a array: [a,b,c] :

The possible subsequences of array are: 

[a,b,c]
[b,c] -> if we remove a
[a,c] -> if we remove b
[a,b] -> if we remove c
[a]
[b]
[c]
[]

Same can be done about string abc

abc
ab 
ac
bc
a
b
c
------------------------------------------------------------------------------------------------------------------------

Subset : Similar to subsequence without Boundation of order

[a,b,c] -> [c,a] , [b,c,a] , 