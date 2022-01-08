package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.Metanit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProgramRead {
    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("E:\\Logs\\IO\\Person1.dat")))
        {
            Person p=(Person)ois.readObject();
            System.out.println(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}