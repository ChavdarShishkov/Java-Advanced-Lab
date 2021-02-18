package Lab_04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class P02_WriteToFile {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " + "Lab" +
                "\\resources";

        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\output.txt";

        FileOutputStream outputStream;
        List<Character> punctuation = Arrays.asList(',', '.', '?', '!');

        try (FileInputStream inputStream = new FileInputStream(inputPath)) {
            outputStream = new FileOutputStream(outPath);
            int byteData = inputStream.read();

            while (byteData >= 0) {
                if (!punctuation.contains((char) byteData)) {
                    outputStream.write(byteData);
                }
                byteData = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
