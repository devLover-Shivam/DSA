# LinkedList in Java

> **"LinkedList is a doubly linked list implementation of the `List` interface that stores elements as nodes instead of contiguous memory locations."**

`LinkedList` is one of the most important classes in the Java Collections Framework (JCF). It is mainly used when **frequent insertion and deletion** operations are required.

Unlike `ArrayList`, a `LinkedList` does **not** store elements in a continuous block of memory. Instead, each element is stored inside a **Node**, where every node contains:

- The data
- Address of the previous node
- Address of the next node

---

# Declaration

```java
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
```

```java
LinkedList<Integer> list = new LinkedList<>();
```

Other ways of creating a LinkedList:

```java
List<Integer> list = new LinkedList<>();

Collection<Integer> list = new LinkedList<>();
```

---

# Why Use LinkedList?

Use a `LinkedList` when:

- Frequent insertion is required.
- Frequent deletion is required.
- You don't need very fast random access.

---

# Internal Working

A LinkedList stores data in the form of **nodes**.

```
Head

↓

+------+-----+-----+
| 10 | • | • | ---->
+------+-----+-----+

        ↓

+------+-----+-----+
| 20 | • | • | ---->
+------+-----+-----+

        ↓

+------+-----+-----+
| 30 | • | • | ---->
+------+-----+-----+

                ↓

               NULL
```

Each node stores:

- Data
- Previous Node Address
- Next Node Address

Because of this structure:

- Insertion is fast.
- Deletion is fast.
- Random access is slower than ArrayList.

---

# Characteristics

- Maintains insertion order.
- Allows duplicate elements.
- Allows null values.
- Dynamic in size.
- Implements List, Queue and Deque.
- Stores elements as nodes.

---

# Time Complexities

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(1) |
| addFirst() | O(1) |
| addLast() | O(1) |
| get(index) | O(n) |
| set(index, element) | O(n) |
| removeFirst() | O(1) |
| removeLast() | O(1) |
| remove(index) | O(n) |
| contains() | O(n) |
| size() | O(1) |
| clear() | O(n) |

---

# Common Methods

## add()

Adds an element at the end.

```java
list.add(10);
list.add(20);
list.add(30);
```

Output

```
[10, 20, 30]
```

---

## remove()

Removes an element using its index.

```java
list.remove(0);
```

Output

```
[20, 30]
```

---

## addAll()

Adds all elements of one collection into another.

```java
list.addAll(arr);
```

---

## removeAll()

Removes all matching elements from another collection.

```java
list.removeAll(arr);
```

---

## size()

Returns the number of elements.

```java
list.size();
```

---

## clear()

Removes every element.

```java
list.clear();
```

---

## isEmpty()

Checks whether the LinkedList is empty.

```java
list.isEmpty();
```

Returns

```
true
```

or

```
false
```

---

## get()

Returns the element at a particular index.

```java
list.get(2);
```

---

## set()

Updates an element.

```java
list.set(1, 100);
```

---

## contains()

Checks whether an element exists.

```java
list.contains(20);
```

---

## indexOf()

Returns the first occurrence.

```java
list.indexOf(20);
```

---

## lastIndexOf()

Returns the last occurrence.

```java
list.lastIndexOf(20);
```

---

## toArray()

Converts a LinkedList into an array.

```java
Object[] arr = list.toArray();
```

---

## clone()

Creates a shallow copy.

```java
LinkedList<Integer> copy = (LinkedList<Integer>) list.clone();
```

---

# Traversing a LinkedList

## Enhanced For Loop

```java
for(int num : list){

    System.out.println(num);

}
```

---

## Iterator

```java
Iterator<Integer> itr = list.iterator();

while(itr.hasNext()){

    System.out.println(itr.next());

}
```

---

# LinkedList Specific Methods

Unlike `ArrayList`, `LinkedList` also implements the **Deque** interface, giving it many additional methods.

---

## addFirst()

Adds an element at the beginning.

```java
list.addFirst(5);
```

---

## addLast()

Adds an element at the end.

```java
list.addLast(100);
```

---

## getFirst()

Returns the first element.

```java
list.getFirst();
```

---

## getLast()

Returns the last element.

```java
list.getLast();
```

---

## removeFirst()

Removes the first element.

```java
list.removeFirst();
```

---

## removeLast()

Removes the last element.

```java
list.removeLast();
```

---

## peek()

Returns the first element without removing it.

```java
list.peek();
```

---

## peekFirst()

Returns the first element.

```java
list.peekFirst();
```

---

## peekLast()

Returns the last element.

```java
list.peekLast();
```

---

## offer()

Adds an element at the end.

```java
list.offer(500);
```

---

## offerFirst()

Adds an element at the beginning.

```java
list.offerFirst(1);
```

---

## offerLast()

Adds an element at the end.

```java
list.offerLast(999);
```

---

## poll()

Returns and removes the first element.

```java
list.poll();
```

---

## pollFirst()

Returns and removes the first element.

```java
list.pollFirst();
```

---

## pollLast()

Returns and removes the last element.

```java
list.pollLast();
```

---

## push()

Pushes an element at the beginning.

```java
list.push(50);
```

Useful when using a LinkedList as a **Stack**.

---

## pop()

Removes and returns the first element.

```java
list.pop();
```

---

## descendingIterator()

Traverses the LinkedList from last to first.

```java
Iterator<Integer> itr = list.descendingIterator();

while(itr.hasNext()){

    System.out.print(itr.next()+" ");

}
```

---

# LinkedList vs ArrayList

| LinkedList | ArrayList |
|------------|-----------|
| Stores elements as Nodes | Stores elements in a Dynamic Array |
| Fast insertion and deletion | Fast random access |
| get(index) is O(n) | get(index) is O(1) |
| More memory required | Less memory required |
| Implements List + Queue + Deque | Implements only List |

---

# When Should You Use LinkedList?

Use LinkedList when:

- You frequently insert elements at the beginning.
- You frequently delete elements.
- Queue or Deque operations are required.
- Random access is not the primary requirement.
