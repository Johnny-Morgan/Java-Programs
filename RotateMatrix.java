import java.util.Random;
import java.util.Scanner;

/**
 * Created by Johnny on 03/12/2018
 * Program to rotate contents of a matrix
 */
public class RotateMatrix {
    static Scanner keyboard = new Scanner(System.in);

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.printf("Row %d%n", row + 1);
            for (int col = 0; col < matrix.length; col++) {
                System.out.print("Enter number: ");
                matrix[row][col] = keyboard.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] createRandomMatrix(int[][] matrix) {
        Random random = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                //fill matrix with random number between 1 and 100
                matrix[row][col] = random.nextInt(100) + 1;
            }
        }
        return matrix;
    }

    public static int[][] rotate90deg(int[][] matrix) {

        int length = matrix.length;
        int[][] rotatedMatrix = new int[length][length];

        for (int row = 0; row < matrix.length; row++) {
            length--;
            for (int col = 0; col < matrix.length; col++) {
                rotatedMatrix[col][length] = matrix[row][col];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int size, choice, selection;

        System.out.println("Choose size of your matrix:");
        System.out.print("Enter 2 for 2x2, 3 for 3x3 etc. : ");

        size = keyboard.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("\nFill your matrix. Choose 1 or 2:");
        System.out.println("1. Manually enter numbers");
        System.out.println("2. Computer generated numbers");

        choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                matrix = createMatrix(matrix);
                break;
            case 2:
                matrix = createRandomMatrix(matrix);
                break;
            default:
                System.out.println("Invalid entry");
        }

        System.out.println("\nYour matrix:");
        printMatrix(matrix);

        do {
            System.out.println("\nRotate matrix. Choose 1, 2 or 3:");
            System.out.println("1. 90 deg");
            System.out.println("2. 180 deg");
            System.out.println("3. 270 deg");
            System.out.println("4. Exit program");
            selection = keyboard.nextInt();

            switch (selection) {
                case 1:
                    matrix = rotate90deg(matrix);
                    System.out.println("\nYour matrix rotated 90 deg:\n");
                    printMatrix(matrix);
                    break;
                case 2:
                    matrix = rotate90deg(matrix);
                    matrix = rotate90deg(matrix);
                    System.out.println("\nYour matrix rotated 180 deg:\n");
                    printMatrix(matrix);
                    break;
                case 3:
                    matrix = rotate90deg(matrix);
                    matrix = rotate90deg(matrix);
                    matrix = rotate90deg(matrix);
                    System.out.println("\nYour matrix rotated 270 deg:\n");
                    printMatrix(matrix);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid entry, try again.");
            }
        } while (selection != 4);
    }
}
