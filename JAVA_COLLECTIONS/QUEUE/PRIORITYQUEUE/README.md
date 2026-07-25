# Priority Queue in Java

## What is a Priority Queue?

A **Priority Queue** is a special type of queue where elements are processed based on their **priority** instead of the order in which they were inserted.

In a normal queue (FIFO):

> First In → First Out

In a Priority Queue:

> Highest Priority → Removed First

The element that has the highest priority is always available at the front of the queue.

---

## Real-Life Analogy

Imagine a hospital emergency room.

People don't get treated based on who arrived first.

Instead:

- Critical patient → Highest Priority
- Serious patient → Medium Priority
- Normal patient → Lowest Priority

Even if a critical patient arrives later, they will be treated before others.

Priority Queue works exactly the same way.

---

## Why Do We Use Priority Queue?

Priority Queue is useful whenever the order of processing depends on **priority** rather than insertion order.

### Common Use Cases

- CPU Process Scheduling
- Dijkstra's Shortest Path Algorithm
- Prim's Algorithm
- Huffman Coding
- Task Scheduling
- Event Simulation
- Hospital Management Systems
- Job Scheduling

---

# Creating a Priority Queue

```java
Queue<Integer> pq = new PriorityQueue<>();
```

### Breakdown

```java
Queue<Integer>
```

We are referring to the object using the Queue interface.

```java
PriorityQueue<>()
```

Creates a Priority Queue object.

---

# Default Behavior

For numbers,

Java's Priority Queue behaves like a **Min Heap**.

That means:

> Smaller number = Higher Priority

Example

```java
pq.offer(40);
pq.offer(30);
pq.offer(10);
pq.offer(20);
```

The queue internally rearranges the elements.

Although inserted as

```
40
30
10
20
```

The highest priority element becomes

```
10
```

because it is the smallest.

---

# Example

```java
Queue<Integer> pq = new PriorityQueue<>();

pq.offer(40);
pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll());
```

Output

```
10
```

The smallest element is removed first.

---

# Understanding poll()

```java
pq.poll();
```

Removes and returns the element having the **highest priority**.

For a Min Heap,

Highest Priority = Smallest Element

---

# Dry Run

Inserted

```
40
30
10
20
```

Priority Queue internally becomes (conceptually)

```
        10
       /  \
     20    30
    /
  40
```

Calling

```java
pq.poll();
```

removes

```
10
```

Remaining

```
20
30
40
```

---

# Why Does Printing Look Unsorted?

Example

```java
System.out.println(pq);
```

Output may be

```
[20, 40, 30]
```

Many beginners think Priority Queue stores elements in sorted order.

It does **NOT**.

It stores elements according to **Heap Structure**.

Only one thing is guaranteed:

```
The first element is always the highest priority.
```

Everything else depends on heap arrangement.

---

# Heap Structure

Priority Queue internally uses a **Binary Heap**.

It is a Complete Binary Tree.

Example

```
        20
       /  \
     40    30
```

Notice

```
20 < 40
20 < 30
```

This satisfies the Min Heap property.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| offer() | O(log n) |
| poll() | O(log n) |
| peek() | O(1) |
| size() | O(1) |
| isEmpty() | O(1) |

---

# Changing Priority

Sometimes we don't want the smallest element first.

Suppose we want

```
40
30
20
10
```

to be removed in this order.

That means

Largest Number = Highest Priority

For that we use a **Comparator**.

---

# What is a Comparator?

A Comparator tells Java

> "How should two objects be compared?"

Instead of Java deciding the order, we define our own rules.

Syntax

```java
Comparator<T>
```

where `T` is the datatype.

---

# Comparator Using Lambda Expression

```java
Queue<Integer> mh =
        new PriorityQueue<>((a, b) -> b - a);
```

This creates a **Max Heap**.

---

# Breaking Down the Syntax

```java
(a, b) -> b - a
```

This is called a **Lambda Expression**.

It is a shorter way of writing an anonymous comparator.

Equivalent code

```java
Comparator<Integer> cmp = new Comparator<Integer>() {

    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }

};

Queue<Integer> mh = new PriorityQueue<>(cmp);
```

Both are exactly the same.

Lambda is simply shorter.

---

# Understanding

```java
(a, b)
```

These are the two elements Java wants to compare.

Suppose

```
a = 10
b = 30
```

Now evaluate

```java
b - a
```

```
30 - 10 = 20
```

Positive value

Java understands

```
30 should come before 10
```

Therefore

```
30 gets higher priority.
```

---

Another example

```
a = 40
b = 20
```

```
b - a

20 - 40

= -20
```

Negative value

Java understands

```
40 should come before 20
```

Therefore

```
40 gets higher priority.
```

---

# Comparator Return Values

The comparator's `compare(a, b)` method follows these rules:

| Return Value | Meaning |
|--------------|---------|
| Negative | `a` should come before `b` |
| Positive | `b` should come before `a` |
| Zero | Both are considered equal |

---

# Max Heap Example

```java
Queue<Integer> mh =
        new PriorityQueue<>((a, b) -> b - a);

mh.offer(40);
mh.offer(30);
mh.offer(10);
mh.offer(20);

System.out.println(mh.poll());
```

Output

```
40
```

Largest element is removed first.

---

# Min Heap Comparator

Although Java already uses this by default,

you can explicitly write it.

```java
Queue<Integer> pq =
        new PriorityQueue<>((a, b) -> a - b);
```

or

```java
Queue<Integer> pq =
        new PriorityQueue<>(Integer::compare);
```

Both create a Min Heap.

---

# Max Heap Using Built-in Comparator

Instead of writing

```java
(a, b) -> b - a
```

Java provides

```java
Queue<Integer> pq =
        new PriorityQueue<>(Collections.reverseOrder());
```

This is the recommended approach because it avoids integer overflow that can occur with subtraction.

---

# Priority Queue of Custom Objects

Suppose we have a Student class.

```java
class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}
```

If we write

```java
Queue<Student> pq =
        new PriorityQueue<>();
```

Java throws an exception because it doesn't know how to compare two `Student` objects.

We must provide a Comparator.

Example

```java
Queue<Student> pq =
new PriorityQueue<>((s1, s2) -> s2.marks - s1.marks);
```

Now

Student having more marks gets higher priority.

---

# Another Example

```java
class Task {

    String task;
    int priority;

    Task(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

}
```

Priority Queue

```java
Queue<Task> tasks =
new PriorityQueue<>((t1, t2) ->
        t2.priority - t1.priority);
```

Now

```
Priority 10
```

will always come before

```
Priority 5
```

---

# Summary

- Priority Queue processes elements based on priority instead of insertion order.
- Java's default `PriorityQueue` is a **Min Heap**.
- Smallest element has the highest priority by default.
- Internally it uses a **Binary Heap**.
- `offer()` inserts an element.
- `poll()` removes the highest-priority element.
- `peek()` returns the highest-priority element without removing it.
- Printing a Priority Queue does **not** show elements in sorted order.
- A **Comparator** defines custom ordering.
- `(a, b) -> b - a` creates a **Max Heap** for integers.
- `Collections.reverseOrder()` is a safer and more readable way to create a Max Heap.
- For custom classes, you must provide a Comparator unless the class implements `Comparable`.