package Lab_05_FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class P05_FilterByAge {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BiPredicate<Integer, Map.Entry<String, Integer>> filterYounger = (age, value) -> age > value.getValue();

        BiPredicate<Integer, Map.Entry<String, Integer>> filterOlder = (age, value) -> age <= value.getValue();

        Consumer<Map.Entry<String, Integer>> namePrinter = entry -> System.out.println(entry.getKey());

        Consumer<Map.Entry<String, Integer>> agePrinter = entry -> System.out.println(entry.getValue());

        Consumer<Map.Entry<String, Integer>> entryPrinter =
                entry -> System.out.println(entry.getKey() + " - " + entry.getValue());

        int peopleCount = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] personData = reader.readLine().split(", ");
            people.put(personData[0], Integer.parseInt(personData[1]));
        }
        String comparison = reader.readLine();
        int ageLimit = Integer.parseInt(reader.readLine());
        String printType = reader.readLine();

        Consumer<Map.Entry<String, Integer>> printer;

        if (printType.equals("age")) {
            printer = agePrinter;
        } else if (printType.equals("name")) {
            printer = namePrinter;
        } else {
            printer = entryPrinter;
        }

        BiPredicate<Integer, Map.Entry<String, Integer>> filterAge;
        if (comparison.equals("younger")) {
            filterAge = filterYounger;
        } else {
            filterAge = filterOlder;
        }

        BiPredicate<Integer, Map.Entry<String, Integer>> finalFilterAge = filterAge;
        people.entrySet().stream().filter(entry -> finalFilterAge.test(ageLimit, entry)).forEach(printer);

    }
}
