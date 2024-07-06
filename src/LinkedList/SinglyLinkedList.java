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
    }
}
