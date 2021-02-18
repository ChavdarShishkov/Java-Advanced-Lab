package Lab_04_StreamsFilesAndDirectories;

import java.io.File;
import java.util.*;

public class P08_NestedFolders {
    public static void main(String[] args) {
        String path = "C:\\Users\\chocho\\Documents\\JAVA\\JavaFund\\" + "07.Files And Directories - " + "Lab" +
                "\\resources\\Files-and-Streams";

        File dir = new File(path);

        Deque<File> files = new ArrayDeque<>();
        files.addLast(dir);
        List<String> folders = new ArrayList<>();

        while (!files.isEmpty()) {
            File currentDir = files.removeFirst();
            if (currentDir.isDirectory()) {
                for (File file : Objects.requireNonNull(currentDir.listFiles())) {
                    if (file.isDirectory()) {
                        files.addLast(file);
                    }
                }
                folders.add(currentDir.getName());
            }
        }
        folders.forEach(System.out::println);
        System.out.printf("%d folders%n", folders.size());
    }
}
