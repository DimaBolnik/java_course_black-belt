package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(100, "Zaur", "Tregulov", 12345));
        employees.add(new Employee(15, "Ivan", "Petrov", 5432));
        employees.add(new Employee(123, "Ivan", "Sidorov", 8543));

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println("=================");
        System.out.println(employees);
    }

}


class Employee implements Comparable<Employee> {

    int id;

    String name;
    String surName;
    int salary;

    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
        return this.id - o.id;
//        return this.surName.compareTo(o.surName);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", surName='" + surName + '\'' +
               ", salary=" + salary +
               '}';
    }

}


class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}
