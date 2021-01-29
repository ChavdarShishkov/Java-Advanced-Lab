package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String task = sc.nextLine();

        ArrayDeque<String> printer = new ArrayDeque<>();

        while (!"print".equals(task)) {
            if (task.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printer.poll());
                }
            } else {
                printer.offer(task);
            }
            task = sc.nextLine();
        }
        while (!printer.isEmpty()) {
            System.out.println(printer.poll());
        }
    }
}
