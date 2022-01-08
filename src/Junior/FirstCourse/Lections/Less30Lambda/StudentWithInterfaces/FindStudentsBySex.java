package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

public class FindStudentsBySex implements StudentChecks {
    @Override
    public boolean testStudent(Student3 s) {
        return s.getSex() == 'm';
    }
}
