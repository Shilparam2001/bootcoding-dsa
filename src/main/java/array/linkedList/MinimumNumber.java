package array.linkedList;

//minimum Element

public class MinimumNumber {
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(33);
        Node thirdNode = new Node(7);
        Node fourthNode = new Node(60);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        return head;



    }
    public static void print(Node Head){
        Node temp = Head;
        int min = temp.next.data;
        while (temp != null){
            if (temp.data < min ){
                min = temp.data;
            }

            temp = temp.next;
        }
        System.out.println(min);

    }
    public static void main (String [] args){
        Node head = createLinkedList();
        print(head);

    }



}