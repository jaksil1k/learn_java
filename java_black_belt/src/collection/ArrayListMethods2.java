package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));
        System.out.println(studentList);

        //st5 == st6
        Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
        boolean remove = studentList.remove(st6);
        if (remove) {
            System.out.printf("Successfully deleted student %s", st6);
        } else {
            //if we hadn't implemented equals and hashcode it will not find st6, because default equals checks their address in memory
            System.out.printf("can not find %s", st6);
        }
        studentList.clear();
    }
}

class Student {
    private String name;
    private char gender;
    private int age;
    private int course;
    private double averageGrade;

    public Student(String name, char gender, int age, int course, double averageGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gender == student.gender && age == student.age && course == student.course && Double.compare(averageGrade, student.averageGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, course, averageGrade);
    }
}