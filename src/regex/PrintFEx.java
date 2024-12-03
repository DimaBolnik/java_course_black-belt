package regex;

public class PrintFEx {

    static void employeeInfo(Employee emp) {
        System.out.printf(
                "%03d \t %-12s \t %5s \t %,.2f \n", emp.id, emp.name, emp.surname, emp.salary*(1 + emp.bonus));
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Zaur", "Tregulov",12345, 0.15);
        Employee employee2 = new Employee(13, "Dima", "Bolnik",23678, 0.20);
        Employee employee3 = new Employee(124, "Ivan", "Petrov",11111, 0.10);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);


        String s = String.format("%03d \t %-12s \t %5s \t %,.2f \n",
                employee1.id, employee1.name, employee1.surname, employee1.salary*(1 + employee1.bonus));
        System.out.println(s);
    }
}


class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }
}