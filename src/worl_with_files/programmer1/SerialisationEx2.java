package worl_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "Black Belt");
        Employee employee = new Employee("Maria", "It", 25, 500, car);


        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))) {
            oos.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
