import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        //Two arrays of 10 numbers...to start with
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        //Populate array1
        System.out.println("Array 1:");
        for(int i = 0; i < array1.length; i++) {
            //Create two random numbers 1 -20
            Random rnd = new Random();
            int num1 = rnd.nextInt(20) + 1;

            //Populate the array
            array1[i] = num1;

            //print them...
            System.out.print(num1 + " ");
        }
        System.out.println(" ");

        //Populate array2
        System.out.println("Array 2:");
        for(int i = 0; i < array2.length; i++) {
            //Create two random numbers 1 -20
            Random rnd = new Random();
            int num2 = rnd.nextInt(20) + 1;

            //Populate the array
            array2[i] = num2;

            //print them...
            System.out.print(num2 + " ");
        }
        System.out.println(" ");

        System.out.println("Duplicates:");
        //Nested loop to find the duplicates - if any
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++) {
                //If there is a duplicate, print it
                if(array1[i] == array2[j])
                {
                    System.out.println("Found value " + array1[i] + " in array2 at position " + (j + 1));
                }
            }
        }
    }
}
