### Why Arrays Are Suitable for Heaps

Since heaps are **complete binary trees**, they can be represented in a very space-efficient manner using arrays without the need for pointers. A complete binary tree is a tree where all levels are fully filled except possibly the last, which is filled from left to right. This specific structure allows us to map the nodes of the tree to consecutive indices in an array.


### Array Representation of Heaps

In an array representation:

* The **root node** is stored at index `0`.
* For a node at any index `i`:
  * The **left child** is located at index `2i + 1`
  * The **right child** is located at index `2i + 2`
  * The **parent** is located at index `(i - 1) / 2` (for `i > 0`)

This mapping is valid for both max-heaps and min-heaps.

#### Example: Max-Heap Array Representation

Consider a max-heap with elements: `[40, 20, 30, 10, 5, 15, 25]`.

```markdown
        40
       /   \
     20     30
    /  \   /  \
   10   5 15  25

```


Using the array indices, we can represent it as:

* Root: `40` at index `0`
* Left child of `40`: `20` at index `1`
* Right child of `40`: `30` at index `2`
* Left child of `20`: `10` at index `3`
* Right child of `20`: `5` at index `4`
* Left child of `30`: `15` at index `5`
* Right child of `30`: `25` at index `6`

This structure is stored in an array as `[40, 20, 30, 10, 5, 15, 25]`.
