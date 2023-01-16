package array.linkedList;
//Odd Number

public class OddNumber {

    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(33);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(30);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        return head;



        }
        public static void print(Node Head){
        Node temp = Head;
        while (temp != null){
            if (temp.data % 2 != 0){
                System.out.println(temp.data  + " " );
            }
            temp = temp.next;
        }


    }
    public static void main (String [] args){
        Node head = createLinkedList();
        print(head);

    }




}
