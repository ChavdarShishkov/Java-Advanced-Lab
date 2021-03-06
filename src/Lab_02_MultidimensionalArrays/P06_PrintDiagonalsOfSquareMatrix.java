package Lab_02_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int indexRow = sc.nextInt();
        int indexesCol = sc.nextInt();
        int wrongValue = matrix[indexRow][indexesCol];

        ArrayList<int[]> indexes = new ArrayList<>();
        ArrayList<Integer> correctValues = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    indexes.add(new int[]{row, col});
                    correctValues.add(getCorrectValue(matrix, row, col));
                }
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            int[] rowAndCol = indexes.get(i);
            matrix[rowAndCol[0]][rowAndCol[1]] = correctValues.get(i);
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int getCorrectValue(int[][] matrix, int row, int col) {
        int sum = 0;
        int wrongValue = matrix[row][col];

        if (ifInBounds(matrix, row - 1, col) && wrongValue != matrix[row - 1][col]) {
            sum += matrix[row - 1][col];
        }
        if (ifInBounds(matrix, row + 1, col) && wrongValue != matrix[row + 1][col]) {
            sum += matrix[row + 1][col];
        }
        if (ifInBounds(matrix, row, col - 1) && wrongValue != matrix[row][col - 1]) {
            sum += matrix[row][col - 1];
        }
        if (ifInBounds(matrix, row, col + 1) && wrongValue != matrix[row][col + 1]) {
            sum += matrix[row][col + 1];
        }
        return sum;
    }

    private static boolean ifInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
