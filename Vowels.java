import java.util.Scanner;

/**
 * Created by Johnny on 11/01/2019
 * Program to count the number of vowels and digits in a sentence
 */
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vowelCount = 0;
        int digitCount = 0;
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String sentence = input.toLowerCase();

        for(int i = 0; i < sentence.length(); i++){

            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                vowelCount++;
            }
            if(sentence.charAt(i) >= 48 && sentence.charAt(i) <= 57){
                digitCount++;
            }
        }
        System.out.format("Your sentence is: %s%nThe number of vowels is %d%nThe number of digits is %d",
                input, vowelCount, digitCount);
    }
}
