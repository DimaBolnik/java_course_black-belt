package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 18, 1, 7.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 6.3);
        Student st5 = new Student("Mariya", 'm', 20, 3, 9.1);

        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> collect = students.stream().map(s -> {
//                    s.setName(s.getName().toUpperCase());
//                    return s;
//                })
//                .collect(Collectors.groupingBy(s -> s.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : collect.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        Map<Boolean, List<Student>> collect = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
