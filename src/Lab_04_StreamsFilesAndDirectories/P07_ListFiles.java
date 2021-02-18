package Lab_04_StreamsFilesAndDirectories;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {
        String path = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " +
                "Lab\\resources\\Files-and-Streams";

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles == null) {
            return;
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.printf("%s: [%d]%n", file.getName(), file.length());
            }
        }
    }
}
