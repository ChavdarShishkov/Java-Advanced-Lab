package Lab_04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " + "Lab" +
                "\\resources";

        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\4output.txt";

        try (Scanner inputStream = new Scanner(new FileInputStream(inputPath)); FileOutputStream ignored =
                new FileOutputStream(outPath)) {

            while (inputStream.hasNext()) {
                if (inputStream.hasNextInt()) {
                    System.out.println(inputStream.nextInt());
                }
                inputStream.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
