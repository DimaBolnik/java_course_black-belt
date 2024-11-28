package stream;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 18, 1, 7.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 6.3);
        Student st5 = new Student("Mariya", 'm', 20, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);

        f2.addStudent(st4);
        f2.addStudent(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudents().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}


class Faculty{
    String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
