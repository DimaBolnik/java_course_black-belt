package worl_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        Path directiryPath = Path.of("C:\\Users\\User\\Desktop\\M");
        Path directiryBPath = Path.of("C:\\Users\\User\\Desktop\\B");

//        Files.copy(filePath, directiryPath.resolve(filePath)
//        , StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directiryPath.resolve("test16.txt"));
//        Files.copy(directiryBPath, directiryPath.resolve("B"));

//        Files.move(filePath, directiryPath.resolve("test15.txt"));
//        Files.move(filePath, Path.of("test11.txt"));
//        Files.deleteIfExists(Path.of("my_test.bin"));
        Files.deleteIfExists(directiryPath);
        System.out.println("Done!");
    }
}
