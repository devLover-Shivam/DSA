package LINKED_LIST;

public class linkedList {
    Node head;
    private int size;

    linkedList() {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++ ;
        }
    }

    //add - adding an elm at first 

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head; // newnode ka next ab purane head ki taraf point karega.
        head = newNode; // aur jo newnode tha ab wo naya head ban jaaega

    }

    //add - adding an elm at last

    public void addLast(String data){
        //head se ek ek node aage badhte rahenge jb tak last node ka address i.e null nhi aa jata.basically, last node ko point karwaa dena hai naye node ki taraf jisko add karna hai aur jo last me add ho raha hai wo to already null ki taraf point kar raha hai.
        Node newNode = new Node(data);
        if(head == null){// agar koi node hi exist nhi karta hai to pehle node ko hi head bana dena hai.
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {//currNode tab tak traverse karega jab tak null na mil jaae.
            currNode = currNode.next;
        }

        currNode.next = newNode; // jaise last node mila usko newnode ki taraf point karwaa dena hai.

    }

    // delete first

    public void deleteFirst(){
        if(head==null){//CORNER CASE
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last

    public void deleteLast(){
        if(head==null){// CORNER CASE
            System.out.println("List is empty.");
            return;
        }
        size--;
        if(head.next == null) { // 2nd CORNER CASE - jin case me ek hi head hai usme use hoga.
            head = null;
            return;
        }


        Node secondLast = head;
        Node lastNode = head.next; // if head.next = null -> last node = null
        while(lastNode.next != null){ //null.next = error . isiliye2nd corner case generate hua.
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //size of linked list
    public int getSize() {
        return size;
    }



    // printing linked list
    public void printList(){
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while(currNode!= null) {
            System.out.print(currNode.data + " -> ");
            currNode  = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        linkedList list = new linkedList(); // creating a new object for the class linkedList.
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        
        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
