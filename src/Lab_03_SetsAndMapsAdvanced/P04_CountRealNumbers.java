package Lab_03_SetsAndMapsAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class P04_CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> occurrences = new LinkedHashMap<>();

        for (double v : numbers) {
            if (occurrences.containsKey(v)) {
                occurrences.put(v, occurrences.get(v) + 1);
            } else {
                occurrences.put(v, 1);
            }
        }
        for (Double number : occurrences.keySet()) {
            System.out.printf("%.1f -> %d\n", number, occurrences.get(number));
        }
    }
}
