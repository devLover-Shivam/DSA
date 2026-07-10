# Vector in Java

> **"Vector is a dynamic array implementation of the `List` interface that is synchronized, making it thread-safe."**

`Vector` was introduced in **JDK 1.0**, before the Java Collections Framework (JCF). Later, when JCF was introduced in Java 1.2, `Vector` was modified to implement the `List` interface.

Today, `Vector` is rarely used in modern applications because `ArrayList` provides better performance in single-threaded environments.

---

# Declaration

```java
import java.util.Vector;
```

```java
Vector<Integer> vector = new Vector<>();
```

Other ways:

```java
List<Integer> vector = new Vector<>();

Collection<Integer> vector = new Vector<>();
```

---

# Why Use Vector?

Use `Vector` when:

- Multiple threads access the same collection simultaneously.
- Thread safety is required.
- Data consistency is more important than performance.

---

# Characteristics

- Dynamic in size.
- Maintains insertion order.
- Allows duplicate elements.
- Allows null values.
- Index-based access.
- Thread-safe (Synchronized).
- Slower than ArrayList.

---

# Time Complexities

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(1) (Amortized) |
| add(index, element) | O(n) |
| get(index) | O(1) |
| set(index, element) | O(1) |
| remove(index) | O(n) |
| contains() | O(n) |
| size() | O(1) |
| clear() | O(n) |

---

# Common Methods

Most methods are exactly the same as `ArrayList`.

## add()

```java
vector.add(10);
```

Adds an element at the end.

---

## get()

```java
vector.get(0);
```

Returns the element at a particular index.

---

## set()

```java
vector.set(0,100);
```

Replaces an element.

---

## remove()

```java
vector.remove(1);
```

Removes an element.

---

## addAll()

```java
vector.addAll(list);
```

Adds another collection.

---

## removeAll()

```java
vector.removeAll(list);
```

Removes another collection.

---

## contains()

```java
vector.contains(50);
```

Checks whether an element exists.

---

## size()

```java
vector.size();
```

Returns the number of elements.

---

## clear()

```java
vector.clear();
```

Removes all elements.

---

## clone()

```java
Vector<Integer> copy = (Vector<Integer>) vector.clone();
```

Creates a shallow copy.

---

## iterator()

```java
Iterator<Integer> itr = vector.iterator();
```

Traverses the Vector.

---

# Methods Specific to Vector

Although `Vector` implements the `List` interface, it also contains some **legacy methods** that existed before the Collections Framework.

## addElement()

```java
vector.addElement(100);
```

Equivalent to:

```java
vector.add(100);
```

---

## elementAt()

```java
vector.elementAt(0);
```

Equivalent to:

```java
vector.get(0);
```

---

## firstElement()

```java
vector.firstElement();
```

Returns the first element.

---

## lastElement()

```java
vector.lastElement();
```

Returns the last element.

---

## removeElement()

```java
vector.removeElement(20);
```

Removes the first occurrence of an element.

---

## removeElementAt()

```java
vector.removeElementAt(1);
```

Removes the element at a particular index.

---

## removeAllElements()

```java
vector.removeAllElements();
```

Equivalent to:

```java
vector.clear();
```

---

## capacity()

```java
vector.capacity();
```

Returns the current capacity of the vector.

---

# ArrayList vs Vector

| ArrayList | Vector |
|-----------|--------|
| Not synchronized | Synchronized |
| Faster | Slower |
| Introduced in Java 1.2 | Introduced in JDK 1.0 |
| Not thread-safe | Thread-safe |
| Preferred in modern applications | Used mainly in legacy code |

---

# What is Synchronization?

Imagine two people trying to write on the same whiteboard at the exact same time.

Without any rule, both may overwrite each other's work, leading to incorrect data.

This situation is called a **Race Condition**.

Synchronization ensures that **only one thread can modify the collection at a time**, preventing data corruption.

---

# Real-Life Analogy

Imagine there is a single ATM.

Without any rule:

```
Person A ---> Withdraw ₹500

Person B ---> Deposit ₹1000

Both access simultaneously
```

The account balance might become incorrect because both operations happen at the same time.

Now imagine there's a security guard.

```
Person A enters.

Door Locked.

Person B waits.

Person A leaves.

Door Unlocks.

Person B enters.
```

Only one person can use the ATM at a time.

The **security guard** is similar to Java's **lock**.

---

# How Vector Implements Synchronization

Every important method in `Vector` is synchronized.

For example:

```java
public synchronized boolean add(E e)
```

When a thread calls `add()`:

```
Thread A
      │
      ▼
 Acquires Lock
      │
 Performs Operation
      │
 Releases Lock

Thread B waits...
```

Only after Thread A releases the lock can Thread B execute.

This guarantees data consistency.

---

# Why is Vector Slower?

Before executing most operations, `Vector` has to:

1. Acquire the lock.
2. Perform the operation.
3. Release the lock.

Every method call performs these extra steps.

This additional work is called **Synchronization Overhead** or **Computational Overhead**.

Even if your program has only one thread, `Vector` still performs locking, making it slower than `ArrayList`.

---

# How ArrayList Handles Synchronization

`ArrayList` **does not perform synchronization internally**.

This makes it much faster.

If synchronization is required, Java allows us to create a synchronized view of an `ArrayList`.

```java
List<Integer> list = Collections.synchronizedList(new ArrayList<>());
```

Now:

- Only one thread can access the list at a time.
- Thread safety is achieved.
- Synchronization is added **only when required**.

This is one reason why `ArrayList` is preferred over `Vector`.

---

# Which One Should You Use?

### Use ArrayList when

- Working in a single-threaded application.
- Performance is important.
- Most modern applications.

---

### Use Vector when

- Maintaining legacy code.
- Thread safety is required and Vector is already being used.
- You're specifically asked about Vector in interviews.

---



### Why is Vector slower than ArrayList?

Because every important method in `Vector` is synchronized, requiring a lock to be acquired and released before the operation.

---

### Is Vector thread-safe?

Yes.

---

### Is ArrayList thread-safe?

No.

---

### Can ArrayList be made thread-safe?

Yes.

```java
Collections.synchronizedList(new ArrayList<>());
```

---

### Which one is preferred today?

`ArrayList`, because synchronization can be added only when needed, avoiding unnecessary overhead.

