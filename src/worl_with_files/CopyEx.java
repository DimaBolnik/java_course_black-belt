package worl_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("text2.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("text3.txt"))) {
//            int character;
//            while((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done!");
    }
}
