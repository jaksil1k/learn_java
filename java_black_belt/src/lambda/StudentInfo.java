package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo {
    void testStudent(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}
class Test {
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

        StudentInfo info = new StudentInfo();

        Collections.sort(students, (s1, s2) -> s1.course - s2.course);

        info.testStudent(students, s -> s.avgGrade < 30);
        System.out.println("__________________________");


    }
}

interface StudentChecks {
    boolean check(Student s);
}

