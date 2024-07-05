package Array;

public class Array {
    public void arrayDemo(){
        int[] marks;
        int[] age = new int[5];

        // Add and update
        age[0] = 5;
        age[1] = 21;
        age[2] = 45;
        age[3] = 42;
        age[4] = 31;

        // printing a particular index
        System.out.println(age[0]);

        // Looping through the array
        for (int j : age) {
            System.out.println(j);
        }
        System.out.println("End of loop");

        // length of array
        System.out.println(age.length);

        // accessing the last element
        System.out.println(age.length - 1);
    }

    // removing elements in an integer
    // ex. remove even numbers in a given array
    // ex. input arr = {3,2,4,7,10,6,5}
    //      output arr = {3,7,5}
    int[] arr = {3,2,4,7,10,6,5};
    public int[] removeEvenNumbers(int[] arr){
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }

    // How to reverse an array in java
    /* Given an array or string, the task is to reverse the array or string
        input - {2,11,5,10,7,8}
        output - {8,7,10,5,11,2}
     */
    public void reverseArray(int[] numbers, int start, int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = numbers[start];
            start++;
            end--;
        }
    }

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

    // Find the minimum value in array
    public int findMinimum(int[] arr){
        // edge case
        if(arr == null ||  arr.length == 0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    // Finding the second maximum value in an array
    // Given an array of integers return the second maximum value
    // input: arr = {12,34,2,34,33,1}
    // output: 33
    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE = -2147483648
        int secondMax = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > max){
                secondMax = max;
                max = i;
            }
            else if( i > secondMax && i != max){
                secondMax = i;
            }
        }
        return  secondMax;
    }

}
