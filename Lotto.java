import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Johnny on 20/05/2019
 * Program to generate lottery numbers for Irish Lotto & Euromillions
 */
public class Lotto {

    private static Scanner kb = new Scanner(System.in);

    private final static int NUM_OF_LOTTO_BALLS = 47;
    private final static int NUM_OF_EUROMILLIONS_BALLS = 50;
    private final static int NUM_OF_LUCKYSTAR_BALLS = 12;

    public static void shuffleLotto(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < NUM_OF_LOTTO_BALLS; i++) {
            int shuffle = r.nextInt(NUM_OF_LOTTO_BALLS);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void shuffleEuro(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < NUM_OF_EUROMILLIONS_BALLS; i++) {
            int shuffle = r.nextInt(NUM_OF_EUROMILLIONS_BALLS);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void shuffleEuroLuckyStar(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < NUM_OF_LUCKYSTAR_BALLS; i++) {
            int shuffle = r.nextInt(NUM_OF_LUCKYSTAR_BALLS);
            int temp = nums[i];
            nums[i] = nums[shuffle];
            nums[shuffle] = temp;
        }
    }

    public static void printNumbersEuro(int noOfLines, int[] mainNumbers, int[] luckyStarNumbers) {
        System.out.println("\nYour Euromillions numbers are:");
        System.out.println("\t\t\t\t\t\t\t\tLucky Star");
        for (int i = 1; i <= noOfLines; i++) {
            shuffleEuro(mainNumbers);
            shuffleEuroLuckyStar(luckyStarNumbers);
            System.out.print("Line " + i + ": \t");

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
                System.out.print(myMainNums[num] + "\t");
            }
            for (int num = 0; num < 2; num++) {
                System.out.print(myLuckyStarNums[num] + "\t");
            }
            System.out.println();
        }
    }

    public static void printNumbersLotto(int noOfLines, int[] numbers) {
        System.out.println("\nYour Lotto numbers are:");
        for (int i = 1; i <= noOfLines; i++) {
            shuffleLotto(numbers);
            System.out.print("Line " + i + ": \t");

            // create array to store first 6 numbers of shuffled array
            int[] myNums = new int[6];
            for (int num = 0; num < 6; num++) {
                myNums[num] = numbers[num];
            }
            // sort the 6 numbers so they can be printed in order
            Arrays.sort(myNums);

            for (int num = 0; num < 6; num++) {
                System.out.print(myNums[num] + "\t");
            }
            System.out.println();
        }
    }

    public static int menu() {
        System.out.println("Which lottery do you wish to play?");
        System.out.println("1. Lotto");
        System.out.println("2. Euromillions");
        System.out.print("Choose 1 or 2: ");
        return kb.nextInt();
    }

    public static void main(String[] args) {

        // initialise array with 47 numbers for Irish Lotto
        int[] lottoNumbers = new int[NUM_OF_LOTTO_BALLS];
        for (int i = 0; i < NUM_OF_LOTTO_BALLS; i++) {
            lottoNumbers[i] = i + 1;
        }

        // initialise array with 50 numbers for Euromillions
        int[] euroNumbers = new int[NUM_OF_EUROMILLIONS_BALLS];
        for (int i = 0; i < NUM_OF_EUROMILLIONS_BALLS; i++) {
            euroNumbers[i] = i + 1;
        }

        // initialise array with 12 numbers for Euromillions Lucky Star
        int[] luckyNumbers = new int[NUM_OF_LUCKYSTAR_BALLS];
        for (int i = 0; i < NUM_OF_LUCKYSTAR_BALLS; i++) {
            luckyNumbers[i] = i + 1;
        }

        int choice = menu();
        System.out.print("\nHow many lines do you want to play: ");
        int lines = kb.nextInt();

        switch (choice) {
            case 1:
                printNumbersLotto(lines, lottoNumbers);
                break;
            case 2:
                printNumbersEuro(lines, euroNumbers, luckyNumbers);
        }
        System.out.println("Good luck!");
    }
}
