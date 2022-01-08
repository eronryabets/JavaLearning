package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

public class FindStudentsUnderAge implements StudentChecks {
    @Override
    public boolean testStudent(Student3 s) {
        return s.getAge() < 25;
    }
}
