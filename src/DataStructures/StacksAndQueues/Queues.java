package DataStructures.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);

        System.out.println(queue); // printing a queue

        System.out.println(queue.peek()); // peeks the head
        System.out.println(queue.remove()); // removes the head
        System.out.println(queue.offer(4));

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(45);
        deque.addLast(32);

        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque.offerFirst(4)); // inserts at the front of the deque unless it would violate capacity restrictions
        System.out.println(deque);
    }
}
