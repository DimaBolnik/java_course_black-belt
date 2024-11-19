package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 18, 1, 7.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 6.3);
        Student st5 = new Student("Mariya", 'm', 20, 3, 9.1);

        ArrayList<Student> studentLinkedList = new ArrayList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);

        Student st6 = new Student("Zaur", 'm', 34, 5, 6.3);
        Student st7 = new Student("Dima", 'm', 36, 5, 9.1);
        studentLinkedList.add(st6);
        studentLinkedList.add(st7);
        System.out.println(studentLinkedList);
        Collections.sort(studentLinkedList, (s1, s2)-> s1.getAge() - s2.getAge());
        System.out.println(studentLinkedList);

        int age = Collections.binarySearch(studentLinkedList, st7);
        System.out.println(age);
    }
}


class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", sex=" + sex +
               ", age=" + age +
               ", course=" + course +
               ", avgGrade=" + avgGrade +
               '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return sex == student.sex && age == student.age &&
//               course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 &&
//               Objects.equals(name, student.name);
//    }
//

}
