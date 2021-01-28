package Lab_05_FunctionalProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class P02_SumNumbers {
    public static void main(String[] args) throws Exception {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        reader.close();
        Function<String, IntStream> getIntStream = str -> Arrays.stream(str.split(",\\s+")).mapToInt(Integer::parseInt);

        Function<String, Long> getCount = str -> getIntStream.apply(str).count();

        Function<String, Integer> getSum = str -> getIntStream.apply(str).sum();

        System.out.println("Count = " + getCount.apply(input));
        System.out.println("Sum = " + getSum.apply(input));
    }
}
