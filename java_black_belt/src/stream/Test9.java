package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test9 {
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


        List<Integer> collect = students.stream().mapToInt(value -> value.course).boxed().collect(Collectors.toList());
        System.out.println(collect);

        int sum = students.stream().mapToInt(value -> value.course).sum();
        System.out.println(sum);

        double avg = students.stream().mapToInt(value -> value.course).average().getAsDouble();
        System.out.println(avg);

//        Student student1 = students.stream().min(Comparator.comparing(student -> student.age)).get();
//        System.out.println(student1);
//
//
//        Student student2 = students.stream().max(Comparator.comparing(student -> student.age)).get();
//        System.out.println(student2);
//
//        System.out.println("---------------------");
//
//        students.stream().filter(student -> student.age > 20).limit(2).forEach(System.out::println);
//
//        System.out.println("---------------------");
//
//        students.stream().filter(student -> student.age > 20).skip(2).forEach(System.out::println);
    }
}
