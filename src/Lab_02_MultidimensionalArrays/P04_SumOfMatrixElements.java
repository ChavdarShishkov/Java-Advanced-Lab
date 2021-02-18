package Lab_02_MultidimensionalArrays;

import java.util.Scanner;

public class P04_SumOfMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = readMatrix(sc);
        int sum = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.printf("%d\n%d\n%d", matrix.length, matrix[0].length, sum);
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(tokens[0]);

        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] inputTokens = scanner.nextLine().split(", ");

            for (int column = 0; column < cols; column++) {

                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        return matrix;
    }
}
