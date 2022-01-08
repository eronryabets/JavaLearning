package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
    public static void main(String[] args) {
        File f = new File("E://Programming//Files//Test1.txt");

        try{
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Всем хорошего дня");
        }
        catch ( FileNotFoundException e){
            System.out.println("Было пойманно исключение - " + e);
        }
        catch ( NullPointerException e){
            System.out.println("Было пойманно исключение - " + e);
        }
        catch ( ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Было пойманно исключение - " + e);
        }
        finally {
            System.out.println("Это блок finally");
        }
        System.out.println("Данный код уже не имеет отношение к исключениям");

    }
}
