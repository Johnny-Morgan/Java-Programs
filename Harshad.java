import java.util.Scanner;

/**
 * Created by Johnny on 27/11/2018
 * Program to check for harshad numbers in a range of numbers
 * A harshad number is a number that is divisible by the sum of its digits
 */
public class Harshad {

    // method to return if a number is a gapful number
    public static boolean isAHarshad(int num) {
        int sum = 0;
        int copy = num;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        return (num % sum == 0);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a range of positive numbers\n");
        System.out.print("Enter first number in range: ");
        int firstNumber = keyboard.nextInt();
        System.out.print("Enter last number in range: ");
        int lastNumber = keyboard.nextInt();

        // Check and output which numbers in the range are harshad numbers
        System.out.printf("%nThe harshad numbers in the range %d - %d are: %n%n", firstNumber, lastNumber);
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (isAHarshad(i))
                System.out.println(i);
        }
    }
}