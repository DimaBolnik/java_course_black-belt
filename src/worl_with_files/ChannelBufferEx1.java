package worl_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw");
            FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int read = channel.read(buffer);
            while (read > 0) {
                System.out.println("Read " + read);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                read = channel.read(buffer);
            }
            System.out.println(stix);

            String text = "\nПродаю отличный системный блок," +
                          " все игры на ультра настройках." +
                          " \nУстановлены программы OCCT, PerformanceTest" +
                          " и FurMark для проверки при покупке," +
                          " \nа также игры Days Gone и Cyberpunk 2077," +
                          " которые идут на максимальной графике.";

//            ByteBuffer writeBuffer = ByteBuffer.allocate(text.getBytes().length);
//            writeBuffer.put(text.getBytes(StandardCharsets.UTF_8));
//            writeBuffer.flip();
//            channel.write(writeBuffer);

            ByteBuffer writeBuffer = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));
            channel.write(writeBuffer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
