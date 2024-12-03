package reflection;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        System.out.println("Сумма = " + (a + b));
    }

    void minus(int a, int b) {
        System.out.println(a - b);
    }

    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void divide(int a, int b) {
        System.out.println(a / b);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test100.txt"))) {
            String name = br.readLine();
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            Calculator calculator = new Calculator();

            Class c1 = calculator.getClass();
            Method method = null;

            Method[] declaredMethods = c1.getDeclaredMethods();
            for (Method m : declaredMethods) {
                if(m.getName().equals(name)) {
                    method = m;
                }
            }

            method.setAccessible(true);
            method.invoke(calculator,a, b);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}