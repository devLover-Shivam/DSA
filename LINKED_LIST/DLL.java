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

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head= convertArrToDLL(arr);
        /* head = removeHead(head); */
        head = removeTail(head);
        printDLL(head);
    }
}
