package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("reflection.Employee");

//        Employee o =(Employee) employeeClass.newInstance();
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee employee1 = constructor1.newInstance();

//        Constructor<Employee> constructor12 = employeeClass.getConstructor(
//                int.class, String.class, String.class);
//        Employee employee2 = constructor12.newInstance(12, "Dima", "IT");
//        System.out.println(employee2);

        Constructor<Employee> constructor12 = employeeClass.getConstructor(
                int.class, String.class, String.class);
        Employee employee2 = constructor12.newInstance(12, "Dima", "IT");
        System.out.println(employee2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(employee2,15000.0);
        System.out.println(employee2);
    }
}
