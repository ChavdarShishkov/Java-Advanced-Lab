package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] children = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        int iteration = 0;
        for (String child : children)
            queue.offer(child);
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {

                queue.offer(Objects.requireNonNull(queue.poll()));
            }
            iteration++;
            if (!checkIfPrime(iteration)) {
                System.out.println("Removed " + queue.poll());
            } else {
                System.out.println("Prime " + queue.peek());
            }
        }

        System.out.println("Last is " + queue.poll());
    }

    public static boolean checkIfPrime(int number) {
        int i, m = 0, flag = 0;
        m = number / 2;
        if (number == 0 || number == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    flag = 1;
                    return false;
                }
            }
        }
        return true;
    }
}
