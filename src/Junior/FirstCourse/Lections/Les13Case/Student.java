package Junior.FirstCourse.Lections.Les13Case;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    static void studentGoodOrBad(Student student){
        switch (student.grade){
            case 1 :
                System.out.println("Студент плохой, 1чник");
                break;
            case 2 :
                System.out.println("Студент плохой, 2чник");
                break;
            case 3 :
                System.out.println("Студент средний, 2шник");
                break;
            case 4 :
                System.out.println("Студент хороший, 4шник");
                break;
            case 5 :
                System.out.println("Студент отличник, 5чник");
                break;

            default:
                System.out.println("Не верный формат оценки");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

}
