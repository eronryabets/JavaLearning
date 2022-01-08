package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.Metanit;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProgramWrite {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:\\Logs\\IO\\Person1.dat")))
        {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
            System.out.println("Done");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
