# HashMap in Java Collection Framework

## Introduction

`HashMap` is one of the most commonly used classes in the **Java Collection Framework (JCF)**. It implements the **Map** interface and stores data in the form of **key-value pairs**.

Unlike a `List` or a `Set`, a `HashMap` associates **one unique key** with **one value**. This makes searching, updating, and deleting data extremely fast.

A `HashMap` internally uses a **Hash Table**, providing an average time complexity of **O(1)** for most operations.

---

# Real-Life Analogy

Think of a **dictionary**.

- The **word** is the **key**.
- The **meaning** is the **value**.

Example:

| Key | Value |
|------|--------|
| "Apple" | "A Fruit" |
| "Java" | "Programming Language" |
| "India" | "Country" |

You search using the **key**, and Java immediately returns the corresponding **value**.

A `HashMap` works in the same way.

---

# Why Do We Need a HashMap?

Suppose we want to store country codes with country names.

Without a `Map`, we'd need two separate lists:

```java
List<String> codes = new ArrayList<>();
List<String> countries = new ArrayList<>();
```

Finding the country for a particular code would require searching through both lists.

With a `HashMap`:

```java
Map<String, String> countries = new HashMap<>();

countries.put("in", "India");
countries.put("us", "United States");
countries.put("en", "England");
```

Now retrieving a country is as simple as:

```java
System.out.println(countries.get("in"));
```

Output

```
India
```

---

# Characteristics of HashMap

- Stores data as **key-value pairs**
- Keys are **unique**
- Values can be duplicated
- Allows one `null` key
- Allows multiple `null` values
- Does not maintain insertion order
- Not synchronized (not thread-safe)
- Average time complexity of most operations is **O(1)**

---

# Creating a HashMap

```java
Map<String, String> map = new HashMap<>();
```

Here,

- Key Type → `String`
- Value Type → `String`

---

# HashMap Methods

---

# 1. put()

Adds a key-value pair into the map.

### Syntax

```java
map.put(key, value);
```

### Example

```java
Map<String, String> mpp = new HashMap<>();

mpp.put("in", "india");
mpp.put("us", "united states");
mpp.put("en", "england");

System.out.println(mpp);
```

Possible Output

```
{in=india, us=united states, en=england}
```

> **Note:** Since `HashMap` doesn't maintain order, the output order may vary.

---

# What happens if the key already exists?

```java
mpp.put("in", "Indonesia");
```

The previous value is replaced.

Output

```
{in=Indonesia}
```

---

# 2. putAll()

Copies all mappings from one map into another.

### Syntax

```java
destinationMap.putAll(sourceMap);
```

### Example

```java
Map<String, String> mpp = new HashMap<>();

mpp.put("in", "india");
mpp.put("us", "united states");

Map<String, String> mp = new HashMap<>();

mp.put("br", "brazil");

mp.putAll(mpp);

System.out.println(mp);
```

Output

```
{br=brazil, in=india, us=united states}
```

If duplicate keys are present, the value from the source map overwrites the existing value.

---

# 3. remove()

Removes a key-value pair using the key.

### Syntax

```java
map.remove(key);
```

### Example

```java
mp.remove("en");

System.out.println(mp);
```

Output

```
{br=brazil, in=india, us=united states}
```

---

# 4. size()

Returns the total number of key-value pairs.

### Syntax

```java
map.size();
```

### Example

```java
System.out.println(mp.size());
```

Output

```
3
```

---

# 5. putIfAbsent()

Adds the key-value pair only if the key is **not already present**.

### Syntax

```java
map.putIfAbsent(key, value);
```

### Example

```java
mp.putIfAbsent("es", "spain");

System.out.println(mp);
```

Output

```
{br=brazil, in=india, us=united states, es=spain}
```

If `"es"` already exists, nothing changes.

---

# 6. get()

Returns the value associated with a key.

### Syntax

```java
map.get(key);
```

### Example

```java
System.out.println(mp.get("br"));
```

Output

```
brazil
```

If the key doesn't exist:

```java
System.out.println(mp.get("xyz"));
```

Output

```
null
```

---

# 7. getOrDefault()

Returns the value if the key exists; otherwise returns the specified default value.

### Syntax

```java
map.getOrDefault(key, defaultValue);
```

### Example

```java
System.out.println(mp.getOrDefault("po", "none"));
```

Output

```
none
```

---

# 8. containsKey()

Checks whether a key exists.

### Syntax

```java
map.containsKey(key);
```

### Example

```java
System.out.println(mp.containsKey("in"));
```

Output

```
true
```

---

# 9. containsValue()

Checks whether a particular value exists.

### Syntax

```java
map.containsValue(value);
```

### Example

```java
System.out.println(mp.containsValue("india"));
```

Output

```
true
```

---

# 10. replace()

Replaces the value associated with a key.

### Syntax

```java
map.replace(key, newValue);
```

### Example

```java
mp.replace("in", "indonesia");

System.out.println(mp);
```

Output

```
{in=indonesia, br=brazil, us=united states, es=spain}
```

If the key doesn't exist, nothing happens.

---

# 11. keySet()

Returns a `Set` containing all keys.

### Syntax

```java
map.keySet();
```

### Example

```java
System.out.println(mp.keySet());
```

Output

```
[br, in, us, es]
```

Useful for iterating over keys.

---

# 12. entrySet()

Returns a `Set` containing all key-value mappings.

### Syntax

```java
map.entrySet();
```

### Example

```java
System.out.println(mp.entrySet());
```

Output

```
[br=brazil, in=indonesia, us=united states, es=spain]
```

This is the most efficient way to iterate through a `HashMap`.

Example:

```java
for (Map.Entry<String, String> entry : mp.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

Output

```
br -> brazil
in -> indonesia
us -> united states
es -> spain
```

---

# Time Complexity

| Operation | Average Time |
|------------|--------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |
| containsValue() | O(n) |
| replace() | O(1) |
| putIfAbsent() | O(1) |
| keySet() | O(1) *(view creation)* |
| entrySet() | O(1) *(view creation)* |
| Iteration | O(n) |

> **Note:** In rare cases with many hash collisions, operations can degrade to **O(log n)** in modern Java implementations.

---

# HashMap vs HashSet

| Feature | HashMap | HashSet |
|----------|----------|----------|
| Stores | Key-Value Pair | Only Values |
| Duplicate Keys | ❌ Not Allowed | ❌ Not Allowed |
| Duplicate Values | ✅ Allowed | ❌ Not Allowed |
| Null Keys | One Allowed | Not Applicable |
| Null Values | Multiple Allowed | One `null` Element |
| Data Structure | Hash Table | Internally backed by a HashMap |



---

# Summary

- `HashMap` stores data as **key-value pairs**.
- Keys are **unique**, while values can be duplicated.
- It provides **O(1)** average time complexity for insertion, deletion, and searching.
- `put()` adds or updates elements.
- `putAll()` copies all mappings from another map.
- `remove()` deletes a mapping using its key.
- `size()` returns the number of entries.
- `putIfAbsent()` inserts only if the key doesn't already exist.
- `get()` retrieves a value by key.
- `getOrDefault()` returns a default value if the key isn't found.
- `containsKey()` and `containsValue()` check for the existence of keys or values.
- `replace()` updates an existing value.
- `keySet()` returns all keys.
- `entrySet()` returns all key-value pairs and is the preferred way to iterate through a `HashMap`.