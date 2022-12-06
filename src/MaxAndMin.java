import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        //Array to store our random values - smaller gives better results
        int[] myNumbers = new int[5];

        //Populate the array with random values between 1 - 10
        //Get the min & max at the same time.
        int min = 100; //Set to initial value > 10
        int max = -10; //Initial val < 0

        //Loop through the array populating and checking for min & max
        for(int i = 0; i < myNumbers.length; i++){
            Random rnd = new Random();
            int num = rnd.nextInt(10) + 1;
            myNumbers[i] = num;
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        System.out.println("The minimum value was " + min + " and the maximum value was " + max);
    }
}
