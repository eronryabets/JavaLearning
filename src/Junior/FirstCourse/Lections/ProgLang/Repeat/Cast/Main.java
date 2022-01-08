package Junior.FirstCourse.Lections.ProgLang.Repeat.Cast;

public class Main {
    public static void main(String args[]) {
        int a = 10, b = 20;
        Calculator cal = new My_Calculator();
        cal.addition(a, b);
        cal.subtraction(a, b);
        ((My_Calculator) cal).multiplication(a,b); //только при помощи каста можем обратится к этому методу
    }
}
