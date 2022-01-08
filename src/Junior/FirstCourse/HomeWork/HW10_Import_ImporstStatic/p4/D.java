package Junior.FirstCourse.HomeWork.HW10_Import_ImporstStatic.p4;

import Junior.FirstCourse.HomeWork.HW10_Import_ImporstStatic.p1.A;
import Junior.FirstCourse.HomeWork.HW10_Import_ImporstStatic.p1.p2.p3.C;
import Junior.FirstCourse.HomeWork.HW10_Import_ImporstStatic.p4.p5.*;
import Junior.FirstCourse.HomeWork.HW10_Import_ImporstStatic.p1.p2.B;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.ax);
        C c = new C();
        System.out.println(c.cx);
        E e = new E();
        System.out.println(e.ex);

        B b = new B();
        System.out.println(b.count + b.x + b.y);
    }

}
