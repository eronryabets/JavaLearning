package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.File;
import java.io.*;

public class Test7 {
    void abc() throws FileNotFoundException {
        File f = new File("E://Programming//Files//Test1.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    void def() throws FileNotFoundException{
        System.out.println();
    }

    void uncheckedException(){
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        try{
            t.def();
        }
        catch (FileNotFoundException e){
            System.out.println("Exception - " + e);
            System.out.println(e.getMessage());
        }


    }
}

