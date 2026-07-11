# Stack in Java

> **"Stack is a linear data structure that follows the LIFO (Last In, First Out) principle."**

A **Stack** is one of the most commonly used data structures in DSA. In Java, `Stack` is a class that extends `Vector`, meaning it inherits all the methods of `Vector` while providing additional methods specific to stack operations.

The last element inserted into the stack is the **first element to be removed**.

---

# Real-Life Analogy

Imagine a stack of plates.

```
        _______
       | Plate |
       |_______|

        _______
       | Plate |
       |_______|

        _______
       | Plate |
       |_______|
```

- You always place a new plate on the **top**.
- You always remove the plate from the **top**.

This is exactly how a Stack works.

---

# LIFO Principle

```
Push(10)

Top
 ↓
10

----------------

Push(20)

Top
 ↓
20
10

----------------

Push(30)

Top
 ↓
30
20
10

----------------

Pop()

Top
 ↓
20
10
```

The **Last In (30)** is the **First Out (30)**.

---

# Declaration

```java
import java.util.Stack;
```

Creating a Stack

```java
Stack<Integer> stack = new Stack<>();
```

Another way

```java
List<Integer> stack = new Stack<>();
```

> **Note:**  
> If you use `List` as the reference type, you can only access methods available in the `List` interface. To use Stack-specific methods like `push()`, `pop()`, or `peek()`, declare the reference as `Stack`.

---

# Why Use Stack?

A Stack is useful when:

- Undo/Redo operations
- Function call management
- Expression evaluation
- Parentheses matching
- Browser history
- Backtracking algorithms
- DFS (Depth First Search)

---

# Characteristics

- Follows LIFO (Last In First Out)
- Allows duplicate elements
- Allows null values
- Dynamic in size
- Extends the `Vector` class
- Thread-safe (inherits synchronization from `Vector`)

---

# Time Complexities

| Operation | Time Complexity |
|-----------|-----------------|
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |
| search() | O(n) |
| empty() | O(1) |
| add() | O(1) (Amortized) |
| remove(index) | O(n) |
| get(index) | O(1) |

---

# Common List/Vector Methods

Since `Stack` extends `Vector`, it inherits all Vector methods.

## add()

Adds an element.

```java
stack.add(10);
```

---

## remove()

Removes an element by index.

```java
stack.remove(2);
```

---

## addAll()

Adds all elements from another collection.

```java
stack2.addAll(stack1);
```

---

## size()

Returns the number of elements.

```java
stack.size();
```

---

## clear()

Removes all elements.

```java
stack.clear();
```

---

## contains()

Checks whether an element exists.

```java
stack.contains(20);
```

---

## get()

Returns an element at a given index.

```java
stack.get(2);
```

---

## sort()

Sorts the stack.

```java
Collections.sort(stack);
```

> **Note:** Sorting changes the order of elements, so after sorting, the logical stack order is no longer preserved. In DSA, stacks are usually **not** sorted.

---

# Stack Specific Methods

---

## push()

Pushes an element onto the top of the stack.

```java
stack.push(100);
```

Example

```
Before

Top
40
30
20

After push(100)

Top
100
40
30
20
```

Time Complexity: **O(1)**

---

## pop()

Removes and returns the top element.

```java
stack.pop();
```

Example

```
Before

Top
100
40
30

After pop()

Top
40
30
```

Time Complexity: **O(1)**

---

## peek()

Returns the top element without removing it.

```java
stack.peek();
```

Time Complexity: **O(1)**

---

## search()

Searches for an element in the stack.

```java
stack.search(40);
```

Returns the **1-based position from the top**.

Example

```
Top
50
40
30
20
10
```

```
search(50) → 1

search(40) → 2

search(10) → 5

search(99) → -1
```

Time Complexity: **O(n)**

---

## empty()

Checks whether the stack is empty.

```java
stack.empty();
```

Returns

```
true
```

or

```
false
```

Time Complexity: **O(1)**

---

# Example

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek());

stack.pop();

System.out.println(stack);
```

Output

```
30

[10, 20]
```

---

# Stack vs Vector

| Stack | Vector |
|--------|--------|
| Follows LIFO | Dynamic Array |
| Has stack-specific methods | General-purpose List |
| Used in DSA | Used as a Collection |
| Extends Vector | Base class |

---

# Stack vs Queue

| Stack | Queue |
|--------|-------|
| LIFO | FIFO |
| Insert from Top | Insert from Rear |
| Remove from Top | Remove from Front |
| Used in DFS | Used in BFS |

---

### Why does Stack extend Vector?

Because Stack was introduced before the Collections Framework and was implemented on top of `Vector`, inheriting its dynamic array behavior and synchronization.

---

### Is Stack synchronized?

Yes.

Since `Stack` extends `Vector`, it is synchronized and therefore thread-safe.

---

### What principle does Stack follow?

**LIFO (Last In, First Out).**

---

### What does `search()` return?

It returns the **1-based position from the top** of the stack.

If the element is not present, it returns **-1**.

---

### Which method checks if a Stack is empty?

```java
stack.empty();
```

