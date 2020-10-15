# Data-Structures-and-Algorithms

### Big - O Notation
| Notation | Name |
| ------------- | ------------- |
| O(1) | Constant |
| O(logn) | Logarithmic |
| O(n) | Linear |
| O(nlogn) | n log-star n |
| O(n^2) | Quadratic |
<img alt = "Big O Notation" src="https://github.com/mehmetpekdemir/Data-Structures-and-Algorithms/blob/develop/docs/big-o-notation.png" width="300" />

### Array
| Operation  | Time Complexity |
| ------------- | ------------- |
| Retrieve with index.   | O(1) - Constant time |
| Retrieve without index.  | O(n) - Linear time |
| Add an element to full array. | O(n) - Linear time | 
| Add an element to the end of an array. (has space) | O(1) - Constant time |
| Insert or update an element at a specific index. | O(1) - Constant time |
| Delete an element by setting it to null. | O(1) - Constant time | 
| Delete an element by shifting elements. | O(n) - Linear time |

### Time Complexities of all Sorting Algorithms
##### Bubble Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n^2) - Quadratic time |
| Avarage Case | O(n^2) - Quadratic time |
| Best Case | O(n) - Linear time |

##### Selection Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n^2) - Quadratic time |
| Avarage Case | O(n^2) - Quadratic time |
| Best Case | O(n^2) - Quadratic time |

##### Insertion Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n^2) - Quadratic time |
| Avarage Case | O(n^2) - Quadratic time |
| Best Case | O(n) - Linear time |

##### Shell Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n^2) - Quadratic time |
| Avarage Case | O(nlogn) - n log-star n |
| Best Case | O(nlogn) - n log-star n |

##### Merge Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(nlogn) - n log-star n |
| Avarage Case | O(nlogn) - n log-star n |
| Best Case | O(nlogn) - n log-star n |

##### Quick Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n^2) - Quadratic time |
| Avarage Case | O(nlogn) - n log-star n |
| Best Case | O(nlogn) - n log-star n |

##### Counting Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(n+k) |
| Avarage Case | O(n+k) |
| Best Case | O(n+k) |

##### Radix Sort
| Performance  | Time Complexity |
| ------------- | ------------- |
| Worst Case | O(kn) |
| Avarage Case | O(kn) |
| Best Case | O(kn) |

### Performance analysis of ArrayList, LinkedList and Vector

##### ArrayList
| Operation  | Time Complexity |
| ------------- | ------------- |
| Insert at last index | O(1) --> If array copy operation is Considered then O(n)|
| Insert at given index | O(n) |
| Search by value | O(n) (	Preferred ) |
| Get by index| O(1) (	Preferred ) |
| Remove by value | O(n) |
| Remove by index | O(n) |

```java
ArrayList<Employee> employees = new ArrayList<>();
```

##### LinkedList
| Operation  | Time Complexity |
| ------------- | ------------- |
| Insert at last index | O(1) (	Preferred ) |
| Insert at given index | O(n) (	Preferred ) |
| Search by value | O(n) |
| Get by index| O(n) |
| Remove by value | O(n) (	Preferred ) |
| Remove by index | O(n) (	Preferred ) |

```java
LinkedList<Employee> employees= new LinkedList<>();
```

##### Vector

Vector : Unlike the new collection implementations, Vector is synchronized.
If a thread-safe implementation is not needed, it is recommended to use
ArrayList in place of Vector.

Performance: ArrayList is faster, since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe).
  
```java
Vector<Employee> employees = new Vector<>();
```

### Stack

##### ArrayStack

| Operation  | Time Complexity |
| ------------- | ------------- |
| Push | O(n) |
| Pop | O(1) |
| Peek | O(1) |

##### LinkedStack

| Operation  | Time Complexity |
| ------------- | ------------- |
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |


