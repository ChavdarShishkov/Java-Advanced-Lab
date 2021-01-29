package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] children = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children)
            queue.offer(child);
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
