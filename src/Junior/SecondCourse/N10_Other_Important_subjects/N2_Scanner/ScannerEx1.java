package Junior.SecondCourse.N10_Other_Important_subjects.N2_Scanner;

//я все таки пользуюсь BufferedWriter и BufferedReader, так как он буферизирует и меньше обращений.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число :");
        //int i = scanner.nextInt();
        //String s = scanner.nextLine();
        //System.out.println( s);
//        System.out.println("Напишите два числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x / y);
//        System.out.println("Остаток = " + x % y);
//        System.out.println("Напишите пару строк");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("1ая строка: " + s1 + "\n2ая строка : " + s2);
//        System.out.println("Напишите строку");
//        String s1 = scanner.next();
//        System.out.println("Вы написали: " + s1);
//        System.out.println("Введите дробное число");
//        double d = scanner.nextDouble();
//        System.out.println("Вы написали: " + d);
        Scanner scanner = new Scanner("Hello!\nGood day!");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }



    }
}
