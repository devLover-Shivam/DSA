# Map in Java Collection Framework

## Introduction

`Map` is an **interface** in the **Java Collection Framework (JCF)** that stores data in the form of **key-value pairs**.

Unlike `List` and `Set`, a `Map` **does not extend the `Collection` interface** because it stores mappings rather than individual elements.

Each **key** in a `Map` is **unique**, while **values can be duplicated**.

A `Map` is mainly used when you need to **quickly retrieve data using a unique key**.

---

# Real-Life Analogy

Think of a **Dictionary**.

| Word (Key) | Meaning (Value) |
|------------|-----------------|
| Apple | A Fruit |
| Java | Programming Language |
| India | A Country |

When you search the dictionary, you use the **word (key)** to find its **meaning (value)**.

Similarly, a `Map` stores information in **key → value** format.

---

# Why Do We Need a Map?

Suppose you want to store the roll number and name of students.

Without a `Map`:

```java
List<Integer> rollNo = new ArrayList<>();
List<String> names = new ArrayList<>();
```

Finding the student with roll number `102` requires searching through both lists.

With a `Map`:

```java
Map<Integer, String> students = new HashMap<>();

students.put(101, "Rahul");
students.put(102, "Amit");
students.put(103, "Priya");
```

Searching becomes extremely easy:

```java
System.out.println(students.get(102));
```

Output

```
Amit
```

---

# Characteristics of Map

- Stores **key-value pairs**
- Keys are **unique**
- Values can be duplicated
- Provides fast searching using keys
- Different implementations provide different ordering and performance
- Cannot directly implement `Map` because it is an interface

---

# Hierarchy of Map

```
                   Map
                    │
        ┌───────────┼─────────────┐
        │           │             │
    HashMap     LinkedHashMap   SortedMap
                                     │
                               NavigableMap
                                     │
                                   TreeMap
        │
    Hashtable
```

---

# Types of Map Implementations

Java provides several implementations of the `Map` interface.

---

# 1. HashMap

## Description

`HashMap` is the most commonly used implementation of the `Map` interface.

It stores elements using a **Hash Table**, making insertion, deletion, and searching very fast.

### Characteristics

- Unique keys
- Duplicate values allowed
- Does not maintain insertion order
- Allows one `null` key
- Allows multiple `null` values
- Not synchronized
- Fastest implementation for general-purpose usage

### Internal Data Structure

```
Hash Table
```

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(1) Average |
| get() | O(1) Average |
| remove() | O(1) Average |
| containsKey() | O(1) Average |

### When to Use

Use `HashMap` when:

- Order doesn't matter
- Fast searching is required
- Most real-world applications

### Example

```java
Map<String, Integer> map = new HashMap<>();

map.put("A", 10);
map.put("B", 20);
```

---

# 2. LinkedHashMap

## Description

`LinkedHashMap` extends `HashMap` by maintaining a **Linked List** internally.

It preserves the **insertion order** of elements.

### Characteristics

- Maintains insertion order
- Unique keys
- Duplicate values allowed
- Allows one `null` key
- Slightly slower than `HashMap`

### Internal Data Structure

```
Hash Table + Doubly Linked List
```

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |

### When to Use

Use `LinkedHashMap` when:

- You need fast searching
- You also need insertion order

### Example

```java
Map<Integer, String> map = new LinkedHashMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

Output

```
{3=C, 1=A, 2=B}
```

---

# 3. TreeMap

## Description

`TreeMap` stores elements in **sorted order** based on the keys.

Internally it uses a **Red-Black Tree**, a self-balancing Binary Search Tree.

### Characteristics

- Keys are automatically sorted
- Duplicate keys not allowed
- Duplicate values allowed
- Does not allow `null` keys
- Slower than `HashMap`

### Internal Data Structure

```
Red-Black Tree
```

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |

### When to Use

Use `TreeMap` when:

- Keys should always remain sorted
- Range-based operations are required
- You need methods like `higherKey()`, `lowerKey()`, `ceilingKey()`, etc.

### Example

```java
Map<Integer, String> map = new TreeMap<>();

map.put(30, "C");
map.put(10, "A");
map.put(20, "B");

System.out.println(map);
```

Output

```
{10=A, 20=B, 30=C}
```

---

# 4. Hashtable

## Description

`Hashtable` is the **legacy implementation** of the `Map` interface.

It is synchronized, making it thread-safe, but slower than `HashMap`.

Today, `ConcurrentHashMap` is usually preferred for concurrent applications.

### Characteristics

- Thread-safe
- Synchronized
- Does not allow `null` key
- Does not allow `null` value
- Slower because of synchronization

### Internal Data Structure

```
Hash Table
```

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |

### When to Use

Use `Hashtable` only when working with legacy codebases. For modern multithreaded applications, prefer `ConcurrentHashMap`.

### Example

```java
Map<Integer, String> map = new Hashtable<>();

map.put(1, "Java");
map.put(2, "Python");
```

---

# SortedMap

`SortedMap` is an interface that extends `Map`.

It guarantees that keys remain sorted in ascending order (or according to a custom comparator).

The most common implementation is `TreeMap`.

---

# NavigableMap

`NavigableMap` extends `SortedMap`.

It provides navigation methods such as:

- `higherKey()`
- `lowerKey()`
- `ceilingKey()`
- `floorKey()`
- `firstEntry()`
- `lastEntry()`
- `pollFirstEntry()`
- `pollLastEntry()`

`TreeMap` implements `NavigableMap`.

---

# Comparison of Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap | Hashtable |
|----------|----------|---------------|----------|------------|
| Ordering | ❌ No | ✅ Insertion Order | ✅ Sorted by Keys | ❌ No |
| Duplicate Keys | ❌ | ❌ | ❌ | ❌ |
| Duplicate Values | ✅ | ✅ | ✅ | ✅ |
| Null Key | ✅ One | ✅ One | ❌ | ❌ |
| Null Values | ✅ Multiple | ✅ Multiple | ✅ | ❌ |
| Thread Safe | ❌ | ❌ | ❌ | ✅ |
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree | Hash Table |
| Search | O(1) | O(1) | O(log n) | O(1) |

---

# Time Complexity Comparison

| Operation | HashMap | LinkedHashMap | TreeMap | Hashtable |
|------------|----------|---------------|----------|------------|
| put() | O(1) | O(1) | O(log n) | O(1) |
| get() | O(1) | O(1) | O(log n) | O(1) |
| remove() | O(1) | O(1) | O(log n) | O(1) |
| containsKey() | O(1) | O(1) | O(log n) | O(1) |
| Iteration | O(n) | O(n) | O(n) | O(n) |

> **Note:** For hash-based maps (`HashMap`, `LinkedHashMap`, and `Hashtable`), the average-case complexity is **O(1)**. In rare situations with many hash collisions, operations can degrade to **O(log n)** in modern Java implementations.

---

# Which Map Should You Use?

### Use **HashMap** when:

- Maximum performance is required.
- Ordering of keys doesn't matter.
- This is the default choice for most applications.

---

### Use **LinkedHashMap** when:

- You need fast lookups.
- You want to preserve the order in which entries were inserted.

---

### Use **TreeMap** when:

- Keys must always remain sorted.
- You need range queries or navigation methods.

---

### Use **Hashtable** when:

- Maintaining or interacting with legacy synchronized code.
- For new multithreaded applications, prefer `ConcurrentHashMap` over `Hashtable`.

---



# Summary

- `Map` stores data as **key-value pairs**.
- Keys are **unique**, while values can be duplicated.
- `HashMap` offers the best average performance and is the default choice for most applications.
- `LinkedHashMap` maintains insertion order with nearly the same performance as `HashMap`.
- `TreeMap` keeps keys automatically sorted using a Red-Black Tree.
- `Hashtable` is synchronized and primarily used in legacy code.
- `SortedMap` and `NavigableMap` are specialized interfaces implemented by `TreeMap` for sorted and navigable key-based collections.
- Choose the implementation based on whether you need **speed**, **ordering**, **sorting**, or **thread safety**.