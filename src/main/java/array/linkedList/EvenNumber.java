package array.linkedList;
//Even Number
public class EvenNumber {
    public static Node createLinkedList() {
        Node firstNode = new Node(10);
        Node secondNode = new Node(23);
        Node thirdNode = new Node(30);

        Node head = firstNode;
        head.next = secondNode;
        head.next.next = thirdNode;
        head.next.next.next = null;
        return head;
    }

  /*  public static Node insertNodeAtFirst(Node head) {
        Node newNode = new Node(50);
        newNode.next = head; //new node pointing head Linkedlist
        head = newNode; // reset to newNode as Head
        return head;

    }

    public static Node insertNodeAtLast(Node head) {
        //traverse
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                Node newNode = new Node(60);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;

        }
        return head;
    }*/

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                System.out.print(temp.data + " -> ");

            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = createLinkedList();
        print(head);

    }

}
