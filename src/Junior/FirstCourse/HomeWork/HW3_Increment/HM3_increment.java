package Junior.FirstCourse.HomeWork.HW3_Increment;

public class HM3_increment {
    public static void main(String[] args) {
        int i1=5;
        int i2=11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result=0;
        result = i2 / d1 + d2 % i1 - l;
        // 0 = (11 / 5.5) + (1.3 % 5) - 20
        // 0 = 2.0 + 1.3 - 20 = 3.3 - 20 = -16.7
        //System.out.println(result);
        //Task 2

        // если Х-- то в условии Х будет равен сколько и его значение в переменной, но затем в переменной будет минус 1
        // если --Х то сразу в условии от значения переменной -1 и само значение этой переменной сразу -1 становится
        //  X-- (х==х; X=x-1)       | int x = 10; int y = x--; // y = 10; x = 9;
        //  --X (X=x-1; x=x-1)      | int x = 10; int y = --x; // y = 9; x = 9;
        //  X++ (x==x; X=x+1)       | int x = 10; int y = x++; // y = 10; x = 11;
        //  ++X (X=x+1; x=x+1)      | int x = 10; int y = ++x; // y = 11; x = 11;

        int a = 5; //4;3;4;5
        int x = a-- - --a + ++a + a++ + a; //5 - 3 + 4 + 4 + 5 == 15
        int b = 8; //9;10;11;10
        int y = ++b - b++ + ++b - --b; // 9 - 9 + 11 - 10 == 1
        //System.out.println(y);

        int x1 = 10;
        int y1 = x1--; // y = 10; x = 9;
        System.out.printf("y=%d; x=%d \n", y1,x1);

        int x2 = 10;
        int y2 = --x2; // y = 9; x = 9;
        System.out.printf("y=%d; x=%d \n", y2,x2);

        int x3 = 10;
        int y3 = x3++; // y = 10; x = 11;
        System.out.printf("y=%d; x=%d \n", y3,x3);

        int x4 = 10;
        int y4 = ++x4; // y = 11; x = 11;
        System.out.printf("y=%d; x=%d \n", y4,x4);


    }
}
