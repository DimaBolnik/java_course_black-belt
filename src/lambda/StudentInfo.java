package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> students, Predicate<Student> predicate) {

        for (Student s : students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if(s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsAnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if(s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al,int age, double grade, char sex) {
//        for (Student s : al) {
//            if(s.age < age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}


class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 33, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 24, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();

        double результ = getAverage(students, student -> (double) student.course);
        System.out.println(результ);




//        info.testStudents(students, s ->  s.avgGrade > 8);
////
//        System.out.println("==============================================");
//        info.testStudents(students, s -> s.age >= 30 && s.sex == 'm');
//
//        System.out.println("==============================================");
//        Predicate<Student> predicate = s -> s.age <= 30;
//        Predicate<Student> predicate2 = s ->s.sex == 'm';
//
//        info.testStudents(students, predicate.negate());



    }
    private static Double getAverage(ArrayList<Student> students, Function<Student, Double> f) {
        Double sum = 0.0;
        for (Student s : students) {
            sum += f.apply(s);
        }
        return sum / students.size();
    }
}
//
//interface StudentCheck {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentCheck {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
