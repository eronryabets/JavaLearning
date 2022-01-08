package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.File;
import java.io.*;

public class Test6 {
    void abc() { //or throws FileNotFoundException
        File f = new File("E://Programming//Files//Test1.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Good day!");
        }
        catch (FileNotFoundException e){
            System.out.println("Catch Exception : " + e);
        }
    }

    void def(){
        System.out.println();
    }

    void uncheckedException(){
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}

