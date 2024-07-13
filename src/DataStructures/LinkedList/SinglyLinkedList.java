package DataStructures.LinkedList;

public class SinglyLinkedList {
    private ListNode head; // instance variable of type ListNode... then create ListNode class

    private static class ListNode{
        private final int  data; // property
        private ListNode next;
        // constructor
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

    // Inserting a node at a given position
    public void insertAtGivenPosition(int position, int value){
        ListNode node = new ListNode(value);
        // to insert at the first place
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1; // help us to traverse to position -1
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }

    }

    // Deleting the first node of a singly linkedList
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // Deleting the last node of a singly linkedList
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
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
//        singlyLinkedList.insertFirst(45);
//        singlyLinkedList.insertFirst(34);
//        singlyLinkedList.insertFirst(23);
//        singlyLinkedList.insertFirst(14309);
        singlyLinkedList.printLinkedList();

        // insert last
        singlyLinkedList.insertLast(4723);
        singlyLinkedList.printLinkedList();

        singlyLinkedList.insertAtGivenPosition(4,32);
        singlyLinkedList.printLinkedList();

        System.out.println(singlyLinkedList.deleteFirst().data);
        singlyLinkedList.printLinkedList();
    }
}
