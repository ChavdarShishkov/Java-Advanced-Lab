package Lab_08_Generics.P01_JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();

        jar.add(13);

        Jar<String> jarJar = new Jar<>();
        jarJar.add("Pesho");

    }
}
