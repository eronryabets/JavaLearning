package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try{
            File f = new File("E://Programming//Files//Test2.txt");
            System.out.println("Обьект файл создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Стрим создался");
            int counter = 0;
            while(true){
                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");
                if(counter == 3){
                    fis.close();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Exception 1 : " + e);
        } catch (IOException e) {
            System.out.println("Exception 2 : " + e);
        }
        finally {
            System.out.println("Блок Finally");
        }
    }
}
