package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {

            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (op) {
                case "+" -> stack.push(String.valueOf(first + second));
                case "-" -> stack.push(String.valueOf(first - second));
            }
        }
        System.out.println(stack.pop());
    }
}
