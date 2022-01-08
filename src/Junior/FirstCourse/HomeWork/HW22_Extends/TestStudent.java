package Junior.FirstCourse.HomeWork.HW22_Extends;
import static Junior.FirstCourse.HomeWork.HW22_Extends.Student.*;

public class TestStudent {
    public static void main(String[] args) {
        Student max = new Student("Maxim",3,5);
        showInfo(max);
        Student dim = new Student();
        dim.setName("Dima");
        dim.setCourse(2);
        dim.setGrade(9);
        showInfo(dim);
        Student lex = new Student("Mix",99,99);
        Student xen = new Student();
        xen.setName("Xen");
        xen.setCourse(99);
        xen.setGrade(99);
        showInfo(lex);
        showInfo(xen);

    }
}
