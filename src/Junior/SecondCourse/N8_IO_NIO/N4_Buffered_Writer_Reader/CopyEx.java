package Junior.SecondCourse.N8_IO_NIO.N4_Buffered_Writer_Reader;

import java.io.*;

public class CopyEx {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(
                new FileReader("E:\\Logs\\IO\\test2.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("E:\\Logs\\IO\\test3.txt"));
        ) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            //будем считывать сразу строку
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
