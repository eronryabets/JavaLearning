package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.Metanit;

import java.io.*;
import java.util.ArrayList;

public class ListObjRead {
    public static void main(String[] args) {
        String filename = "E:\\Logs\\IO\\ListPerson1.dat";
        ArrayList<Person> people = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            people = ((ArrayList<Person>)ois.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //people.forEach(System.out::println);
        people.stream().filter(p-> !p.isMarried()).forEach(System.out::println);

    }
}
