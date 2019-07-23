import java.util.Arrays;

/**
 * Created by Johnny on 23/07/2019
 * Given a number, return the largest number that could be formed from the digits of the given number
 */
public class FormTheLargest {

    public static long maxNumber(long n) {
        String num = Long.toString(n);
        char[]digits = num.toCharArray();
        Arrays.sort(digits);

        String solution = "";
        for(int i = digits.length - 1; i >= 0; i--) {
            solution += digits[i];
        }

        return Long.parseLong(solution);
    }
    public static void main(String[] args) {

        System.out.println(maxNumber(18283947));
        
    }
}
