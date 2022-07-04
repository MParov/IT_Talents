import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize;
        do {
            System.out.print("Please insert matrix size size: ");
            matrixSize = scanner.nextInt();
        } while (matrixSize < 2);

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Please insert element of the matrix: ");
                matrix[row][col] = scanner.nextInt();
            }
        }
        System.out.print("The primary diagonal is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("The secondary diagonal is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row + col) == (matrix.length - 1)) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}
