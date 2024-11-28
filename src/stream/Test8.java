package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 18, 1, 7.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 6.3);
        Student st5 = new Student("Mariya", 'm', 21, 3, 9.1);

        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        int[] courses = students.stream()
                .mapToInt(Student::getCourse)
                .toArray();

        System.out.println(Arrays.toString(courses));


//        Student student = students.stream()
//                .max((el1, el2) -> el1.getAge() - el2.getAge()).get();

//        students.stream().filter(e -> e.getAge() > 20)
//                .limit(2).forEach(System.out::println);
//
//        System.out.println("==============================");
//
//        students.stream().filter(e -> e.getAge() > 20)
//                .skip(2).forEach(System.out::println);


    }
}
