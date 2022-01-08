package Junior.SecondCourse.N8_IO_NIO.N8_RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        String filePath = "E:\\Logs\\IO\\test10.txt";
        try(RandomAccessFile file =
                    new RandomAccessFile(filePath,"rw")){
            int a = file.read();
            System.out.println((char)a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);
            file.seek(file.length());
            file.writeBytes("\n\tWilliam Butler Yeats");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
