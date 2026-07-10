# ArrayList in Java

> **"ArrayList is a resizable array implementation of the `List` interface."**

`ArrayList` is one of the most frequently used classes in Java Collections and is widely used in **Data Structures & Algorithms (DSA)** because it provides **fast random access**, dynamic resizing, and a rich set of utility methods.

---

# Declaration

```java
import java.util.ArrayList;
import java.util.List;
```

```java
ArrayList<Integer> list = new ArrayList<>();
```

or (Recommended)

```java
List<Integer> list = new ArrayList<>();
```

---

# Why Use ArrayList?

Unlike arrays, an `ArrayList`:

- Grows dynamically.
- Doesn't require specifying the size beforehand.
- Provides many built-in methods.
- Supports index-based operations.

---

# Internal Working

Internally, an `ArrayList` uses a **dynamic array**.

When the array becomes full:

1. A larger array is created.
2. Existing elements are copied into the new array.
3. The old array is discarded.

This resizing happens automatically.

---

# Key Characteristics

- Maintains insertion order.
- Allows duplicate elements.
- Allows `null` values.
- Dynamic in size.
- Index-based access.
- Not synchronized (not thread-safe).

---

# Time Complexities

| Operation | Time Complexity |
|-----------|-----------------|
| add(element) | O(1) (Amortized) |
| add(index, element) | O(n) |
| get(index) | O(1) |
| set(index, element) | O(1) |
| remove(index) | O(n) |
| remove(object) | O(n) |
| contains(element) | O(n) |
| indexOf(element) | O(n) |
| lastIndexOf(element) | O(n) |
| size() | O(1) |
| isEmpty() | O(1) |
| clear() | O(n) |

---

# Common Methods Used in DSA

## 1. add()

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

Time Complexity: **O(1)** (Amortized)

---

## 2. add(index, element)

Inserts an element at a specific index.

```java
list.add(1, 100);
```

Output

```
[10, 100, 20, 30]
```

Time Complexity: **O(n)**

---

## 3. get()

Returns the element at the given index.

```java
System.out.println(list.get(2));
```

Output

```
20
```

Time Complexity: **O(1)**

---

## 4. set()

Updates an element.

```java
list.set(0, 99);
```

Output

```
[99, 100, 20, 30]
```

Time Complexity: **O(1)**

---

## 5. remove(index)

Removes the element at the specified index.

```java
list.remove(2);
```

Output

```
[99, 100, 30]
```

Time Complexity: **O(n)**

---

## 6. remove(Object)

Removes the first occurrence of an element.

```java
list.remove(Integer.valueOf(100));
```

Output

```
[99, 30]
```

Time Complexity: **O(n)**

> **Note:**  
> For `ArrayList<Integer>`, `remove(2)` removes the element at **index 2**, not the value `2`. To remove the value, use:

```java
list.remove(Integer.valueOf(2));
```

---

## 7. size()

Returns the number of elements.

```java
System.out.println(list.size());
```

Time Complexity: **O(1)**

---

## 8. isEmpty()

Checks whether the list is empty.

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

Time Complexity: **O(1)**

---

## 9. contains()

Checks whether an element exists.

```java
list.contains(30);
```

Returns

```
true
```

Time Complexity: **O(n)**

---

## 10. indexOf()

Returns the first occurrence of an element.

```java
list.indexOf(30);
```

Output

```
1
```

Returns `-1` if not found.

Time Complexity: **O(n)**

---

## 11. lastIndexOf()

Returns the last occurrence.

```java
list.lastIndexOf(30);
```

Time Complexity: **O(n)**

---

## 12. clear()

Removes all elements.

```java
list.clear();
```

Output

```
[]
```

Time Complexity: **O(n)**

---

# Traversing an ArrayList

## Enhanced For Loop

```java
for (int num : list) {
    System.out.println(num);
}
```

---

## Traditional For Loop

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

## forEach()

```java
list.forEach(System.out::println);
```

---

# Sorting an ArrayList

Ascending Order

```java
Collections.sort(list);
```

Descending Order

```java
Collections.sort(list, Collections.reverseOrder());
```

Time Complexity: **O(n log n)**

---

# Converting Between Array and ArrayList

## ArrayList → Array

```java
Integer[] arr = list.toArray(new Integer[0]);
```

---

## Array → ArrayList

```java
Integer[] arr = {1, 2, 3};

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
```

---

# ArrayList vs Array

| Array | ArrayList |
|--------|-----------|
| Fixed size | Dynamic size |
| Stores primitives | Stores objects (Wrapper Classes) |
| Faster for fixed-size operations | More flexible |
| Uses `length` | Uses `size()` |

---


# Common Mistakes

### Forgetting Generics

❌

```java
ArrayList list = new ArrayList();
```

✔

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

### Confusing `size()` with `length`

❌

```java
list.length
```

✔

```java
list.size()
```

---

### Using Square Brackets

❌

```java
list[0]
```

✔

```java
list.get(0)
```

---

### Removing Integer Values

❌

```java
list.remove(2);
```

(Removes the element at index `2`)

✔

```java
list.remove(Integer.valueOf(2));
```

(Removes the value `2`)

---

