package stacksAndQueues;

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

    }
}
