/**
 * Created by Johnny on 07/06/2019
 * Program to convert a string to a new string where each character in
 * the new string is "(" if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 */
public class DuplicateEncoder {
    static String encode(String word) {

        word = word.toLowerCase();
        char[] w = word.toCharArray();
        int[] counter = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char test = word.charAt(i);
            // if char appears more than once increment corresponding index in counter array
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == test) {
                    counter[i]++;
                    counter[j]++;
                }
            }
        }

        for (int i = 0; i < counter.length; i++) {
            w[i] = counter[i] > 0 ? ')' : '(';
        }
        word = String.valueOf(w);
        return word;
    }

    public static void main(String[] args) {
        System.out.println(encode("Success"));

    }
}
