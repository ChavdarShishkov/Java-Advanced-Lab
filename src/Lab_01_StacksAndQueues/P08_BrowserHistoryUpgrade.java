package Lab_01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String current = "";

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!browserHistory.isEmpty()) {
                    forwardHistory.push(current);
                    current = browserHistory.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = sc.nextLine();
                    continue;
                }
            } else if (line.equals("forward")) {
                if (forwardHistory.size() < 1) {
                    System.out.println("no next URLs");
                    line = sc.nextLine();
                    continue;
                } else {
                    current = forwardHistory.pop();
                    browserHistory.push(current);
                }
            } else {
                if (!current.equals("")) {
                    browserHistory.push(current);
                }
                current = line;
            }
            System.out.println(current);
            line = sc.nextLine();
        }
    }
}
