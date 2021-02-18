package Lab_03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String cardRegistration = input.substring(input.indexOf(", ") + 2);
            if (input.contains("IN")) {
                parking.add(cardRegistration);
            } else {
                parking.remove(cardRegistration);
            }
            input = sc.nextLine();
        }

        String collect = parking.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(collect);
    }
}
