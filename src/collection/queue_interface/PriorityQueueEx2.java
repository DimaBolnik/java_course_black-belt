package collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);

        pq.add(st1);
        pq.add(st2);
        pq.add(st3);
        pq.add(st4);
        pq.add(st5);


        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
//        for (Student s : pq) {
//            System.out.println(pq.peek());
//        }


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
