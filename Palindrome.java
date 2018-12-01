package Lab5;

import java.util.Scanner;

/**
 * Created by Johnny on 30/11/2018
 * Program to check if an inputted string is a palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int length, low, high;
        String sentence, editedSentence;
        boolean isAPalindrome = false;

        //check if sentence is < 40 characters
        do {
            System.out.print("Enter a sentence (mo more than 40 characters): ");
            sentence = keyboard.nextLine();
            length = sentence.length();
            if (length > 40) {
                System.out.println("That is more than 40 characters!\n");
            }
        } while (length > 40);

        //remove punctuation and white space
        editedSentence = sentence.replaceAll("[^A-Za-z]+", "").toUpperCase();
        length = editedSentence.length();

        //store sentence characters in an array
        char[] letter = new char[length];
        for (int index = 0; index < length; index++) {
            letter[index] = editedSentence.charAt(index);
        }

        low = 0;
        high = letter.length - 1;

        //check if sentence is a palindrome
        while (low < high) {
            if (letter[low] == letter[high]) {
                low++;
                high--;
                isAPalindrome = true;
            }
            else {
                isAPalindrome = false;
                break;
            }
        }

        //output result
        if (isAPalindrome)
            System.out.println(sentence + " is a palindrome");
        else
            System.out.println(sentence + " is not a palindrome");
    }
}
