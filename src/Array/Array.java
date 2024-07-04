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

}
