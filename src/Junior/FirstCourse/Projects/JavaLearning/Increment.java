package Junior.FirstCourse.Projects.JavaLearning;

public class Increment {
    public static void main(String[] args) {
        int a = 8;
        int b = a++; //сначала b = a("8") и затем уже а=а+1("9")
        System.out.println("a = " + a);  // 9
        System.out.println("b = " + b);  // 8

        int x = 8;
        int y = ++x; // сначала x=x("8")+1 = ("9") и затем уже y=x+1("9")
        System.out.println("x = " + x);  // 9
        System.out.println("y = " + y);  // 9

        int a2 = 8;
        int b2 = 7;
        int c2 = a2 + 5 * ++b2;
        System.out.println(c2);  // 48

    }
}
