package worl_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2L;

    String name;
    String department;
    int age;
    int salary;
    Car car;

    public Employee(String name, String department, int age, int salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", age=" + age +
               ", salary=" + salary +
               ", car=" + car +
               '}';
    }
}
