package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    void testStudent(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
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


//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//        Collections.sort(students, (s1, s2) -> s1.course - s2.course);


//        info.testStudent(students, p1.and(p2));
//        info.testStudent(students, s -> s.avgGrade < 30);
//        System.out.println("__________________________");

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSmth(students, f);
        System.out.println(res);

    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }

        return result / list.size();
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

