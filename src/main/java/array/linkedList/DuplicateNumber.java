package array.linkedList;

public class DuplicateNumber {
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(33);
        Node thirdNode = new Node(10);
        Node fourthNode = new Node(60);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        return head;



    }
    public static void print(Node Head) {
        Node temp = Head;
        Node temp2 = temp.next;
        int Duplicate = 0;
        while (temp != null) {
            while (temp2 != null) {
                if (temp.data == temp2.data) {
                    System.out.println(temp.data);
                    return;
                }

                temp2 = temp2.next;
            }
            temp = temp.next;

        }
    }
    public static void main (String [] args){
        Node head = createLinkedList();
        print(head);

    }




}
