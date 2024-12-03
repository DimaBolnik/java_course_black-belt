package reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee emp = new Employee(10, "Dima", "IT");
        Class empClass = emp.getClass();
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue =(Double) field.get(emp);
        System.out.println(salaryValue);
        field.set(emp, 200000.0);
        System.out.println(emp);
    }
}
