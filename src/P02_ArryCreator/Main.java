package P02_ArryCreator;

public class Main {
    public static void main(String[] args) {

        String[] array = ArrayCreator.createArray(13, "Java");

        for (String integer : array) {
            Main.<String>print(integer);
        }
    }

    public static <T> void print(T num) {
        System.out.println(num);
    }
}
