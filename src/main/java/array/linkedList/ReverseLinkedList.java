package array.linkedList;

public class ReverseLinkedList {
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        return head;



    }
    public static Node reverse(Node head){
       Node current = head;
       Node next = null;
       Node prev = null;

       while (current != null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       return prev;
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main (String [] args){
        Node head = createLinkedList();
        printLinkedList(head);
        Node node = reverse(head);
        printLinkedList(node);

    }



}
