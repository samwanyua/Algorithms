package stacksAndQueues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length; // pointer at the last index
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++; // same as data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display(){
//        for(int i = front; i < end; i++){
//            System.out.print(data[i] + " <-- ");
//        }
//        System.out.println("End");

        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i] + " ->");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("End!!");

    }

    public static void main(String[] args) throws Exception {
        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.insert(344);
        circularQueue.insert(7429837);
        circularQueue.insert(421897);

        circularQueue.display();
        System.out.println(circularQueue.remove()); // O(n)
        System.out.println(circularQueue.peek());
        circularQueue.insert(324324);
        circularQueue.display();

    }
}
