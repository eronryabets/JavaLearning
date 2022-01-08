package Junior.SecondCourse.N8_IO_NIO.N2_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\Logs\\IO\\test1.txt");
            int character;
            //читаем до тех пор, пока read не вернет int -1
            //это будет означать, что файл закончен
            while((character = reader.read()) !=-1){
                System.out.print((char) character);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }

    }
}
