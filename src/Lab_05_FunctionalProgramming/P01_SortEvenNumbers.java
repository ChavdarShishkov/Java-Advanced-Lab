package Lab_05_FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P01_SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputNumbers =
                Arrays.stream(reader.readLine().split(",\\s+")).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();
        reader.close();
        System.out.println(formatArray(inputNumbers));

        Arrays.sort(inputNumbers);

        System.out.println(formatArray(inputNumbers));
    }

    public static String formatArray(int[] arr) {
        return Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }
}
