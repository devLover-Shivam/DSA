class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DLL {
    //Converting Array to DLL
    private static Node convertArrToDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev =temp;
        }
        return head;
    }
    //Printing the DLL
    private static void printDLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    //Removing head of a DLL.
    private static Node removeHead(Node head){
        if(head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        
        return head;
    }

    //Removing tail of a DLL
    private static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;            
        }
        Node prev = tail.back;
            prev.next = null;
            tail.back = null;
        return head;
    }

    //Removing the node present at Kth position
    private static Node removeKthElement(Node head,int k){
        if(head == null) return null;
        Node temp = head;
        int cnt =0;
        //moving the temp pointer
        while(temp!=null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        //Defining the edge cases
        //1st. if single node is present in doubly ll.
        if(prev == null && front == null) return null;
        //2nd. we're standing at the 1st position
        else if(prev == null) return removeHead(head);
        //3rd. we're standing at the 2nd position
        else if(front == null) return removeTail(head);
        // now removing a node from kth position
        
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;
        
    }

    //Deleting a node from DLL where NOde != HEad.
    private static void removeNode(Node temp){
        
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
    }

    //Insertion before head.
    private static Node insertionBeforeHead(Node head, int val){
        Node newHead = new Node(val,head,null);
        head.back = newHead;
        return newHead;
    }

    //Insertion before tail.
    private static Node insertionBeforeTail(Node head, int val){
        if(head.next == null){
            return insertionBeforeHead(head, val);
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode= new Node(val,tail,prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    //Insertion before Kth node.
    private static Node insertBeforeKthElement(Node head, int k,int val){
        if(k==1) return insertionBeforeHead(head, val);
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt ++;
            if(cnt == k) break;
            temp = temp.next;

        }
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        Node head= convertArrToDLL(arr);
        /* head = removeHead(head); */
        /* head = removeTail(head); */
        /* head = removeKthElement(head, 4); */
        /* removeNode(head.next.next); */
        /* head = insertionBeforeHead(head, 19); */
        /* head = insertionBeforeTail(head, 19); */
        head = insertBeforeKthElement(head, 2,19);
        printDLL(head);
    }
}
