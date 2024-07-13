package Algorithms.LinearSearchAlgorithm;

public class LinearSearch {
    private static int searchLinearly(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {9,1,84,53,55,32,45,3,34,341,32,324,34213};
        int index = searchLinearly(array, 341);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }


}
