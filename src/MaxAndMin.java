import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        //Array to store our random values - smaller gives better results
        int[] myNumbers = new int[10];

        //Populate the array with random values between 1 - 10
        //Get the min & max at the same time.
        int min = 100; //Set to initial value > 10
        int max = -10; //Initial val < 0

        //Loop through the array populating and checking for min & max
        System.out.println("The numbers: ");
        for(int i = 0; i < myNumbers.length; i++){
            Random rnd = new Random();
            int num = rnd.nextInt(10) + 1;
            System.out.print(num + " ");
            myNumbers[i] = num;
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        System.out.println("");
        System.out.println("The minimum value was " + min + " and the maximum value was " + max);

        //Print the even numbers
        System.out.println("Even: ");
        for(int i = 0; i < myNumbers.length; i++) {
            if(myNumbers[i] % 2 == 0){
                System.out.print(myNumbers[i] + " ");
            }
        }

        //Print the odd numbers
        System.out.println("");
        System.out.println("Odd: ");
        for(int i = 0; i < myNumbers.length; i++) {
            if(myNumbers[i] % 2 == 1){
                System.out.print(myNumbers[i] + " ");
            }
        }
    }
}
