
public class Node{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
     Node(int d,Node next) {
        data = d;
        this.next = next;
    }
}

 class LL {

    Node head;

    // Function to create Linked list

    public void create(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to print the linked list

    public static void traversal(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to reverse the linked list

     static Node reverse(Node head){
        Node curr=head;
        Node prev = null;
        Node next =null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
     //Function to insert a node at any given position of linked list..

     static Node insertAtAny(Node head, int pos, Node newNode) {
        if (head == null)
            System.out.println("Empty list");
        else {
            Node temp = head;
            for (int i = 1; i < pos-1; i++) {
                if (temp == null) {
                    System.out.println("Invalid position");
                    return head;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

     //Function to insert a node at the beginning of linked list..

    static Node insertAtBeginning(Node head, Node newNode) {
        newNode.next = head;
        return newNode;
    }

     //Function to insert a node at the end of linked list..

    static void insertAtEnd(Node head, Node newNode) {
        if (head == null)
            return;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        
    }

    //Function to delete a node from beginning in linked list..
    
    static Node delbeginning(Node head){
        if(head==null)
            return null;
        else
            head=head.next;
            return head;
    }

    //Function to delete a node from any given position in linked list..

    static void delany(Node head,int pos){
        if(head==null)
            System.out.println("List is empty");
        else{
            for (int i = 1; i <pos-1; i++) {
                head=head.next;
            }
            head.next=head.next.next;
        }
    }
    
    //Function to delete a node from end in linked list

    static void delend(Node head){
        if(head==null)
            return;
        else if (head.next==null){
            head=null;
            return;
        }
        else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }

    //Driver code..

     public static void main(String[] args) {
        LL linkedList = new LL();

        // Creating a linked list
        linkedList.create(1);
        linkedList.create(2);
        linkedList.create(3);
        linkedList.create(4);
        linkedList.create(5);

        System.out.println("Original Linked List:");
        LL.traversal(linkedList.head);

        // Reversing the linked list
        linkedList.head = LL.reverse(linkedList.head);
        System.out.println("Reversed Linked List:");
        LL.traversal(linkedList.head);

        // Inserting at the beginning
        Node newNode = new Node(0);
        linkedList.head = LL.insertAtBeginning(linkedList.head, newNode);
        System.out.println("Linked List after inserting at the beginning:");
        LL.traversal(linkedList.head);

        // Inserting at any position
        Node newNodeAtAny = new Node(5);
        linkedList.head = LL.insertAtAny(linkedList.head, 2, newNodeAtAny);
        System.out.println("Linked List after inserting at position 2:");
        LL.traversal(linkedList.head);
       
        // Inserting at end position
        Node newNodeAtEnd = new Node(6);
        LL.insertAtEnd(linkedList.head, newNodeAtEnd);
        System.out.println("Linked List after inserting at end:");
        LL.traversal(linkedList.head);

        // Deleting from the beginning
        linkedList.head=LL.delbeginning(linkedList.head);
        System.out.println("Linked List after deleting from the beginning:");
        LL.traversal(linkedList.head);

        // Deleting from any position
        LL.delany(linkedList.head, 2);
        System.out.println("Linked List after deleting from position 2:");
        LL.traversal(linkedList.head);

        // Deleting from the end
        LL.delend(linkedList.head);
        System.out.println("Linked List after deleting from the end:");
        LL.traversal(linkedList.head);
    }

}
