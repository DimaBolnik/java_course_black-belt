package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new LinkedHashSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("C:\\Users\\User\\Desktop\\test1.txt")));
            scanner.useDelimiter(" ");
            while (scanner.hasNext()) {
                String str = scanner.next();
                set.add(str);
            }
            for (String str : set) {
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
