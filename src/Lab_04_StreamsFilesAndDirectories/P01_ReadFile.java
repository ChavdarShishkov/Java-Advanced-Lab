package Lab_04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " +
                "Lab\\resources\\input.txt";

        try (FileInputStream inputStream = new FileInputStream(path)) {
            int byteData = inputStream.read();

            while (byteData >= 0) {
                System.out.print(Integer.toBinaryString(byteData) + " ");
                byteData = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
