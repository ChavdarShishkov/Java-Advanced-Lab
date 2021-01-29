package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println("0");
            return;
        }

        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}
