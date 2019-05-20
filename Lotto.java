import java.util.Random;
import java.util.Scanner;

/**
 * Created by Johnny on 20/05/2019
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class Lotto {

    public static void shuffle(int[]nums){
        Random r = new Random();
        for(int i = 0; i<47; i++){
            int shuffle = r.nextInt(47);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void printNumbers(int noOfLines, int[]numbers){
        System.out.println("Your lotto numbers are:");
        for(int i = 1; i <= noOfLines; i++){
            shuffle(numbers);
            System.out.print("Line " + i + ": ");
            for(int num = 0; num < 6; num++){
                System.out.print(numbers[num] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // initialise array with 47 numbers
        int[] numbers = new int[47];
        for(int i = 0; i < 47; i++){
            numbers[i] = i + 1;
        }

        System.out.print("How many lines do you want to play: ");
        int lines = kb.nextInt();
        printNumbers(lines, numbers);
        System.out.println("Good luck!");

    }
}
