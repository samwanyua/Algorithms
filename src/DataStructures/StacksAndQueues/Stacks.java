package DataStructures.StacksAndQueues;

import java.util.Stack;

public class Stacks {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34); // push is to insert
        stack.push(87); // O(n)
        stack.push(234);
        stack.push(324);
        stack.push(45);

        System.out.println(stack.pop()); // to remove O(n)
        System.out.println(stack.size());
        System.out.println(stack); // to print a stack


    }
}
