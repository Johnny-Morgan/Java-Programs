import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Johnny on 12/06/2019
 * Program to create a method that turns a string into a Mexican Wave.
 * The method is passed a string and must return that string in an array
 * where an uppercase letter is a person standing up.
 * If the character in the string is whitespace then pass over it as if it was an empty seat.
 * Example: wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
 */
public class MexicanWave {

    public static String[] wave(String str) {
        List<String> myList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                continue;
            myList.add(str.substring(0 , i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
        }
        return myList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        // test wave() method
        System.out.println(Arrays.toString(wave("hello")));
    }
}
