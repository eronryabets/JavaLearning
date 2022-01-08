package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

public class FindStudentsMixCondition implements StudentChecks{
    @Override
    public boolean testStudent(Student3 s) {
        return (s.getAvgGrade() > 7.2 && s.getAge() < 23 && s.getSex() == 'f');
    }
}
