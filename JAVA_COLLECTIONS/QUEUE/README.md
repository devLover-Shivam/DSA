# Queue in Java Collection Framework

## 📌 Introduction

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.

> **The element that is inserted first is removed first.**

Think of it like a queue at a movie ticket counter:

- The first person to join the queue gets the ticket first.
- Every new person joins from the back.
- People leave only from the front.

Java provides the **Queue Interface** in the `java.util` package.

```java
import java.util.Queue;
```

---

# Queue Hierarchy

```text
                Collection
                     │
                  Iterable
                     │
                 java.util
                     │
                  Collection
                     │
                     Queue (Interface)
                 ┌─────┴──────────────┐
                 │                    │
          Deque (Interface)     PriorityQueue
           ┌────┴─────┐
           │          │
     ArrayDeque   LinkedList
```

---

# Characteristics of Queue

- Follows **FIFO (First In First Out)**
- Allows duplicate elements
- Stores elements in insertion order (except `PriorityQueue`)
- Usually does not allow random access
- Can contain `null` only in some implementations
- Mostly used for scheduling and processing tasks

---

# Queue Interface Methods

| Method | Description |
|----------|-------------|
| `add(E e)` | Inserts an element (throws exception if full) |
| `offer(E e)` | Inserts an element (returns `false` if failed) |
| `remove()` | Removes head element (throws exception if empty) |
| `poll()` | Removes head element (returns `null` if empty) |
| `element()` | Returns head element (throws exception if empty) |
| `peek()` | Returns head element (returns `null` if empty) |
| `size()` | Returns number of elements |
| `isEmpty()` | Checks whether queue is empty |
| `clear()` | Removes all elements |

---

# Difference Between Similar Methods

| Method Pair | Behavior |
|--------------|----------|
| `add()` vs `offer()` | `add()` throws an exception if insertion fails, `offer()` returns `false`. |
| `remove()` vs `poll()` | `remove()` throws an exception if empty, `poll()` returns `null`. |
| `element()` vs `peek()` | `element()` throws an exception if empty, `peek()` returns `null`. |

---

# Queue Implementations

Java provides multiple implementations depending on the use case.

---

## 1. LinkedList

```java
Queue<Integer> queue = new LinkedList<>();
```

### Characteristics

- FIFO order
- Dynamic size
- Fast insertion and deletion
- Implements both `Queue` and `Deque`

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert | O(1) |
| Remove | O(1) |
| Peek | O(1) |

### Best Used When

- General-purpose queue
- Breadth First Search (BFS)
- Task Scheduling

---

## 2. PriorityQueue

```java
Queue<Integer> pq = new PriorityQueue<>();
```

### Characteristics

- Elements are stored according to priority.
- Does **not** follow insertion order.
- Uses a **Binary Min Heap** internally.
- Smallest element comes out first by default.

### Example

```text
Inserted:
50 10 40 20

Removed:
10
20
40
50
```

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert | O(log n) |
| Remove | O(log n) |
| Peek | O(1) |

### Best Used When

- Dijkstra's Algorithm
- CPU Scheduling
- Priority-based Task Processing
- Event Scheduling

---

## 3. ArrayDeque

```java
Queue<Integer> queue = new ArrayDeque<>();
```

### Characteristics

- Faster than `LinkedList` in most cases
- Implemented using a resizable circular array
- Does **not** allow `null`
- Implements the `Deque` interface

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert | O(1) Amortized |
| Remove | O(1) |
| Peek | O(1) |

### Best Used When

- High-performance queue
- Sliding Window problems
- BFS
- Stack replacement

---

# Queue Subcategories

---

## 1. Simple Queue (FIFO)

Works on **First In First Out**.

### Example

```text
Insert:
10
20
30

Front → 10

Remove:
10
20
30
```

### Implementations

- LinkedList
- ArrayDeque

---

## 2. Priority Queue

Elements are removed according to priority rather than insertion order.

### Example

```text
Inserted:
50
20
100
10

Removed:
10
20
50
100
```

### Implementation

- PriorityQueue

---

## 3. Deque (Double Ended Queue)

A **Deque** allows insertion and deletion from **both the front and rear**.

It can behave as:

- Queue (FIFO)
- Stack (LIFO)

### Implementations

- ArrayDeque
- LinkedList

### Example

```text
Front ← 10 20 30 → Rear

Insert Front ✔
Insert Rear ✔

Delete Front ✔
Delete Rear ✔
```

---

# Queue vs Deque

| Feature | Queue | Deque |
|----------|--------|--------|
| Insert Front | ❌ | ✅ |
| Insert Rear | ✅ | ✅ |
| Delete Front | ✅ | ✅ |
| Delete Rear | ❌ | ✅ |
| FIFO | ✅ | Can behave as FIFO or LIFO |

---

# Queue vs Stack

| Queue | Stack |
|--------|--------|
| FIFO | LIFO |
| Insert at Rear | Push at Top |
| Remove from Front | Pop from Top |
| Used in Scheduling | Used in Undo Operations |

---

# Internal Working

## LinkedList Queue

```text
Front

10 → 20 → 30 → 40

Rear
```

### After Insertion

```text
10 → 20 → 30 → 40 → 50
```

### After Removal

```text
20 → 30 → 40 → 50
```

---

## PriorityQueue

Internally implemented using a **Binary Min Heap**.

```text
        5
      /   \
     10    15
    /  \
   30  40
```

The root always contains the highest-priority (smallest) element.

---

# Real-Life Applications

## Operating Systems

- CPU Scheduling
- Process Scheduling
- Printer Queue

## Graph Algorithms

- Breadth First Search (BFS)
- Level Order Traversal

## Networking

- Packet Processing
- Router Scheduling

## Web Applications

- Background Job Processing
- Message Queues
- Notification Systems

## Banking Systems

- Customer Service Queue
- Token Systems

## Gaming

- Event Handling
- Action Scheduling

---

# Which Queue Should You Use?

| Requirement | Recommended Implementation |
|-------------|----------------------------|
| General FIFO Queue | LinkedList |
| Better Performance | ArrayDeque |
| Priority-Based Processing | PriorityQueue |
| Queue + Stack Features | ArrayDeque |
| Insert/Delete from Both Ends | ArrayDeque or LinkedList |

---
# Summary

| Implementation | Ordering | Internal Structure | Insert | Remove | Peek | Allows `null` | Best Use Case |
|---------------|----------|--------------------|--------|--------|------|---------------|---------------|
| LinkedList | FIFO | Doubly Linked List | O(1) | O(1) | O(1) | Yes | General-purpose Queue, BFS |
| ArrayDeque | FIFO | Resizable Circular Array | O(1) Amortized | O(1) | O(1) | No | High-performance Queue, Stack |
| PriorityQueue | Priority Order | Binary Min Heap | O(log n) | O(log n) | O(1) | No | Scheduling, Shortest Path Algorithms, Priority Tasks |