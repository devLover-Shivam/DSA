import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // List and Collection are interfaces
        // Vector is a concrete class

        Vector<Integer> vector = new Vector<>();

        // Other ways to implement Vector

        List<Integer> list = new Vector<>();
        Collection<Integer> collection = new Vector<>();


        // ADDING ELEMENTS INSIDE THE VECTOR

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Original Vector : " + vector);


        // remove = removes an element from a particular index

        vector.remove(0);

        System.out.println("After remove() : " + vector);


        // addAll = adds all elements of one collection into another

        list.add(101);
        list.add(102);

        vector.addAll(list);

        System.out.println("After addAll() : " + vector);


        // removeAll = removes all elements of one collection from another

        vector.removeAll(list);

        System.out.println("After removeAll() : " + vector);


        // size = returns the number of elements

        System.out.println("Size : " + vector.size());


        // clear = removes all elements

        // list.clear();

        System.out.println("After clear() : " + list);


        // isEmpty = checks whether the vector is empty

        Vector<Integer> marks = new Vector<>();

        System.out.println("Is Empty : " + marks.isEmpty());


        // Iterator = standard way to traverse collections

        Iterator<Integer> iterator = vector.iterator();

        System.out.print("Iterator : ");

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }

        System.out.println();


        // get = returns the element present at a particular index

        System.out.println(list.get(0));


        // set = replaces the element at a particular index

        list.set(0, 505);

        System.out.println(list);


        // toArray = converts vector into an array

        Object[] array = vector.toArray();

        System.out.print("Array : ");

        for (Object object : array) {

            System.out.print(object + " ");

        }

        System.out.println();


        // contains = checks whether an element exists

        System.out.println(list.contains(202));


        // indexOf = returns the first occurrence

        list.add(102);

        System.out.println("First Index : " + list.indexOf(102));


        // lastIndexOf = returns the last occurrence

        System.out.println("Last Index : " + list.lastIndexOf(102));


        vector.add(550);
        vector.add(66);

        System.out.println(vector);


        // sort = sorts the vector in ascending order

        Collections.sort(vector);

        System.out.println("Sorted Vector : " + vector);


        // clone = creates a shallow copy

        Vector<Integer> newVector = (Vector<Integer>) vector.clone();

        System.out.println("Cloned Vector : " + newVector);


        // =====================================================
        // METHODS SPECIFIC TO VECTOR
        // =====================================================


        // addElement = adds an element to the end

        vector.addElement(999);

        System.out.println("After addElement() : " + vector);


        // elementAt = returns the element at a given index

        System.out.println("Element at index 2 : " + vector.elementAt(2));


        // firstElement = returns the first element

        System.out.println("First Element : " + vector.firstElement());


        // lastElement = returns the last element

        System.out.println("Last Element : " + vector.lastElement());


        // removeElement = removes the first occurrence of an element

        vector.removeElement(20);

        System.out.println("After removeElement() : " + vector);


        // removeElementAt = removes the element at a given index

        vector.removeElementAt(1);

        System.out.println("After removeElementAt() : " + vector);


        // capacity = returns the current capacity of the vector

        System.out.println("Capacity : " + vector.capacity());


        // ensureCapacity = increases the capacity if required

        vector.ensureCapacity(25);

        System.out.println("Capacity after ensureCapacity() : " + vector.capacity());


        // trimToSize = reduces the capacity equal to the current size

        vector.trimToSize();

        System.out.println("Capacity after trimToSize() : " + vector.capacity());


        // removeAllElements = removes every element from the vector

        Vector<Integer> temp = (Vector<Integer>) vector.clone();

        temp.removeAllElements();

        System.out.println("After removeAllElements() : " + temp);


        // elements = returns an Enumeration to traverse the vector

        System.out.print("Enumeration : ");

        java.util.Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {

            System.out.print(enumeration.nextElement() + " ");

        }

        System.out.println();
    }
}