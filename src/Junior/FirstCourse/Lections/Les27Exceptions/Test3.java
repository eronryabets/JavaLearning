package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File f = new File("E://Programming//Files//Test1.txt");
        FileInputStream fis = new FileInputStream(f);
//        System.out.println("File found");
        fis.read();
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);
    }
}
