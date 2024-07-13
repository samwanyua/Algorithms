package Algorithms.BinarySearchAlgorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[100];
        int target = 45;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        int index = Arrays.binarySearch(array,target);
        if(index == -1){
            System.out.println( target + " not found!");
        }
        else{
            System.out.println("Target found at " + index);
        }
    }


}
