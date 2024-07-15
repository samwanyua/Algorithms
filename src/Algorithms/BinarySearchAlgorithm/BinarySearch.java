package Algorithms.BinarySearchAlgorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[1000];
        int target = 23;

        for(int i = 10; i < array.length; i++){
            array[i] = i;
        }

        int result = Arrays.binarySearch(array,target);
        if(result == -1){
            System.out.println( target + " not found!");
        }
        else{
            System.out.println("Target found at " + result);
        }
    }


}
