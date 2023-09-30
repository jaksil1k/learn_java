package generics.game;

public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Ivan", 13);
        Pupil pupil2 = new Pupil("Mariya", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Pupil> pupilTeam1 = new Team<>("Dragons");
        Team<Pupil> pupilTeam2 = new Team<>("Wisers");
        Team<Student> studentTeam1 = new Team<>("Forward");
        Team<Employee> employeeTeam1 = new Team<>("HardWorkers");

        pupilTeam1.addNewParticipant(pupil1);
        pupilTeam1.addNewParticipant(pupil2);
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);

        pupilTeam1.playWith(pupilTeam2);



    }
}
