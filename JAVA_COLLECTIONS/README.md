# Java Collections Framework (JCF)

> "A collection is simply a group of objects stored together so they can be managed efficiently."

The **Java Collections Framework (JCF)** provides a set of classes and interfaces that make it easy to store, retrieve, manipulate, and process groups of objects.

Instead of creating our own data structures from scratch, Java provides optimized implementations like **ArrayList, LinkedList, HashSet, HashMap, PriorityQueue**, etc.

---

# Why Do We Need Collections?

Imagine you're building an application that stores student records.

Without Collections:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
Student s4 = new Student();
```

Now imagine there are **10,000 students**.

Managing them individually becomes impossible.

You could use arrays:

```java
Student[] students = new Student[10000];
```

But arrays have several limitations.

### Limitations of Arrays

- Fixed size
- Can store only one type of data
- Inserting or deleting elements is expensive
- No built-in searching or sorting methods
- Cannot grow dynamically

Collections solve all these problems.

---

# Real-Life Analogy

Imagine a **library**.

A library contains:

- Books
- Shelves
- Sections
- Librarian

The books are stored in different ways depending on the requirement.

For example:

- Books arranged by order → ArrayList
- Books connected like a chain → LinkedList
- Books where duplicate copies aren't allowed → HashSet
- Books sorted alphabetically → TreeSet
- Book ID → Book Name mapping → HashMap
- Highest priority books at the front → PriorityQueue

Java Collections work exactly like this.

Different collection classes organize data differently depending on your needs.

---

# Java Collections Hierarchy

```
                Iterable
                    |
                Collection (Interface)
              /         |         \
            List       Set      Queue
             |          |          |
     -----------------------------
     |             |             |
 ArrayList   LinkedList     Vector

 HashSet     LinkedHashSet     TreeSet

 PriorityQueue      ArrayDeque

Map (Separate Interface)

HashMap
LinkedHashMap
TreeMap
Hashtable
```

Notice that **Map is NOT a child of Collection.**

---

# What is an Interface?

An interface is a blueprint that contains method declarations but not their implementations.

Example:

```java
interface Animal {

    void sound();

}
```

The interface only says:

> Every Animal must have a sound() method.

It doesn't say **how** the sound should be produced.

---

# Why Can't We Create Objects of an Interface?

Suppose we write

```java
Collection obj = new Collection();
```

This gives an error.

Why?

Because an interface has **no implementation**.

Think of an interface as the blueprint of a house.

Blueprint:

```
Kitchen
Bedroom
Bathroom
```

Can you live inside the blueprint?

No.

Someone has to actually construct the house.

Similarly,

Collection is only a blueprint.

Classes like ArrayList, LinkedList and HashSet actually implement that blueprint.

---

# Then Why Do We Write This?

```java
Collection<Integer> numbers = new ArrayList<>();
```

Instead of

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

This is one of the most important concepts in Java.

Let's understand.

---

# Real-Life Analogy

Suppose you say:

> I own a Vehicle.

You are talking generally.

Tomorrow you may buy

- Car
- Bike
- Bus

All of them are Vehicles.

If you say

> I own a BMW.

Now you're tightly coupled to BMW.

Changing later becomes difficult.

Similarly,

Collection is the general type.

ArrayList is one implementation.

Tomorrow you can replace it with LinkedList without changing much code.

---

# This is called Programming to an Interface

Instead of writing

```java
ArrayList<String> names = new ArrayList<>();
```

we write

```java
List<String> names = new ArrayList<>();
```

or

```java
Collection<String> names = new ArrayList<>();
```

because we only care about the behavior, not the implementation.

---

# Advantages

Suppose today:

```java
List<String> list = new ArrayList<>();
```

Tomorrow:

```java
List<String> list = new LinkedList<>();
```

Only one word changes.

Everything else remains the same.

If you had written

```java
ArrayList<String> list = new LinkedList<>();
```

this is impossible.

---

# Example

```java
List<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");

System.out.println(fruits);
```

Output

```
[Apple, Banana, Mango]
```

Now replace

```java
new ArrayList<>()
```

with

```java
new LinkedList<>()
```

Everything still works.

This flexibility is called **Polymorphism**.

---

# Why Do We Need Objects?

Collection is only a design.

The object stores the actual data.

Example

```java
List<Integer> list;
```

At this point,

No memory is allocated.

No list exists.

Only a reference variable exists.

Now

```java
list = new ArrayList<>();
```

Now memory is allocated.

An actual ArrayList object is created.

Now data can be stored.

---

# Memory Representation

```
Reference Variable

list
 |
 |
 V

ArrayList Object

--------------------
| 10 | 20 | 30 | 40 |
--------------------
```

Without the object,

there is nowhere to store the elements.

---

# Why Doesn't Java Automatically Create the Object?

Suppose Java did this automatically.

```java
List<Integer> list;
```

Should Java create

- ArrayList?
- LinkedList?
- Vector?
- Stack?

It doesn't know which implementation you want.

Therefore **you must choose** the implementation.

Example

```java
List<Integer> list = new ArrayList<>();
```

or

```java
List<Integer> list = new LinkedList<>();
```

---

# Interface vs Implementation

| Interface | Implementation |
|------------|----------------|
| List | ArrayList |
| List | LinkedList |
| Set | HashSet |
| Set | TreeSet |
| Queue | PriorityQueue |
| Map | HashMap |

One interface can have multiple implementations.

---

# Collection vs Collections

Many beginners confuse these.

## Collection

- Interface
- Represents a group of objects
- Parent of List, Set and Queue

Example

```java
Collection<Integer> c = new ArrayList<>();
```

---

## Collections

- Utility class
- Contains static methods

Examples

```java
Collections.sort(list);

Collections.reverse(list);

Collections.shuffle(list);

Collections.max(list);

Collections.min(list);
```

Notice the extra **s**.

```
Collection   -> Interface

Collections  -> Utility Class
```

---

# Important Interfaces

## List

- Ordered
- Allows duplicates
- Index-based

Examples

- ArrayList
- LinkedList
- Vector
- Stack

---

## Set

- No duplicate elements
- Usually unordered

Examples

- HashSet
- LinkedHashSet
- TreeSet

---

## Queue

- FIFO (First In First Out)

Examples

- PriorityQueue
- ArrayDeque

---

## Map

- Stores data as Key → Value pairs
- Keys must be unique

Examples

- HashMap
- TreeMap
- LinkedHashMap
- Hashtable

---

# Quick Interview Questions

### Why is Collection an interface?

Because Java wants different classes to provide different implementations while exposing the same common methods.

---

### Why can't we instantiate Collection?

Interfaces don't contain object implementations, so Java cannot create them directly.

---

### Why create objects?

Objects allocate memory and store the actual data.

---

### Why use List instead of ArrayList?

Programming to interfaces provides flexibility, loose coupling, and easier maintenance.

---

### What is the difference between Collection and Collections?

- Collection → Interface
- Collections → Utility class

