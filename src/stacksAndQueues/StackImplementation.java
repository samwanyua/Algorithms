package stacksAndQueues;

import java.util.Arrays;

public class StackImplementation {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public StackImplementation() {
        this(DEFAULT_SIZE);
    }

    public StackImplementation(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }

        int removed = data[pointer];
        pointer--;

        return removed; // return data[pointer--]; --> simplified
    }

    // peek - the topmost value
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }

        return data[pointer];
    }

    private boolean isFull() {
        return pointer == data.length - 1; // pointer at the last index
    }

    private boolean isEmpty() {
        return pointer == - 1;
    }

    public static void main(String[] args) throws StackException {
        StackImplementation stackImplementation = new StackImplementation(8);
        stackImplementation.push(90);
        stackImplementation.push(23);
        stackImplementation.push(25);
        stackImplementation.push(54);
        stackImplementation.push(76);

        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.peek());


    }


}
