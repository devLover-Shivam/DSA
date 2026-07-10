import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List and Collection are interfaces
        // LinkedList is the concrete class

        LinkedList<Integer> list = new LinkedList<>();

        // Other ways to implement LinkedList

        List<Integer> arr = new LinkedList<>();
        Collection<Integer> collection = new LinkedList<>();


        // ADDING ELEMENTS INSIDE THE LINKEDLIST

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List : " + list);


        // remove = removes an element from a specific index

        list.remove(0);
        System.out.println("After remove() : " + list);


        // addAll = adds all elements of one collection into another collection

        arr.add(101);
        arr.add(102);

        list.addAll(arr);

        System.out.println("After addAll() : " + list);


        // removeAll = removes all elements of one collection from another collection

        list.removeAll(arr);

        System.out.println("After removeAll() : " + list);


        // size = returns the number of elements present in the linked list

        System.out.println("Size : " + list.size());


        // clear = removes all elements from the linked list

        // arr.clear();

        System.out.println("After clear() : " + arr);


        // isEmpty = checks whether the linked list is empty or not

        LinkedList<Integer> marks = new LinkedList<>();

        System.out.println("Is Empty : " + marks.isEmpty());


        // Iterator = standard way to traverse a collection

        Iterator<Integer> iterator = list.iterator();

        System.out.print("Iterator : ");

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }

        System.out.println();


        // get = returns the element present at a particular index

        System.out.println(arr.get(0));


        // set = replaces the value at a particular index

        arr.set(0, 505);

        System.out.println(arr);


        // toArray = converts the linked list into an array

        Object[] array = list.toArray();

        System.out.print("Array : ");

        for (Object object : array) {

            System.out.print(object + " ");

        }

        System.out.println();


        // contains = checks whether a given element exists in the linked list

        System.out.println(arr.contains(202));


        // indexOf = returns the first occurrence of an element

        arr.add(102);

        System.out.println("First Index : " + arr.indexOf(102));


        // lastIndexOf = returns the last occurrence of an element

        System.out.println("Last Index : " + arr.lastIndexOf(102));


        list.add(550);
        list.add(66);

        System.out.println(list);


        // sort = sorts the linked list in ascending order

        Collections.sort(list);

        System.out.println("Sorted LinkedList : " + list);


        // clone = creates a shallow copy of the linked list

        LinkedList<Integer> newList = (LinkedList<Integer>) list.clone();

        System.out.println("Cloned List : " + newList);


      
        // METHODS SPECIFIC TO LINKEDLIST
       


        // addFirst = adds an element at the beginning

        list.addFirst(5);

        System.out.println("After addFirst() : " + list);


        // addLast = adds an element at the end

        list.addLast(100);

        System.out.println("After addLast() : " + list);


        // getFirst = returns the first element

        System.out.println("First Element : " + list.getFirst());


        // getLast = returns the last element

        System.out.println("Last Element : " + list.getLast());


        // removeFirst = removes the first element

        list.removeFirst();

        System.out.println("After removeFirst() : " + list);


        // removeLast = removes the last element

        list.removeLast();

        System.out.println("After removeLast() : " + list);


        // peek = returns the first element without removing it

        System.out.println("Peek : " + list.peek());


        // peekFirst = returns the first element without removing it

        System.out.println("Peek First : " + list.peekFirst());


        // peekLast = returns the last element without removing it

        System.out.println("Peek Last : " + list.peekLast());


        // offer = inserts an element at the end of the linked list

        list.offer(500);

        System.out.println("After offer() : " + list);


        // offerFirst = inserts an element at the beginning

        list.offerFirst(1);

        System.out.println("After offerFirst() : " + list);


        // offerLast = inserts an element at the end

        list.offerLast(999);

        System.out.println("After offerLast() : " + list);


        // poll = returns and removes the first element

        System.out.println("Poll : " + list.poll());

        System.out.println(list);


        // pollFirst = returns and removes the first element

        System.out.println("Poll First : " + list.pollFirst());

        System.out.println(list);


        // pollLast = returns and removes the last element

        System.out.println("Poll Last : " + list.pollLast());

        System.out.println(list);


        // push = pushes an element onto the front of the linked list

        list.push(50);

        System.out.println("After push() : " + list);


        // pop = removes and returns the first element

        System.out.println("Popped Element : " + list.pop());

        System.out.println(list);


        // descendingIterator = traverses the linked list from last to first

        Iterator<Integer> reverse = list.descendingIterator();

        System.out.print("Reverse Traversal : ");

        while (reverse.hasNext()) {

            System.out.print(reverse.next() + " ");

        }

        System.out.println();

    }
}