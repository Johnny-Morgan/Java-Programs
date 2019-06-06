/**
 * Created by Johnny on 06/06/2019
 * Luhn algorithm https://en.wikipedia.org/wiki/Luhn_algorithm
 */
public class LuhnAlgorithm {

    public static boolean validate(String n) {
        int[] numbers = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            numbers[i] = Character.getNumericValue(n.charAt(i));
        }
        boolean flag = false;
        int sum = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (flag) {
                numbers[i] = numbers[i] * 2;
                if (numbers[i] > 9) {
                    int temp = numbers[i] % 10;
                    numbers[i] /= 10;
                    numbers[i] += temp;
                }
                flag = true;
            }
            sum += numbers[i];
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {

        System.out.println(validate("12345"));

    }
}
