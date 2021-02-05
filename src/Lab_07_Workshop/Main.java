package Lab_07_Workshop;

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 0; i < 100; i++) {
            smartArray.add(i + 1);
        }
        while (smartArray.isEmpty()) {
            System.out.println(smartArray.remove(8));
        }
    }
}
