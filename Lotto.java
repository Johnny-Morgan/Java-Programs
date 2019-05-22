import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Johnny on 20/05/2019
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class Lotto {

    public static void shuffleLotto(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < 47; i++) {
            int shuffle = r.nextInt(47);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void shuffleEuro(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int shuffle = r.nextInt(50);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void shuffleEuroLuckyStar(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < 12; i++) {
            int shuffle = r.nextInt(12);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void printNumbersEuro(int noOfLines, int[] mainNumbers, int[] luckyStarNumbers) {
        System.out.println("Your Euromillions numbers are:");
        for (int i = 1; i <= noOfLines; i++) {
            shuffleEuro(mainNumbers);
            shuffleEuroLuckyStar(luckyStarNumbers);
            System.out.print("Line " + i + ": ");

            // create array to store first 5 numbers of shuffled array
            int[] myMainNums = new int[5];
            for (int num = 0; num < 5; num++) {
                myMainNums[num] = mainNumbers[num];
            }
            // sort the 5 numbers so they can be printed in order
            Arrays.sort(myMainNums);

            // create array to store first 2 numbers of shuffled array
            int[] myLuckyStarNums = new int[2];
            for (int num = 0; num < 2; num++) {
                myLuckyStarNums[num] = luckyStarNumbers[num];
            }
            // sort the 2 numbers so they can be printed in order
            Arrays.sort(myLuckyStarNums);

            for (int num = 0; num < 5; num++) {
                System.out.print(myMainNums[num] + " ");
            }
            for (int num = 0; num < 2; num++) {
                System.out.print(myLuckyStarNums[num] + " ");
            }
            System.out.println();
        }
    }

    public static void printNumbersLotto(int noOfLines, int[] numbers) {
        System.out.println("Your Lotto numbers are:");
        for (int i = 1; i <= noOfLines; i++) {
            shuffleLotto(numbers);
            System.out.print("Line " + i + ": ");

            // create array to store first 6 numbers of shuffled array
            int[] myNums = new int[6];
            for (int num = 0; num < 6; num++) {
                myNums[num] = numbers[num];
            }
            // sort the 6 numbers so they can be printed in order
            Arrays.sort(myNums);

            for (int num = 0; num < 6; num++) {
                System.out.print(myNums[num] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // initialise array with 47 numbers for Irish Lotto
        int[] lottoNumbers = new int[47];
        for (int i = 0; i < 47; i++) {
            lottoNumbers[i] = i + 1;
        }
        // initialise array with 50 numbers for Euromillions
        int[] euroNumbers = new int[50];
        for (int i = 0; i < 50; i++) {
            euroNumbers[i] = i + 1;
        }

        // initialise array with 12 numbers for Euromillions Lucky Star
        int[] luckyNumbers = new int[12];
        for (int i = 0; i < 12; i++) {
            luckyNumbers[i] = i + 1;
        }

        System.out.print("How many lines do you want to play: ");
        int lines = kb.nextInt();

        //printNumbersLotto(lines, lottoNumbers);
        printNumbersEuro(lines, euroNumbers, luckyNumbers);
        System.out.println("Good luck!");
    }
}
