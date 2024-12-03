package worl_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {

            int i = file.read();
            System.out.println((char) i);

            String str = file.readLine();
            System.out.println(str);

            file.seek(22);
            str = file.readLine();
            System.out.println(str);
            System.out.println(file.getFilePointer());

            file.seek(file.length() -1);
            file.writeBytes("\n\t\t Dima Bolnik");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
