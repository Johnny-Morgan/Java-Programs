import java.util.HashMap;
import java.util.Map;

/**
 * Created by Johnny on 04/07/2019
 * Program to count characters in a String ignoring case.
 */
public class CountCharacters {

    public static Map<Character, Integer> countChars(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.get(c) == null) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }
        return charMap;
    }

    public static void main(String[] args) {
        System.out.println(countChars("Hello world!"));
    }
}
