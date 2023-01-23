package array.linkedList;

public class PrintOnce {
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(33);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(60);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        return head;



    }
    public static void print(Node Head){
        Node temp = Head;
        while (temp != null){
            if(temp.data == temp.next.data){
                System.out.println(temp.next.data);

            }

            temp = temp.next;
        }
     //  System.out.println(temp);

    }
    public static void main (String [] args){
        Node head = createLinkedList();
        print(head);

    }


}
