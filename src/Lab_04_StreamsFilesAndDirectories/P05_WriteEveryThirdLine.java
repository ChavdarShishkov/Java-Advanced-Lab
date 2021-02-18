package Lab_04_StreamsFilesAndDirectories;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " + "Lab" +
                "\\resources";

        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\5output.txt";

        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(new FileInputStream(inputPath))); PrintWriter out =
                new PrintWriter(new FileWriter(outPath))) {
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (lineNumber % 3 == 0) {
                    out.println(line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
