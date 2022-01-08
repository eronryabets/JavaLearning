package Junior.FirstCourse.Lections.Les15WhileLoop;

public class DoWhile {
    public static void main(String[] args) {
        int chas = 0;

        OUTER:
        do {
            int minuta = 0;

            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;
        }
        while (chas < 24);
    }
}
