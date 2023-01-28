package array.linkedList;

public class solution {
    public static void main(String[] args) {
        Node head = createLinkedList();


        System.out.println( hasCycle(head));
    }
    public static Node createLinkedList() {
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
        public static boolean hasCycle(Node head) {
            Node SP = head;
            Node FP = head;
            while(FP != null && FP.next != null){
                if(FP == SP)
                    return true;

                SP = SP.next;
                FP = FP.next.next;
            }
            return false;
        }
}




