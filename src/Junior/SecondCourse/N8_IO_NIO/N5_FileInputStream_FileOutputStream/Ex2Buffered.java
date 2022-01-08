package Junior.SecondCourse.N8_IO_NIO.N5_FileInputStream_FileOutputStream;

import java.io.*;

public class Ex2Buffered {
    public static void main(String[] args) {
        try(FileInputStream inputStream =
                    new FileInputStream("E:\\Logs\\IO\\image1.png");
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            FileOutputStream outputStream =
                    new FileOutputStream("E:\\Logs\\IO\\image3Buffered.png");
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        ) {
            int i ;
            while((i = bis.read())!=-1){
                bos.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
