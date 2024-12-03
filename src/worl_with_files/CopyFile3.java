package worl_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFile3 {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("C:\\Users\\User\\Desktop\\X");
        Path destination = Path.of("C:\\Users\\User\\Desktop\\Copy_Here");

        MyFileVisitor2 fileVisitor2 = new MyFileVisitor2(source, destination);
        Files.walkFileTree(source, fileVisitor2);
        System.out.println("Done!!");

    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newFile = destination.resolve(source.relativize(file));
        Files.copy(file, newFile, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}