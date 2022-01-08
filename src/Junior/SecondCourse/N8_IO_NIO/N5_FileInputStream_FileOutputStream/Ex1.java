package Junior.SecondCourse.N8_IO_NIO.N5_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try(FileInputStream inputStream =
                new FileInputStream("E:\\Logs\\IO\\image1.png");
            FileOutputStream outputStream =
                    new FileOutputStream("E:\\Logs\\IO\\image2.png");
        ) {
            int i ;
            while((i = inputStream.read())!= -1){
               outputStream.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
