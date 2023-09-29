package comparable_comparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);

        //have to implement comparable to sort
        Arrays.sort(new Employee[]{emp1, emp2, emp3});

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting\n" + list);
        Collections.sort(list);
        System.out.println("After sorting\n" + list);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
//        return Integer.compare(this.id, emp.id);
//        return this.id - emp.id;
        return this.name.compareTo(emp.name);
    }
}