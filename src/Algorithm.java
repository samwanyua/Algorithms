import Array.Array;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        Array array = new Array();
        array.arrayDemo();
        int[] arr = {3,2,4,7,10,6,5};
        int[] result = array.removeEvenNumbers(arr);
        System.out.println(Arrays.toString(result));

        // reversing an array
        int[] numbers = {2,11,5,10,7,8};
        array.reverseArray(numbers, 0, numbers.length - 1);
    }
}