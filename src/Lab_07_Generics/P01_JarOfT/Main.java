package Lab_07_Generics.P01_JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();

        jar.add("First");
        jar.add("Second");
        jar.add("Third");

        System.out.println(jar.remove());
    }
}
