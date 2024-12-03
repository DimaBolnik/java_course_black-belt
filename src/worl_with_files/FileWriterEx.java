package worl_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Промокодов, ожидающих активации, пока нет.\n" +
                       "Подарочные промокоды на зачисление.\n" +
                       "Если Вы используете бонусы в заказе.\n" +
                       "Начисление бонусов за товар.";
        String s = "Privet";


        try(FileWriter writer = new FileWriter("text2.txt", true);
            FileReader reader = new FileReader("text2.txt")) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
//            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
