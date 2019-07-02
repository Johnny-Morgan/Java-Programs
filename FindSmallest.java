/**
 * Created by Johnny on 02/07/2019
 * Program to find the smallest, second smallest and third smallest element in an array
 */
public class FindSmallest {

    public static int findMin(int[]array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findSecondMin(int[]array) {
        int min = array[0];
        int min2 = array[1];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min2 = min;
                min = array[i];
            }else if(array[i] < min2) {
                min2 = array[i];
            }
        }
        return min2;
    }

    public static int findThirdMin(int[]array) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min3 = min2;
                min2 = min;
                min = array[i];
            }else if(array[i] < min2) {
                min3 = min2;
                min2 = array[i];
            }else if(array[i] < min3) {
                min3 = array[i];
            }
        }
        return min3;
    }


    public static void main(String[] args) {
        int[]myArray = {4, 8, 15, 16, 23, 42};
        System.out.println("The smallest element is " + findMin(myArray));
        System.out.println("The second smallest element is " + findSecondMin(myArray));
        System.out.println("The third smallest element is " + findThirdMin(myArray));
    }
}
