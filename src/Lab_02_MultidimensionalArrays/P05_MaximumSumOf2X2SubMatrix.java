package Lab_02_MultidimensionalArrays;

import java.util.Scanner;

public class P05_MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = readMatrix(sc);

        for (int index = 0; index < matrix.length; index++) {
            System.out.print(matrix[index][index] + " ");
        }

        System.out.println();

        for (int index = 0; index < matrix.length; index++) {
            System.out.print(matrix[(matrix.length - 1) - index][index] + " ");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(tokens[0]);

        int[][] matrix = new int[rows][rows];

        for (int row = 0; row < rows; row++) {

            String[] inputTokens = scanner.nextLine().split("\\s+");

            for (int column = 0; column < rows; column++) {

                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        return matrix;
    }
}
