class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class convertArray2LL {
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //  FINDING LENGTH OF A LINKED LIST
    private static int lengthofLL(Node head){
        int cnt =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    //SEARCH IN LINKED LIST
    private static boolean checkPresent(Node head,int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return true;
            temp = temp.next;
        }
       return false; 
    }
    public static void main(String[] args) {
        int arr []={2,3,4,5};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        //TRAVERSAL IN A LINKED LIST
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println(lengthofLL(head));
        System.out.println(checkPresent(head, 5));
    }
}
