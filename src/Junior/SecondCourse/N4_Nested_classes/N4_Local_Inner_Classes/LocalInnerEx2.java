package Junior.SecondCourse.N4_Nested_classes.N4_Local_Inner_Classes;

public class LocalInnerEx2 {
    public static void main(String[] args) {
        class Slojenie implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slojenie sl1 = new Slojenie();
        System.out.println(sl1.doOperation(5,3));
    }

}

interface Math2{
    int doOperation(int a, int b);
}
