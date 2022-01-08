package Junior.FirstCourse.HomeWork.HW15_WhileDoWhile;

public class Clock {

    static public void testTime() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                int sekunda = 0;
                INNER:
                while (sekunda < 60) {
                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }

            }
            while (minuta < 59);
            chas++;
        }

    }

    public static void main(String[] args) {
        testTime();

    }
}
