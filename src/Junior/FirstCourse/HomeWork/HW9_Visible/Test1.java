package Junior.FirstCourse.HomeWork.HW9_Visible;

public class Test1 {
    int a = 1;
    static int b=2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test1.b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(4);
    }

}

//2 4 1 2
