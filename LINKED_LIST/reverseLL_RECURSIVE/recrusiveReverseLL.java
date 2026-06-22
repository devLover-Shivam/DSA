import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data = data;
        this.next = null;        
    }
}

public class recrusiveReverseLL {

    static Node reverseLL(Node head){
        if(head==null || head.next == null) return head;
        Node newHead = reverseLL(head.next);
        Node front = head.next;
        head.next = null;
        front.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

         // Find the middle node
        Node revNode = reverseLL(head);

        // Display the value of the middle node
        System.out.println("The rev node value is: " + revNode.data);
    }
}