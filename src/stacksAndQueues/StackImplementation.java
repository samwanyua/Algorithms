package stacksAndQueues;

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

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }

        int removed = data[pointer];
        pointer--;

        return removed; // return data[pointer--]; --> simplified
    }

    // peek - the topmost value
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }

        return data[pointer];
    }

    private boolean isFull() {
        return pointer == data.length - 1; // pointer at the last index
    }

    private boolean isEmpty() {
        return pointer == - 1;
    }


}
