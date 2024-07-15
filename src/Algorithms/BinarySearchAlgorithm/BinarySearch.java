package Algorithms.BinarySearchAlgorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[10];
        int target = 8;

        for(int i = 1; i < array.length; i++){
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
