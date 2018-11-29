package Lab5;

import java.util.Scanner;

/**
 * Created by Johnny on 29/11/2018
 * Program to find prime numbers in a range of numbers
 */
public class Prime {
    public static boolean isAPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a range of numbers");
        System.out.print("Enter first number in range: ");
        int firstNum = kb.nextInt();
        System.out.print("Enter second number in range: ");
        int secondNum = kb.nextInt();
        System.out.println("The prime numbers in the range " + firstNum + " - " + secondNum + " are:");
        for (int i = firstNum; i <= secondNum; i++) {
            if (isAPrime(i))
                System.out.println(i);
        }
    }
}
