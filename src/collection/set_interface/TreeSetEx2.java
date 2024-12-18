package collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);


        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);

        System.out.println(set);


        Student st6 = new Student("Oleg", 2);
        Student st7 = new Student("Ivan", 4);
        System.out.println(set.subSet(st6, st7));

        System.out.println(st3.equals(st6));

    }
}


class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    String name;
    int course;
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", course=" + course +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
