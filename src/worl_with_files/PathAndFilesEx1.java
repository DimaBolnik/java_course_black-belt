package worl_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directiryPath = Path.of("C:\\Users\\User\\Desktop\\M");


        System.out.println("filePath.getFileName() = " + filePath.getFileName());
        System.out.println("directiryPath.getFileName() = " + directiryPath.getFileName());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("filePath.getParent() = " + filePath.getParent());
        System.out.println("directiryPath.getParent() = " + directiryPath.getParent());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("filePath.getRoot() = " + filePath.getRoot());
        System.out.println("directiryPath.getRoot() = " + directiryPath.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("filePath.isAbsolute() = " + filePath.isAbsolute());
        System.out.println("directiryPath.isAbsolute() = " + directiryPath.isAbsolute());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("filePath.toAbsolutePath() = " + filePath.toAbsolutePath().getRoot());
        System.out.println("directiryPath.toAbsolutePath() = " + directiryPath.toAbsolutePath());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("directiryPath.resolve(filePath) = "
                           + directiryPath.resolve(filePath));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Path anotherPath = Path.of("C:\\Users\\User\\Desktop\\M\\N\\Z\\test20.txt");

        System.out.println("directiryPath.relativize(anotherPath) = "
                           + directiryPath.relativize(anotherPath));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if(!Files.exists(directiryPath)){
            Files.createDirectory(directiryPath);
        }

        System.out.println("Files.isReadable(filePath) = "+ Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) = "+ Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) = "+ Files.isExecutable(filePath));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        Path filePath2 = Path.of("C:\\JAVA\\Projects\\" +
                                 "java_course_black-belt\\test15.txt");


        System.out.println("Files.isSameFile(filePath, filePath2) = "+ Files.isSameFile(filePath, filePath2));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Files.size(filePath)) = "+ Files.size(filePath));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Files.getAttribute(filePath, \"creationTime\") = "+
                           Files.getAttribute(filePath, "creationTime"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Files.getAttribute(filePath, \"size\") = "+
                           Files.getAttribute(filePath, "size"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");

        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
