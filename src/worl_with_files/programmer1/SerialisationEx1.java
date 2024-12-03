package worl_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Ivan");
        employees.add("Zayr");
        employees.add("Elena");

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))) {
            oos.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
