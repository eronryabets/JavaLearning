package Junior.SecondCourse.N8_IO_NIO.N3_TryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("E:\\Logs\\IO\\test1.txt");
            FileWriter writer = new FileWriter("E:\\Logs\\IO\\test1.txt",true)) {
            int character;
            while((character = reader.read()) !=-1){
                System.out.print((char) character);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}