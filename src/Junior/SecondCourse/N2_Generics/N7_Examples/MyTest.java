package Junior.SecondCourse.N2_Generics.N7_Examples;

public class MyTest {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan",13);
        Scholar scholar2 = new Scholar("Maria",15);
        Scholar scholar3 = new Scholar("Iva",15);
        Scholar scholar4 = new Scholar("Mar",14);

        Student student1 = new Student("Nik",20);
        Student student2 = new Student("Zena",18);

        Employee employee1 = new Employee("Zak",32);
        Employee employee2 = new Employee("Mike",47);

        Team<Scholar> scholarTeam = new Team<>("Dragons");
        scholarTeam.addNewParticipants(scholar1);
        scholarTeam.addNewParticipants(scholar2);

        Team<Student> studentTeam = new Team<>("Fenix");
        studentTeam.addNewParticipants(student1);
        studentTeam.addNewParticipants(student2);

        Team<Employee> employeeTeam = new Team<>("Traktorniy polk");
        employeeTeam.addNewParticipants(employee1);
        employeeTeam.addNewParticipants(employee2);

        Team<Scholar> scholarTeam2 = new Team<>("Dovakin");
        scholarTeam.addNewParticipants(scholar3);
        scholarTeam.addNewParticipants(scholar4);

        //scholarTeam.playWith(studentTeam);
        scholarTeam.playWith(scholarTeam2);


       // Team<String> Employee2Team = new Team<>("asd");



    }
}
