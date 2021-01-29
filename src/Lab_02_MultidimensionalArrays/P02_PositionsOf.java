package Lab_02_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = readMatrix(sc);
        int numberToSearch = Integer.parseInt(sc.nextLine());

        ArrayList<int[]> indexes = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToSearch) {
                    indexes.add(new int[]{row, col});
                }
            }
        }
        if (indexes.isEmpty()) {
            System.out.println("not found");
        } else {
            for (int[] index : indexes) {
                System.out.println(index[0] + " " + index[1]);
            }
        }
    }

    private static int[][] readMatrix(Scanner scanner) {

        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] inputTokens = scanner.nextLine().split(" ");

            for (int column = 0; column < cols; column++) {

                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        return matrix;
    }
}
