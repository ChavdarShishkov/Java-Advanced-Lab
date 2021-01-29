package Lab_03_SetsAndMapsAdvanced;

import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<String, List<String>>> info = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            info.putIfAbsent(continent, new LinkedHashMap<>());
            info.get(continent).putIfAbsent(country, new ArrayList<>());
            info.get(continent).get(country).add(city);
        }
        info.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((k, v) -> {
                System.out.printf("   %s -> %s%n", k, String.join(", ", v));
            });
        });
    }
}
