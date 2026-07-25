# Set in Java Collection Framework

## Introduction

A **Set** is an interface in the **Java Collection Framework (JCF)** that stores a collection of **unique elements**. Unlike a `List`, a `Set` **does not allow duplicate values**. If you try to add an element that already exists in the set, the insertion is ignored.

A `Set` is useful when your application requires **uniqueness** rather than maintaining the order or position of elements.

### Real-Life Analogy

Imagine a **class attendance register**.

- Every student can sign the register **only once**.
- If a student tries to sign again, the register doesn't create another entry.
- The register only cares whether the student's name is present or not.

A `Set` works in exactly the same way.

---

## Why Do We Need a Set?

Consider the following scenario:

```java
List<String> names = new ArrayList<>();

names.add("Rahul");
names.add("Amit");
names.add("Rahul");

System.out.println(names);
```

**Output**

```
[Rahul, Amit, Rahul]
```

The duplicate value is stored.

Now using a `Set`:

```java
Set<String> names = new HashSet<>();

names.add("Rahul");
names.add("Amit");
names.add("Rahul");

System.out.println(names);
```

**Possible Output**

```
[Amit, Rahul]
```

Notice that `"Rahul"` appears only once.

---

# Characteristics of Set

- ✅ Stores only **unique elements**
- ✅ Duplicate elements are ignored
- ✅ Allows at most one `null` value (depends on implementation)
- ✅ Does **not** support indexing
- ✅ Elements are accessed using iterators or enhanced for-loops
- ✅ Different implementations provide different ordering behavior

---

# Hierarchy of Set in Java Collection Framework

```
                Iterable
                    │
                Collection
                    │
                  Set
        ┌──────────┼──────────┐
        │          │          │
    HashSet    LinkedHashSet  SortedSet
                                   │
                               NavigableSet
                                   │
                                 TreeSet
```

---

# Types of Set Implementations

## 1. HashSet

### Description

`HashSet` is the most commonly used implementation of the `Set` interface.

It stores elements using a **Hash Table**, providing very fast insertion, deletion, and searching.

### Characteristics

- Does not allow duplicates
- Does not maintain insertion order
- Elements appear in random order
- Allows one `null` value
- Fastest implementation for most operations

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| add() | O(1) Average |
| remove() | O(1) Average |
| contains() | O(1) Average |

---

## 2. LinkedHashSet

### Description

`LinkedHashSet` extends `HashSet` by maintaining a **Linked List** internally.

It preserves the **order in which elements were inserted**.

### Characteristics

- No duplicates
- Maintains insertion order
- Allows one `null`
- Slightly slower than `HashSet`

### Example

```java
Set<String> set = new LinkedHashSet<>();

set.add("Java");
set.add("Python");
set.add("C++");

System.out.println(set);
```

Output

```
[Java, Python, C++]
```

---

## 3. TreeSet

### Description

`TreeSet` stores elements in **sorted order**.

Internally it uses a **Red-Black Tree**, which is a self-balancing Binary Search Tree.

### Characteristics

- No duplicates
- Automatically sorts elements
- Does not allow `null`
- Slower than `HashSet`
- Can sort using natural ordering or a custom `Comparator`

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| add() | O(log n) |
| remove() | O(log n) |
| contains() | O(log n) |

### Example

```java
Set<Integer> set = new TreeSet<>();

set.add(40);
set.add(10);
set.add(30);
set.add(20);

System.out.println(set);
```

Output

```
[10, 20, 30, 40]
```

---

# SortedSet

`SortedSet` is an interface that extends `Set`.

It guarantees that elements remain **sorted** according to:

- Natural Ordering
- Custom Comparator

`TreeSet` is the most common implementation of `SortedSet`.

---

# NavigableSet

`NavigableSet` extends `SortedSet`.

It provides additional navigation methods such as:

- `lower()`
- `floor()`
- `ceiling()`
- `higher()`
- `pollFirst()`
- `pollLast()`

`TreeSet` implements `NavigableSet`.

---

# Comparison of Set Implementations

| Feature | HashSet | LinkedHashSet | TreeSet |
|----------|----------|---------------|----------|
| Duplicate Allowed | ❌ | ❌ | ❌ |
| Maintains Insertion Order | ❌ | ✅ | ❌ |
| Stores Sorted Data | ❌ | ❌ | ✅ |
| Allows null | ✅ One | ✅ One | ❌ |
| Internal Data Structure | Hash Table | Hash Table + Linked List | Red-Black Tree |
| add() Complexity | O(1) | O(1) | O(log n) |
| Search Complexity | O(1) | O(1) | O(log n) |

---

# Which Set Should You Use?

### Use **HashSet** when:

- You only need unique elements.
- Order doesn't matter.
- Maximum performance is required.

---

### Use **LinkedHashSet** when:

- You need unique elements.
- You also want to preserve insertion order.

---

### Use **TreeSet** when:

- You need unique elements.
- Elements should always remain sorted.
- You need navigation methods like `higher()`, `lower()`, or range-based operations.

---

# Summary

- `Set` stores **unique elements**.
- It does **not allow duplicates**.
- `HashSet` is the fastest and most commonly used implementation.
- `LinkedHashSet` preserves insertion order.
- `TreeSet` keeps elements sorted using a Red-Black Tree.
- `SortedSet` and `NavigableSet` are specialized interfaces for sorted and navigable collections.
- Choose the implementation based on whether you need **speed**, **order**, or **sorting**.