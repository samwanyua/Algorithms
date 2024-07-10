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
    }
    // Inserting first
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    // print a linkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END!!");
    }

    // Insert last
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val); // create a node
        tail.next = node;
        tail = node;
        size++;
    }

    public static void main(String[] args) {
        LinkedListDetailed list = new LinkedListDetailed();
        list.insertFirst(54);
        list.insertFirst(2);
        list.insertFirst(34);
        list.insertFirst(23);
        list.display();
    }
}
