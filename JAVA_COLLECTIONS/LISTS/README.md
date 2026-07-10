# List Interface in Java

> **"A List is an ordered collection that allows duplicate elements and provides index-based access."**

The `List` interface is one of the most commonly used interfaces in the Java Collections Framework (JCF). It is designed to store elements in a sequence where the position (index) of each element matters.

---

# What is a List?

A `List` is a collection that:

- Maintains the order of insertion.
- Allows duplicate elements.
- Allows `null` values (implementation-dependent).
- Supports index-based operations.
- Can grow or shrink dynamically.

Unlike arrays, you don't need to specify its size beforehand.

---

# Real-Life Analogy

Imagine you're writing a **shopping list**.

```
1. Milk
2. Bread
3. Eggs
4. Bread
```

Notice a few things:

- Every item has a position.
- "Bread" appears twice.
- The order is important.

This is exactly how a Java `List` behaves.

```
Index    Element

0 ------ Milk
1 ------ Bread
2 ------ Eggs
3 ------ Bread
```

The position matters.

---

# Why Do We Need a List?

Suppose you're storing student names.

Using an array:

```java
String[] students = new String[3];
```

Problems:

- Fixed size
- Difficult insertion
- Difficult deletion
- Cannot automatically grow

Using a List:

```java
List<String> students = new ArrayList<>();
```

You can keep adding elements without worrying about size.

---

# Characteristics of List

✔ Ordered

✔ Index-based

✔ Allows duplicates

✔ Dynamic size

✔ Easy traversal

---

# List Hierarchy

```
Iterable
     |
Collection
     |
    List
  /   |   \
 /    |    \
ArrayList
LinkedList
Vector
Stack
```

We will study each implementation separately.

---

# Why is List an Interface?

A common interview question.

The `List` itself doesn't know **how** elements should be stored.

Different classes solve the problem differently.

Some prioritize:

- Faster searching
- Faster insertion
- Less memory
- Better synchronization

Instead of forcing one implementation, Java provides a common interface.

---

# Why Can't We Create an Object of List?

This is one of the biggest beginner doubts.

Suppose you write:

```java
List<String> list = new List<>();
```

Java gives an error.

Why?

Because `List` is an **interface**, not a class.

It only defines **what should be done**, not **how it should be done**.

Think of it like a building blueprint.

A blueprint cannot become a building unless someone constructs it.

Similarly,

`List`

is only a blueprint.

Some class must implement it.

---

# Then Why Do We Write This?

```java
List<String> list = new ArrayList<>();
```

This line confuses almost everyone.

Let's break it down.

```
List<String>
```

means

"I want something that behaves like a List."

```
new ArrayList<>()
```

means

"Create an ArrayList object."

The variable only cares that it's a List.

It doesn't care about the actual implementation.

---

# Programming to an Interface

Instead of writing

```java
ArrayList<String> list = new ArrayList<>();
```

we usually write

```java
List<String> list = new ArrayList<>();
```

Why?

Because tomorrow we can easily change

```java
new ArrayList<>()
```

to

```java
new LinkedList<>()
```

without changing the rest of the program.

This makes code flexible.

---

# Memory Representation

```
Reference Variable

list
 |
 |
 V

Actual Object

-------------------------
| Apple |
| Mango |
| Apple |
| Banana|
-------------------------
```

The reference variable stores the address.

The object stores the actual data.

---

# How Indexing Works

Lists use **zero-based indexing**.

```
Index

0
1
2
3
```

Example

```java
List<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Orange");
```

Memory

```
0 -> Apple
1 -> Banana
2 -> Mango
3 -> Orange
```

Accessing an element

```java
System.out.println(fruits.get(2));
```

Output

```
Mango
```

---

# Duplicate Elements

Lists allow duplicate values.

Example

```java
List<String> names = new ArrayList<>();

names.add("Rahul");
names.add("Aman");
names.add("Rahul");
```

Output

```
[Rahul, Aman, Rahul]
```

Duplicates are perfectly valid.

---

# Maintaining Order

Suppose we insert

```java
A
C
B
D
```

The List stores

```
A
C
B
D
```

Exactly in the same order.

It does not automatically sort the elements.

---

# Common Operations

## Add an element

```java
list.add("Apple");
```

---

## Insert at a specific index

```java
list.add(2, "Mango");
```

---

## Get an element

```java
list.get(1);
```

---

## Replace an element

```java
list.set(0, "Orange");
```

---

## Remove an element

By index

```java
list.remove(2);
```

By object

```java
list.remove("Apple");
```

---

## Check if element exists

```java
list.contains("Banana");
```

---

## Number of elements

```java
list.size();
```

---

## Is List empty?

```java
list.isEmpty();
```

---

## Remove everything

```java
list.clear();
```

---

# Iterating Over a List

## Enhanced for loop

```java
for(String fruit : list){

    System.out.println(fruit);

}
```

---

## Traditional loop

```java
for(int i = 0; i < list.size(); i++){

    System.out.println(list.get(i));

}
```

---

## forEach()

```java
list.forEach(System.out::println);
```

---

# Generics in List

You'll almost always see

```java
List<Integer>
```

or

```java
List<String>
```

The part inside `< >`

is called a **Generic Type**.

It tells Java what type of elements the List can store.

Example

```java
List<Integer> numbers = new ArrayList<>();
```

Only integers are allowed.

Trying to add

```java
numbers.add("Hello");
```

produces a compile-time error.

Generics improve:

- Type safety
- Readability
- Compile-time error checking

---

# List vs Array

| Array | List |
|--------|------|
| Fixed size | Dynamic size |
| Can store primitives | Stores objects (wrapper classes for primitives) |
| Length property | `size()` method |
| No built-in methods | Rich API with many methods |
| Difficult insertion/deletion | Easy insertion/deletion (implementation-dependent) |

---

# Common Beginner Mistakes

## Mistake 1

```java
List list = new ArrayList();
```

Works, but avoid it.

Always use Generics.

Correct

```java
List<String> list = new ArrayList<>();
```

---

## Mistake 2

Trying to create

```java
new List<>();
```

Impossible.

Interfaces cannot be instantiated.

---

## Mistake 3

Confusing

```java
size()
```

with

```java
length
```

Arrays use

```java
array.length
```

Lists use

```java
list.size()
```

---

## Mistake 4

Using square brackets

Wrong

```java
list[0]
```

Correct

```java
list.get(0)
```

---

## Mistake 5

Thinking List automatically sorts data.

It doesn't.

It only preserves insertion order.

---

# Most Common Interview Questions

### Why is List an interface?

To provide a common contract for multiple implementations while allowing each implementation to optimize storage and performance differently.

---

### Why can't we instantiate List?

Because it is an interface and contains only method declarations, not implementations.

---

### Why do we write

```java
List<String> list = new ArrayList<>();
```

instead of

```java
ArrayList<String> list = new ArrayList<>();
```

To achieve abstraction, loose coupling, and easier replacement of implementations.

---

### Does List allow duplicates?

Yes.

---

### Does List maintain insertion order?

Yes.

---

### Can List store null values?

Yes, most implementations allow `null` values (behavior depends on the implementation).

---

### Can List store primitive data types?

No.

Use wrapper classes.

```
int      -> Integer

double   -> Double

char     -> Character

boolean  -> Boolean
```

---

# Types of List

Java provides multiple implementations of the `List` interface.

- ArrayList
- LinkedList
- Vector
- Stack (Legacy)

Each implementation has its own internal working, advantages, disadvantages, and use cases.

We'll study each of them separately.

