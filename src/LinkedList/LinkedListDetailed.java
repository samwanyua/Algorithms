package LinkedList;

import java.util.LinkedList;

public class LinkedListDetailed {

    private Node head;
    private Node tail;

    private int size;

    public LinkedListDetailed() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void insertFirst(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }

            size++;
        }
    }

    public static void main(String[] args) {
        LinkedListDetailed linkedListDetailed = new LinkedListDetailed();

    }
}
