package Junior.FirstCourse.Lections.ProgLang.Repeat.InnerClasses21;

public class Outer_Demo {
    private int num = 2021;
    public static int month = 10;

    public class Inner_Demo{
        public int getNum(){
            System.out.println("Thi is Inner Method and his method getNum");
            return num;
        }
    }
}
