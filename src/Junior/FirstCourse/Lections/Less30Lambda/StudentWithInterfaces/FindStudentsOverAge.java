package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

public class FindStudentsOverAge implements StudentChecks {
    @Override
    public boolean testStudent(Student3 s) {
        return s.getAge() > 25;
    }
}
