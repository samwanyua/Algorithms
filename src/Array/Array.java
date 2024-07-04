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

}
