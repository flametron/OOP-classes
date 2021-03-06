# JCF

## Java Colletion Framework

`java.util` package  

A Collection represents a group of objects known as it's elements.  
Java Collection Framework is a set of classes and interfaces that implement common data structures like Array, LinkedList, Stack, Queue, Tree, Hashing, etc.  

The Root Interface in the collection hierarchy is `Collection<E>`. It is an *interface*.  
`<E>` Syntax tells us that the interface is generic.  
Generic means more type safety, it adds the compile time safety to the collections framework.  
And the **E** denotes **Element's DataType**.  

#### Benefit of JCF:

1. Reduces programming effort by providing useful datastructures and algorithms.
2. Increase program speed and quality.

**Map does not extend from java.util.Collection**, but still it is considered as a part of collection framework.  

We use **List** when sequence matters, i.e storing the elements in insertion order. It can also contain duplicate elements.  
We use **Set** when uniqueness matters, i.e no duplicate elements.  
We use **Map** when finding something by key matters.  


#### List:

- `ArrayList: ArrayList<Integer> AL = new ArrayList<Integer>();`
  1. it is like array, but no size limit, that is, it uses dynamic array for storing elements.
  2. we can specify some capacity during the declaration.
  3. initial capacity of ArrayList is 10, unless specified, but it depends on JDK implementation.
  4. ArrayList could be homogeneous or heterogeneous.
  We have size() method, but no capacity() method.  
  Formula of Capacity:  
    new_capacity = old_capacity + (old_capacity/2)



#### Vector:

Vectors have growth formula:  
`newCapacity = capacityIncrement > 0 ? oldCapacity + capacityIncrement : 2 * oldCapacity`

Vectors are Synchronized, but ArrayList is not.  
If multiple threads access ArrayList concurrently, then we must synchronize the block.  
Performance of ArrayList is better than Vector.


#### LinkedList:

- accessing an element in ArrayList is faster compared to LinkedList
- insertion or deletion of elements in LinkedList is faster compared to ArrayList, except the last element.

Features of LinkedList:

- LinkedList implements List, Deque and Queue interface
- as LinkedList implements Deque so, add, get, remove operation can be performed from rear and front ends. 


#### HashSet:

- Order of the elements in HashSet depends on the internal hash function.  
- HashSet class is backed by Hashtable which offers constant time performance for the basic operations add, remove, etc.   
- HashSet has 3 types of constructors.

Load Factor is a measure of how full the hash set is allowed to get before it's capacity automatically increases.


HashSet, it internally creates a HashMap and if we insert an element into this HashSet using add() method, it actually call put() method on internally created HashMap object with element we have specified as it’s key and constant Object called “PRESENT” as it’s value. So we can say that a Set achieves uniqueness internally through HashMap.

1. If map.put(key, value) returns null, then the statement "map.put(e, PRESENT) == null" will return true and element is added to the HashSet acked internally by HashMap.

2. If map.put(key, value) returns old value of the key, then the statement "map.put(e, PRESENT) == null" will return false and element is not dded to the HashSet backed internally by HashMap.

Logic of insertion into a hash map:

1. int hv = key.hashCode(); // Return  hash code
2. int h = hash(hv); // To avoid colision
3. int indexFor(int h, int L);

Why 16?
```java
int indexFor(int h,int L){
  return h&(L-1);
}
```


#### HashMap:

HashMap <Key, Value>  
Key must be unique  
Value can be duplicate  
Whether elements will be stored in sorted order or not depeds on internal hash function.  

For add, delete, get etc, operations time is constant O(1).  
Initial capacity - 16.  
Load Factor - 0.75.  


#### TreeMap:

Uses Red Black Tree  

- Red Black Tree needs lesser rotation than AVL tree.
- AVL Stores balance factor in each node which take O(N) extra space.
- If an application involves more insertion and deletion, then RB performance is better than AVL.
- AVL is more (rigidly) balanced than RB, hence searching takes less time in AVL than RB.

For Add, Delete, get, etc, operations time is O(log n)  
TreeMap gurentees order of elements.  


#### HashTable (synchronized):

Initial Capacity - 11  
Load Factor - 0.75  
Using a prime number (as in 11) as the size of the table, makes collision on the table rows less likely, so inserting is "cheaper".  
Resize to double or double+1  
