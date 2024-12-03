package worl_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("my_test.bin"))) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeLong(10000);
            outputStream.writeDouble(5.234);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readDouble());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}