package worl_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("test10,txt");
//        Files.createFile(filePath);
//        String dialog = "-PrivaT\n-Privet\n-kak dela\n-normallno";
//        Files.write(filePath, dialog.getBytes());

        Files.lines(filePath)
                .forEach(System.out::println);

//        List<String> strings = Files.readAllLines(filePath);
//        for (String string : strings) {
//            System.out.println(string);
//        }

    }
}
