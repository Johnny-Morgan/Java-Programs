/**
 * Created by Johnny on 03/12/2018
 * Program to rotate contents of a matrix
 */
public class RotateMatrix {
    public static void printMatrix(int[][]matrix){
        for(int row = 0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(matrix);
        System.out.println();

        int length = matrix.length;
        int[][]rotatedMatrix = new int[length][length];

        for(int row = 0; row<matrix.length;row++){
            length--;
            for(int col=0; col<matrix.length; col++){
                rotatedMatrix[col][length]=matrix[row][col];
            }
        }

        System.out.println("Matrix rotated 90 degrees:");
        printMatrix(rotatedMatrix);
    }
}
