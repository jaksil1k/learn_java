package collection;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student3> treeMap = new TreeMap<>();
        Student3 st1 = new Student3("A", "B", 3);
        Student3 st2 = new Student3("C", "D", 1);
        Student3 st3 = new Student3("E", "F", 2);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(6.3));
        System.out.println(treeMap.headMap(7.0));

    }

}

class Student3 {
    String name;
    String surname;
    int course;

    public Student3(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course && Objects.equals(name, student3.name) && Objects.equals(surname, student3.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}