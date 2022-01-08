package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

public class FindStudentsUnderGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student3 s) {
        return s.getAvgGrade() < 9;
    }
}
