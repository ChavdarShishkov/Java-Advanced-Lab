package Lab_03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> vips = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String input = sc.nextLine();

        while (!input.equalsIgnoreCase("party")) {
            if (Character.isDigit(input.charAt(0))) {
                vips.add(input);
            } else {
                regular.add(input);
            }
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            if (Character.isDigit(input.charAt(0))) {
                vips.remove(input);
            } else {
                regular.remove(input);
            }
            input = sc.nextLine();
        }

        System.out.println(vips.size() + regular.size());
        vips.addAll(regular);
        System.out.println(getCollect(vips));
    }

    private static String getCollect(Set<String> set) {
        return set.stream().collect(Collectors.joining(System.lineSeparator()));
    }
}
