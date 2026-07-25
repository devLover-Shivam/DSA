import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(5);
        q.offerFirst(10);
        q.offerLast(15);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        // stack implementation using queue

        Deque<Integer> d = new ArrayDeque<>();
        d.push(10);
        d.push(20);
        d.push(30);
        System.out.println(d);
        d.pop();// removes the last element pushed
        System.out.println(d);
        System.out.println(d.peek());
    }
}
