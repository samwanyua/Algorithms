package stacksAndQueues;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // call all previous items in new array now
            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front + 1) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
