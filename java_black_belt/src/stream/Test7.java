package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm' , 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm' , 28, 2, 6.4);
        Student st3 = new Student("Elana", 'f' , 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm' , 35, 4, 7);
        Student st5 = new Student("Mariya", 'f' , 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");

        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);
        f2.addStudent(st4);
        f2.addStudent(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudents().stream())
                .forEach(student -> System.out.println(student.name));

    }
}

class Faculty {
    String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student st) {
        students.add(st);
    }

    public List<Student> getStudents() {
        return students;
    }
}
