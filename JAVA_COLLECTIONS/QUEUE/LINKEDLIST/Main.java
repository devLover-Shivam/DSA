import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //add()- adds the specific element in the queue, if it's added it returns true and if not it throws an exception

        //offer()- adds the specific element in the queue, if it's added it returns true and if not it returns false
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.err.println(q);
        //elment() - returns the head of the queue, but throws an exception if the queue is empty

        //peek() - returns the head of the queue, but returns null if the queue is empty.
        q.peek();
        System.err.println(q);
        //remove() - returns and removes the head of the queue, but throws exception if the queue is empty.

        //poll() - returns and removes the head of the queue, but returns null if the queue is empty.
        q.poll();
        System.err.println(q);

        // dequeue =  doubly ended queue allows insertion and deletion from both front and rear.

        Deque<Integer> d = new LinkedList<>();
        // addFirst() - Inserts the element at the front.
        d.addFirst(20);

        // addLast() - Inserts the element at the rear.
        d.addLast(40);

        // offerFirst() - Inserts at the front.
        // Returns false instead of throwing an exception on failure.
        d.offerFirst(10);

        // offerLast() - Inserts at the rear.
        // Returns false instead of throwing an exception on failure.
        d.offerLast(50);

        System.out.println("Deque after insertions: " + d);

        // getFirst() - Retrieves the first element.
        // Throws exception if deque is empty.
        System.out.println("First element (getFirst): " + d.getFirst());

        // getLast() - Retrieves the last element.
        // Throws exception if deque is empty.
        System.out.println("Last element (getLast): " + d.getLast());

        // peekFirst() - Retrieves the first element.
        // Returns null if deque is empty.
        System.out.println("First element (peekFirst): " + d.peekFirst());

        // peekLast() - Retrieves the last element.
        // Returns null if deque is empty.
        System.out.println("Last element (peekLast): " + d.peekLast());

        // removeFirst() - Removes and returns the first element.
        // Throws exception if deque is empty.
        System.out.println("Removed First: " + d.removeFirst());

        // removeLast() - Removes and returns the last element.
        // Throws exception if deque is empty.
        System.out.println("Removed Last: " + d.removeLast());

        System.out.println("Deque after removeFirst & removeLast: " + d);

        // pollFirst() - Removes and returns the first element.
        // Returns null if deque is empty.
        System.out.println("Removed using pollFirst(): " + d.pollFirst());

        // pollLast() - Removes and returns the last element.
        // Returns null if deque is empty.
        System.out.println("Removed using pollLast(): " + d.pollLast());

        System.out.println("Deque after poll methods: " + d);

        // ---------- Stack Operations using Deque ----------

        d.push(100);   // Inserts at the front (acts like Stack push)
        d.push(200);

        System.out.println("After push(): " + d);

        // pop() - Removes and returns the first element
        // (acts like Stack pop)
        System.out.println("Popped element: " + d.pop());

        System.out.println("Deque after pop(): " + d);

        // ---------- Utility Methods ----------

        d.offerLast(300);
        d.offerLast(400);
        d.offerFirst(50);

        System.out.println("Final Deque: " + d);

        // contains() - Checks whether the deque contains the given element.
        System.out.println("Contains 300? " + d.contains(300));

        // size() - Returns the number of elements.
        System.out.println("Size: " + d.size());

        // isEmpty() - Checks whether the deque is empty.
        System.out.println("Is Empty? " + d.isEmpty());

        // clear() - Removes all elements from the deque.
        d.clear();

        System.out.println("Deque after clear(): " + d);
        System.out.println("Is Empty after clear()? " + d.isEmpty());
    }
}
