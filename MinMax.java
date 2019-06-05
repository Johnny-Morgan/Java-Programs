import java.util.Arrays;

/**
 * Created by Johnny on 05/06/2019
 * Program that returns an array containing the min and max of a given array
 */
public class MinMax {
    public static int[] minMax(int[] arr) {

        int[]minAndMax = new int[2];
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        minAndMax[0] = min;
        minAndMax[1] = max;
        return minAndMax;
    }

    // the above minMax method can be replaced with the following method:
    public static int[] minMaxAlternative(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length -1]};
    }

    public static void main(String[] args) {
        int[]testArray = {18, 25, 3, -48, 5, 4};
        //test minMax method
        System.out.println(Arrays.toString(minMax(testArray)));
        //test minMaxAlternative method
        System.out.println(Arrays.toString(minMaxAlternative(testArray)));
    }
}
