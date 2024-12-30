# These are some of the operations or method or approaches used in solving LL problems

> There are certain type of LL problems which are frequently asked

Such as :

1. Two pointers
2. Cycle questions
3. Cache question

### Pointer based Linked list questions :

Q -> Reversing Linked list :

### There are two approaches to reverse linked list

1. Using iterative approach : 
    - We use three pointers named as prev,curr,next 
    - We set prev to null and we keep reversing the addressing pointing to the nodes

2. Using recursive approach:
    - We must give a base case to check if the list is empty or not
    - Then we keep reversing links in unwinding phase

------------------------------------------------------------------------------------------------------------------------

Q -> Finding the middle of the linked list:


> Approach 1 :

- This one is simple,we traverse through the linked list two times.
- Once to check the total number of elements
- And second time to find the actual middle element by dividing the total number by 2.
- This will work in both even and odd linked list
- This approach is perfectly good but to reduce the number of iteration we can use approach 2.

> Approach 2:

- Suppose there are two runners x and y
- Both are going to start race from a point t
- The speed of runner x is double of y
- If both runner start at the same time, what we can say is
- By the time x reaches the ending line the y runner would have completed only half of the distance.
- This analogy we are going to use to find the middle element

> Considering the above analogy :

- We take two pointers slow and fast where both start from head.
- Here where start traverses double the speed of slow by the end slow is basically reached in the middle
- So we return slow at the end of the program

------------------------------------------------------------------------------------------------------------------------

Q -> Merging two sorted linked list :


> The main difficulty is handling a lot of corner cases in linked list.
> To handle these corner cases we introduce the concept of dummy node
> This dummy node will help to counter to all corner cases
> This dummy node will have the value -1
> We also have a pointer prev which will point to this node


- Now we will check the value in both the lists list 1 and list 2.
- If both the list values are same we pick the value from list 1.It doesn't really matter which we pick.
- we will use a relation prev.next = list 1 or list 2.
- prev = prev.next -> we move our previous pointer which was pointing to dummy node to the lesser element which we pick from list 1 or list 2
- Then we increment list 1 or list 2 pointer.
- We keep comparing list 1 and list 2 values and after getting the smaller element we put our prev pointer to that value.
- If any list is exhausted we directly link the remaining elements..
- The answer will not be the dummy node prevHead it will be prevHead.next.


-------------------------------------------------------------------------------------------------------------------------

Q -> Intersection of two Linked list :

Fast and slow runner approach:

Suppose there are two runners about to start the race from point a to b

- Assume the runner as x and y
- x has a bit of advantages to start the race from a further point
- To remove this advantage of x we also move y further
- Similar approach is being applied in this question
- In the question there is a point where both the element from the list is same
- But the problem is the unequal length of the linked list
- To tackle this we skip elements
- In example one the length of A is 5 and B is 6 so we subtract 6 - 5 = 1 we skip 1 element to bring both the list to equal size.
- First we find out the length of both list
- Then we figure out which is bigger
- If l1 is bigger move l1 by few steps and if l2 move l2 by few steps

-------------------------------------------------------------------------------------------------------------------------

Q -> Reorder List :

This question tests multiple concepts  

1. Find Middle: Use two pointers (fast and slow) to find the middle of the linked list.
2. Split List: Split the linked list into two halves.
3. Reverse Second Half: Reverse the second half of the linked list using a loop.
4. Merge Both Halves: Merge both halves back together in alternating order.

-------------------------------------------------------------------------------------------------------------------------


Q -> Detecting cycle in a linked list:

Approach : Floyd's Circle Detecting Algorithm

- The main goal of the question is to find a cycle in the LL
- Suppose there is a circular track
- Start time is same with same speed
- All of the runners will reach the ending point at the same time

> This is again the fast and slow pointer approach

- Two runners
- 1 runner x speed
- 2 runner with 2x speed

- Can i say,
- 1 runner -> 1 loop
- 2 runner -> 2 loops

or

- 1 runner -> 0.5 loop
- 2 runner -> 1 loop

or

1 runner -> 2 loop
2 runner -> 4 loops

- Even if we change the loops to even or odd number of times the result would be the same
- They would meet at the same point 

------------------------------------------------------------------------------------------------------------------------

Q -> Palindrome Linked list 

1. Use the two-pointer technique to find the middle of the list.
2. If the list has an odd number of elements, skip the middle element.
3. Reverse the second half of the list.
4. Compare the first half and the reversed second half to check if the list is a palindrome.

-----------------------------------------------------------------------------------------------------------------------

> All the further questions are combination of the above concepts a bit of mixup
