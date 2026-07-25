# ArrayDeque in Java

## What is ArrayDeque?

`ArrayDeque` is a class in the **Java Collections Framework** that implements the **Deque (Double Ended Queue)** interface.

A **Deque** allows insertion and deletion of elements from **both the front and the rear** of the collection.

Unlike `LinkedList`, `ArrayDeque` is implemented using a **resizable array**, making it faster for most queue and stack operations.

```java
Deque<Integer> q = new ArrayDeque<>();
```

Here,

- `Deque<Integer>` → Interface (Reference)
- `ArrayDeque<>()` → Implementation (Object)

Just like:

```java
List<Integer> list = new ArrayList<>();
Queue<Integer> q = new LinkedList<>();
Deque<Integer> d = new ArrayDeque<>();
```

---

# Why do we use ArrayDeque?

ArrayDeque is used when we need:

- Queue operations (FIFO)
- Stack operations (LIFO)
- Insertions/removals from both ends
- Better performance than `Stack` and `LinkedList` for most cases

It is one of the fastest general-purpose implementations for stacks and queues.

---

# Real Life Analogy

Imagine a **train compartment**.

Passengers can enter:

- From the **front door**
- From the **back door**

Similarly,

ArrayDeque allows insertion and deletion from **both ends**.

```
Front                                Rear

← 10 ← 5 ← 15 →
```

You can:

- Remove from front
- Remove from rear
- Insert at front
- Insert at rear

---

# Why is it called ArrayDeque?

Break the word:

**Array**
- Uses a dynamically resizing array internally.

**Deque**
- Double Ended Queue.

Meaning:

> A deque implemented using a dynamic array.

---

# Syntax

```java
Deque<Integer> deque = new ArrayDeque<>();
```

Explanation:

### Deque

Reference type (interface)

### Integer

Type of data stored.

### ArrayDeque<>()

Creates the object.

---

# Internal Working

Internally ArrayDeque stores elements inside a circular dynamic array.

Whenever the array becomes full:

- A larger array is created.
- Existing elements are copied.
- Capacity increases automatically.

You don't need to resize it manually.

---

# Important Characteristics

- Dynamic size
- Allows insertion/removal from both ends
- Faster than Stack
- Usually faster than LinkedList for deque operations
- Does **NOT** allow `null` elements
- Not synchronized (not thread-safe)

---

# Queue Operations using ArrayDeque

Your code:

```java
Deque<Integer> q = new ArrayDeque<>();
```

Initially

```
[]
```

---

# offer()

```java
q.offer(5);
```

Adds element at the rear.

Queue

```
Front
 ↓
[5]
 ↑
Rear
```

Output

```
[5]
```

---

# offerFirst()

```java
q.offerFirst(10);
```

Adds element at the front.

Before

```
[5]
```

After

```
[10, 5]
```

Explanation

```
Front
 ↓
10 5
 ↑
Rear
```

---

# offerLast()

```java
q.offerLast(15);
```

Adds element at the rear.

Before

```
[10,5]
```

After

```
[10,5,15]
```

Output

```
[10, 5, 15]
```

---

# Printing

```java
System.out.println(q);
```

Output

```
[10, 5, 15]
```

---

# pollLast()

```java
q.pollLast();
```

Removes last element.

Before

```
[10,5,15]
```

Removed

```
15
```

After

```
[10,5]
```

Output

```
[10, 5]
```

---

# pollFirst()

```java
q.pollFirst();
```

Removes front element.

Before

```
[10,5]
```

Removed

```
10
```

After

```
[5]
```

Output

```
[5]
```

---

# Final Queue Output

```
offer(5)

[5]

↓

offerFirst(10)

[10,5]

↓

offerLast(15)

[10,5,15]

↓

pollLast()

[10,5]

↓

pollFirst()

[5]
```

---

# Stack Implementation using ArrayDeque

Instead of using

```java
Stack<Integer> stack = new Stack<>();
```

Modern Java recommends

```java
Deque<Integer> stack = new ArrayDeque<>();
```

because it is faster.

---

# push()

```java
d.push(10);
```

Pushes element to the top.

Stack

```
Top
 ↓
10
```

---

```java
d.push(20);
```

Stack

```
Top
 ↓
20
10
```

---

```java
d.push(30);
```

Stack

```
Top
 ↓
30
20
10
```

Printing

```
[30,20,10]
```

Notice:

Top appears first.

---

# pop()

```java
d.pop();
```

Removes top element.

Before

```
30
20
10
```

Removed

```
30
```

Remaining

```
20
10
```

Output

```
[20,10]
```

---

# peek()

```java
System.out.println(d.peek());
```

Returns top element without removing it.

Current Stack

```
20
10
```

Returns

```
20
```

Stack remains

```
20
10
```

---

# Complete Dry Run

## Queue Part

```
Start

[]

↓

offer(5)

[5]

↓

offerFirst(10)

[10,5]

↓

offerLast(15)

[10,5,15]

↓

pollLast()

[10,5]

↓

pollFirst()

[5]
```

---

## Stack Part

```
Start

[]

↓

push(10)

[10]

↓

push(20)

[20,10]

↓

push(30)

[30,20,10]

↓

pop()

[20,10]

↓

peek()

20
```

---

# Queue vs Stack in ArrayDeque

| Queue | Stack |
|---------|--------|
| offer() | push() |
| poll() | pop() |
| peek() | peek() |
| FIFO | LIFO |

---

# Time Complexity

| Operation | Time Complexity |
|------------|-----------------|
| offerFirst() | O(1) |
| offerLast() | O(1) |
| pollFirst() | O(1) |
| pollLast() | O(1) |
| peekFirst() | O(1) |
| peekLast() | O(1) |
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |

All operations are **O(1)** amortized because the internal array resizes only occasionally.

---

# Commonly Used Methods

| Method | Description |
|---------|-------------|
| offer() | Inserts at rear |
| offerFirst() | Inserts at front |
| offerLast() | Inserts at rear |
| poll() | Removes front |
| pollFirst() | Removes front |
| pollLast() | Removes rear |
| peek() | Returns front element |
| peekFirst() | Returns front element |
| peekLast() | Returns rear element |
| push() | Pushes to top (stack) |
| pop() | Removes top |
| size() | Returns number of elements |
| isEmpty() | Checks if deque is empty |
| clear() | Removes all elements |
| contains(x) | Checks if element exists |

---

# ArrayDeque vs LinkedList

| Feature | ArrayDeque | LinkedList |
|---------|------------|------------|
| Internal Structure | Dynamic Array | Doubly Linked List |
| Queue Operations | Very Fast | Fast |
| Stack Operations | Very Fast | Fast |
| Memory Usage | Lower | Higher (extra node references) |
| Allows null | ❌ No | ✅ Yes |
| Cache Performance | Better | Worse |
| Recommended for Queue/Stack | ✅ Yes | Only when linked-list features are specifically needed |



---

# Complete Example

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Queue Example
        Deque<Integer> q = new ArrayDeque<>();

        q.offer(5);
        q.offerFirst(10);
        q.offerLast(15);

        System.out.println(q);      // [10, 5, 15]

        q.pollLast();
        System.out.println(q);      // [10, 5]

        q.pollFirst();
        System.out.println(q);      // [5]

        // Stack Example
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);  // [30, 20, 10]

        stack.pop();
        System.out.println(stack);  // [20, 10]

        System.out.println(stack.peek()); // 20
    }
}
```