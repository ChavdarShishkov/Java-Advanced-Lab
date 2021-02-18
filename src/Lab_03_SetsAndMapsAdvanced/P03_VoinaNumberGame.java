package Lab_03_SetsAndMapsAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class P03_VoinaNumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashSet<Integer> firstPlayer =
                Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayer =
                Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            Integer firstPlayerCard = getTopValue(firstPlayer);
            Integer secondPlayerCard = getTopValue(secondPlayer);

            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            } else {
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }

        int firstPlayerDeckSize = firstPlayer.size();
        int secondPlayerDeckSize = secondPlayer.size();
        if (firstPlayerDeckSize > secondPlayerDeckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDeckSize > firstPlayerDeckSize) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        for (Integer integer : set) {
            return integer;
        }
        return 0;
    }
}
