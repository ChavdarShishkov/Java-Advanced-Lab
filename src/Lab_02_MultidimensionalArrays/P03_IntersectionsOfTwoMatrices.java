package Lab_02_MultidimensionalArrays;

import java.util.Scanner;

public class P03_IntersectionsOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());

        int cols = Integer.parseInt(sc.nextLine());
        char[][] firstMatrix = readMatrix(sc, rows, cols);
        char[][] secondMatrix = readMatrix(sc, rows, cols);

        char[][] outputMatrix = new char[rows][cols];

        for (int row = 0; row < outputMatrix.length; row++) {
            for (int col = 0; col < outputMatrix[row].length; col++) {
                outputMatrix[row][col] = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
            }
        }

        for (char[] matrix : outputMatrix) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[col] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] symbols = scanner.nextLine().split("\\s+");

            for (int column = 0; column < cols; column++) {

                matrix[row][column] = symbols[column].charAt(0);
            }
        }
        return matrix;
    }
}
