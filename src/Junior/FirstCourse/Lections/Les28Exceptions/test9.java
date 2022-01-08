package Junior.FirstCourse.Lections.Les28Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test9 {
    void abc() throws FileNotFoundException{
        try {
            File f = new File("E://Logs//test2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("Eto block finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e){
            System.out.println("Exception poiman i polnostiy obrabotan");
        }
    }

}
