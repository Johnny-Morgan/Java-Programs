import java.util.Scanner;

/**
 * Created by Johnny on 03/12/2018
 * Program to rotate contents of a matrix
 */
public class RotateMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] rotate90deg(int[][] matrix) {

        int length = matrix.length;
        int[][] rotatedMatrix = new int[length][length];

        for (int row = 0; row < matrix.length; row++) {
            length--;
            for (int col = 0; col < matrix.length; col++) {
                rotatedMatrix[col][length] = matrix[row][col];
            }
        }return rotatedMatrix;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println();

        System.out.println("Rotate matrix. Choose 1, 2 or 3:");
        System.out.println("1. 90 deg");
        System.out.println("2. 180 deg");
        System.out.println("3. 270 deg");

        int rotation = keyboard.nextInt();

        switch(rotation){
            case 1:
                matrix = rotate90deg(matrix);
                printMatrix(matrix);
                break;
            case 2:
                matrix = rotate90deg(matrix);
                matrix = rotate90deg(matrix);
                printMatrix(matrix);
                break;
            case 3:
                matrix = rotate90deg(matrix);
                matrix = rotate90deg(matrix);
                matrix = rotate90deg(matrix);
                printMatrix(matrix);
                break;
        }
    }
}
