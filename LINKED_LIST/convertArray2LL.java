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
        // TRAVERSAL
    private static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    //DELETE THE HEAD OF THE LINKED LIST
    private static Node removesHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }

    //REMOVE THE TAIL OF THE LINKED LIST.
    private static Node removesTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next !=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    //REMOVE ANY ELEMENT AT THE KTH POSITION FROM A LINKED LIST
    private static Node removesK(Node head, int k){
        if(head == null) return head;
        if(k==1){
            Node temp = head;
            head= head.next;
            return head;
        }
        int cnt=0;
        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                //delete temp;
                break;
            }
            prev = temp;
            temp =  temp.next;
        }
        return head;
    }

    // REOMOVE AN ELEMENT FROM THE LINKED LIST BY ITS VALUE.
    private static Node removeEl(Node head, int val){
        if(head == null) return head;
        if(head.data == val){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp !=null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    //INSERTION AT HEAD
    private static Node insertHead(Node head,int val){
        Node temp = new Node(val,head);
        return temp;
    }
    //INSERTION AT TAIL
    private static Node insertTail(Node head, int val){
        if(head == null) return new Node(val);
        Node temp =  head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // INSERTION AT ANY POSITION K IN A LINKED LIST.
    private static Node insertPosition(Node head, int val, int k){
        if(head == null){
            if(k==1){
                return new Node(val);
            }
            else return head;
        }

        if(k==1){
             return new Node(val,head);
        }
        int cnt =0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == k-1){
                Node x = new Node(val,temp.next);
                temp.next=x;
                break;

            }
            temp = temp.next;
        }
        return head;
    }
    //INSERT AN ELEMENT BEFORE X
    private static Node insertBeforeVal(Node head, int val, int x){
        if(head == null) return null;//as is the ll is empty there'll be no value present there before which an element should be placed.
       if(head.data == x){
        return new Node(val,head);
       }   

       Node temp = head;
       while (temp.next!=null) {
        if (temp.next.data == x) {
            Node y = new Node(val,temp.next);
            temp.next = y;
            break;
        }
        temp= temp.next;
       }
       return head;

    }
    public static void main(String[] args) {
        int arr []={2,3,4,5};
        Node head = convertArr2LL(arr);
        
        /* head = removesHead(head);
        printLL(head); */
        /* head= removesTail(head); */
        /* head = removesK(head, 5); */
        /* head = removeEl(head,3); */
        /* head =  insertHead(head, 0); */
        /* head = insertTail(head, 0); */
        /* head = insertPosition(head, 0, 3); */
        head = insertBeforeVal(head, 100, 5);
        printLL(head);
    }
}
