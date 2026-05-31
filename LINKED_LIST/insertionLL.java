class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node (int data1){
        this.data=data1;
        this.next = null;
    }
}
public class insertionLL {
    private static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int arr []={2,3,4,5};
        Node head = insertionLL(arr);
        
        /* head = removesHead(head);
        printLL(head); */
        /* head= removesTail(head); */
        /* head = removesK(head, 5); */
        head = removeEl(head,3);
        printLL(head);
    }
}
