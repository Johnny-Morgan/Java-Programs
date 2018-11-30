package Lab5;

import java.util.Scanner;

/**
 * Created by Johnny on 30/11/2018
 * Program to find and output the composite numbers in a range of inputted numbers
 */
public class Composite {
    private static boolean isAComposite(int num) {
        if (num == 1 || num == 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a range of numbers");
        System.out.print("Enter first number in range: ");
        int firstNum = kb.nextInt();

        System.out.print("Enter second number in range: ");
        int secondNum = kb.nextInt();

        System.out.println("The composite numbers in the range " + firstNum + " - " + secondNum + " are:");

        for (int i = firstNum; i <= secondNum; i++) {
            if (isAComposite(i))
                System.out.println(i);
        }
    }
}
