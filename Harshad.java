import javax.swing.*;
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

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter first number: ","Enter a range of positive numbers",
                JOptionPane.INFORMATION_MESSAGE));

        int lastNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter second number: ","Enter a range of positive numbers",
                JOptionPane.INFORMATION_MESSAGE));

        String message= "";
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (isAHarshad(i))
                message += i + ", ";
        }
        JOptionPane.showMessageDialog(null, message,
                "The harshad numbers in the range "+ firstNumber + " - " + lastNumber + " are:" ,
                JOptionPane.INFORMATION_MESSAGE);
    }
}