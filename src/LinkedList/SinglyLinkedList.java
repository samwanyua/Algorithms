package LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Printing elements of a singly linkedList
    public void printLinkedList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Finding the length of a singly linkedList
    public int singlyLinkedListLength(){
        // edge case
        if(head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // How to insert node at the beginning of a singly linkedList
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // How to insert a node at the end of a singly linkedList
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        // Singly linkedList
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connect the nodes to form a chain
        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth; // now we have 10 --> 1 --> 8 --> 11 --> null

        // Printing a singly linkedList
        singlyLinkedList.printLinkedList();

        // printing the length of the linkedList
        System.out.println("Length is = " + singlyLinkedList.singlyLinkedListLength());

        // Inserting node at the beginning of the linkedList
        singlyLinkedList.insertFirst(109);
        singlyLinkedList.insertFirst(45);
        singlyLinkedList.insertFirst(34);
        singlyLinkedList.insertFirst(23);
        singlyLinkedList.insertFirst(14309);
        singlyLinkedList.printLinkedList();

        // insert last
        singlyLinkedList.insertLast(333333333);
        singlyLinkedList.printLinkedList();

    }
}
