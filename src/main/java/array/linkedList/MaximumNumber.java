package array.linkedList;
//Maximum Element
public class MaximumNumber {
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
        int max = temp.next.data;
        while (temp != null){
            if (temp.data > max ){
               max = temp.data;
            }

            temp = temp.next;
        }
        System.out.println(max);

    }
    public static void main (String [] args){
        Node head = createLinkedList();
        print(head);

    }




}
