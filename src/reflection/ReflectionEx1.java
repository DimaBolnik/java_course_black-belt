package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;

public class ReflectionEx1 {
    public static void main(String[] args) throws ClassNotFoundException
            , NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee");
//        Class employee2 = Employee.class;
//        Employee employee = new Employee();
//        Class employee3 = employee.getClass();
//        Field id = employeeClass.getField("id");

        Field[] fields = employeeClass.getFields();
        Iterator<Field> iterator = Arrays.stream(fields).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
//        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("==============================");

        Field[] declaredFields = employeeClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + " " + declaredField.getType());
        }
        System.out.println("==============================");
//
//        Method increaseSalary = employeeClass.getMethod("setSalary", double.class);
//        System.out.println(increaseSalary.getReturnType()
//                           + " " + Arrays.toString(increaseSalary.getParameterTypes()));
//        System.out.println("==============================");
//
//        Method[] declaredMethods = employeeClass.getDeclaredMethods();
//        for (Method method : declaredMethods) {
//            System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
//        }
//        System.out.println("==============================");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPrivate(method.getModifiers())) {
                System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));            }
        }
        System.out.println("==============================");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor1: " + constructor1.getParameterCount()
        + " " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("==============================");


        Constructor constructor2 = employeeClass.getConstructor(
                int.class, String.class, String.class);
        System.out.println("Constructor2: " + constructor2.getParameterCount()
                           + " " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("==============================");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName() +
                               " " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
