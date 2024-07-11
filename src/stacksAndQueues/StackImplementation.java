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
}
