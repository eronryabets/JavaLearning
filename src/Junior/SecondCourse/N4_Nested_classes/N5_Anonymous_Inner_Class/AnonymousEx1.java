package Junior.SecondCourse.N4_Nested_classes.N5_Anonymous_Inner_Class;

public class AnonymousEx1 {
    private int x = 5;
    public static void main(String[] args) {
        Math m = new Math(){
            int c = 10;
            void abc(){}
            @Override
            public int doOperation(int a, int b){
                AnonymousEx1 an1 = new AnonymousEx1();
                return a+b+an1.x;
            }
        };

        Math m2 = new Math(){
            @Override
            public int doOperation(int a, int b){
                return a*b;
            }
        };

        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6));
    }
}

class Math{
    int doOperation(int a, int b){
        return a/b;
    }
}