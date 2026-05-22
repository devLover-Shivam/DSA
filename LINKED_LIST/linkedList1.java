/* 
# Singly Linked List Initialization in Java

## Introduction

Singly Linked List ek linear data structure hai jahan elements sequentially connected hote hain using references.

Array ke unlike:

* elements continuous memory me store nahi hote
* har element dynamically create hota hai
* insertion aur deletion comparatively easy hota hai

Linked List multiple **nodes** se milkar banti hai.

---

# Structure of a Node

Har node ke andar mainly 2 cheezein hoti hain:

1. **Data**

   * actual value store karta hai

2. **Next Reference**

   * next node ka address/reference store karta hai

---

## Visual Representation

```text id="ak9kt2"
[10 | * ] ---> [20 | * ] ---> [30 | null]
```

Explanation:

* `10`, `20`, `30` → stored data
* `*` → next node ka reference
* `null` → list ka end

---

# Step 1: Creating the Node Class

Sabse pehle ek `Node` class create ki jati hai.

## Code

```java id="n9s99o"
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

# Explanation of Each Part

## 1. Data Variable

```java id="esud1d"
int data;
```

Purpose:

* node ke andar actual value store karta hai

Example values:

* 10
* 25
* 99

---

## 2. Next Reference

```java id="tmzqxp"
Node next;
```

Purpose:

* next node ka reference store karta hai

Agar next node exist nahi karta:

* `next = null`

---

## 3. Constructor

```java id="cbij8h"
Node(int data) {
    this.data = data;
    this.next = null;
}
```

Purpose:

* object create hone par data initialize karta hai
* initially next ko `null` set karta hai

---

# Step 2: Initializing the Linked List

## Creating the First Node

```java id="jnh1b5"
Node head = new Node(10);
```

---

## Memory Representation

```text id="rjlwmw"
head
 ↓
[10 | null]
```

Explanation:

* `head` first node ko point karta hai
* currently sirf ek node exist karta hai

---

# Step 3: Creating Additional Nodes

```java id="fx29bo"
Node second = new Node(20);
Node third = new Node(30);
```

Abhi:

* nodes create hue hain
* lekin connected nahi hain

---

# Step 4: Connecting the Nodes

```java id="5rlyd5"
head.next = second;
second.next = third;
```

---

# Final Linked List Structure

```text id="5m86ie"
head
 ↓
[10 | * ] ---> [20 | * ] ---> [30 | null]
```

Explanation:

* first node → second node ko point kar raha hai
* second node → third node ko point kar raha hai
* third node → `null`

---

# Complete Program

```java id="1f4f7o"
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
```

---

# Output

```text id="cbynw8"
10
20
30
```

---

# Traversing the Linked List

Traversal ka matlab:

* linked list ke har node ko sequentially access karna

---

## Traversal Code

```java id="9jd9ee"
Node temp = head;

while(temp != null) {
    System.out.println(temp.data);
    temp = temp.next;
}
```

---

# Traversal Flow

## Initial State

```text id="u3vq0f"
temp → 10
```

---

## First Iteration

```text id="4y1q4z"
temp → 20
```

---

## Second Iteration

```text id="3x4q9t"
temp → 30
```

---

## Final State

```text id="36wczj"
temp → null
```

Loop terminate ho jayega.

---

# Important Concepts

| Term | Description             |
| ---- | ----------------------- |
| Node | Individual element      |
| Head | First node ka reference |
| Next | Next node ka address    |
| Null | End of the linked list  |

---

# Difference Between Declaration and Initialization

## Declaration

```java id="kq5l6x"
Node head;
```

Meaning:

* sirf reference variable declare hua hai
* koi node create nahi hui

---

## Initialization

```java id="1ncvvy"
head = new Node(10);
```

Meaning:

* actual node create hui
* memory allocate hui

---

# Advantages of Singly Linked List

* Dynamic size
* Easy insertion
* Easy deletion
* Memory efficient for dynamic data

---

# Disadvantages

* Random access possible nahi
* Traversal sequential hota hai
* Extra memory required for references

---

# Real-Life Analogy

Linked List ko ek treasure hunt ki tarah samajh sakte ho.

Har clue me:

* current information hoti hai
* next clue ka location hota hai

Exactly waise hi:

* har node data store karta hai
* aur next node ka reference bhi

---

# Conclusion

Singly Linked List Java me initialize karne ke liye:

1. Node class create ki jati hai
2. Nodes dynamically create kiye jate hain
3. References ke through nodes connect kiye jate hain
4. `head` first node ko point karta hai

Ye structure dynamic memory handling aur efficient insertion/deletion operations ke liye widely use hota hai in:

* Data Structures
* System Programming
* Memory Management
* Real-world Applications like Music Playlists and Navigation Systems
 */

public class linkedList1 {
    static class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    }

    

    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        }
     
}
