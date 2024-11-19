package generics.igra;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 14);

        Student student1 = new Student("Nikolay", 18);
        Student student2 = new Student("Ksenia", 19);

        Employee employee1 = new Employee("Zaur", 33);
        Employee employee2 = new Employee("Dima", 36);

        Team<Schoolar> schoolarTeam = new Team("Scola");
        Team<Student> studentTeam = new Team("Vpered");
        Team<Employee> employeeTeam = new Team("Rabotyagi");
        schoolarTeam.addParticipant(schoolar1);
        schoolarTeam.addParticipant(schoolar2);
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

//        schoolarTeam.playWith(studentTeam);


    }
}
