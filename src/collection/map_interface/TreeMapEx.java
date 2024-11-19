package collection.map_interface;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>(/*(s1, s2) -> s1.surname.compareTo(s2.surname)*/);

        Student st1 = new Student("Zaur", "tregulov", 3);
        Student st2 = new Student("Dima", "Bolnik", 4);
        Student st3 = new Student("Sergey", "petrov", 2);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasua", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Pupkina", 1);
        Student st8 = new Student("Elena", "Pupkina", 1);

        treeMap.put(5.8, st1);
        treeMap.put(6.3, st5);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st4);
        treeMap.put(7.5, st3);
        treeMap.put(7.9, st7);
        treeMap.put(8.4, st6);

//        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.3));
//        System.out.println(treeMap.remove(5.8));

//        System.out.println(treeMap.descendingMap());

//        SortedMap<Double, Student> doubleStudentSortedMap = treeMap.headMap(7.3);        System.out.println(doubleStudentSortedMap);

//        System.out.println(treeMap.firstEntry());

    }
}
