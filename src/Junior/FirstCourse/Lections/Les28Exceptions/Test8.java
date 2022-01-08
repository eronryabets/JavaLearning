package Junior.FirstCourse.Lections.Les28Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Test8 {
    static int test1() {
        try {
            File f = new File("E://Logs//test2.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            return 6;
        } finally {
            System.out.println("Eto block finally");
            //return 7; //если ретерн в файнали то он всегда и будет возвращаться в любом случае!
        }
    }

    static int test2() {
        int a = 5;
        try {
            File f = new File("E://Logs//test2.txt");
            FileInputStream fis = new FileInputStream(f);
            //return a;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            System.out.println("Peremennaia v Catch bloke = " + a);
            return a; //если файла нет, то в последний стейтмент передаст а = 5
        } finally {
            a = 10;
            System.out.println("Eto block finally");
            System.out.println("Peremenaya v  block finally = " + a);
            //return a; //если ретерн в файнали то он всегда и будет возвращаться в любом случае!
        }
        return a; //последний стейтмент
    }


    public static void main(String[] args) {
        System.out.println(test2());
    }

}
