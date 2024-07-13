package Algorithms.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9,1,84,53,55,32,45,3,34,341};
        int index = searchLinearly(array, 341);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int searchLinearly(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }


}
