package stacksAndQueues;

public class DynamicStack extends StackImplementation{
    public DynamicStack() {
        super(); // calls a constructor that takes no arguments
    }

    public DynamicStack(int size) {
        super(); // calls a constructor that takes with arguments
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // call all previous items in new array now
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        // insert item
        return super.push(item);
    }
}
