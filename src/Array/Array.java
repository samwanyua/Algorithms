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

        System.out.println(age[0]);
        for(int i = 0; i <= age.length; i++){
            System.out.println(age[i]);
        }
        System.out.println("End of loop");
    }

}
