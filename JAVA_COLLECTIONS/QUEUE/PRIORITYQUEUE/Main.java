import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        // default behaviour IS LIKE MINHEAP in case of integers -> integers with less value has the highest priority.
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        //to change this default behaviour and make it MAXHEAP we can use lambda expression.

        Queue<Integer> mh = new PriorityQueue<>((a,b)->b-a);
        // we added a comparator here ((a,b)->b-a)
        // now integer with highest value will have highest priority

        mh.offer(40);
        mh.offer(30);
        mh.offer(10);
        mh.offer(20);
        System.out.println(mh.poll());
        System.out.println(mh);
        System.out.println(mh.poll());
        System.out.println(mh);

        // for any other datatypes we need to write our own comparators for comparison in the priority queue.

    }   
}
