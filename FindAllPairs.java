/**
 * Created by Johnny on 26/06/2019
 * Given an array of integers, count all the pairs of integers
 */
public class FindAllPairs {

    public static int duplicates(int[] array) {
        int count;
        int pairs = 0;

        for (int i = 0; i < array.length; i++) {
            count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1, 2, 3, 4, 1, 1, 1, 4}));
    }
}
