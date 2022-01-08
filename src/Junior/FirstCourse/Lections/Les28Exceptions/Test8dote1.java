package Junior.FirstCourse.Lections.Les28Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8dote1 {
    static StringBuilder test1()  {
        StringBuilder a = new StringBuilder("hello");
        try{
            File f = new File("E://Logs//test2.txt");
            FileInputStream fis = new FileInputStream(f);
            //return a;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            System.out.println("Peremennaia v Catch bloke = " + a);
            return a; //если файла нет, то в последний стейтмент передаст а = 5
        }finally {
            a.append("!!!");
            System.out.println("Eto block finally");
            System.out.println("Peremenaya v  block finally = " + a);
            //return a; //если ретерн в файнали то он всегда и будет возвращаться в любом случае!
        }
        return a; //последний стейтмент - все равно вываод будет hello!!! так как это ссылочный обьект, и файнал добавит "!!!"
    }

    public static void main(String[] args) {
        System.out.println(test1());
    }
}
