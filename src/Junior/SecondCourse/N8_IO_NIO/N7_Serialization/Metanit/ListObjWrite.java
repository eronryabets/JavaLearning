package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.Metanit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListObjWrite {
    public static void main(String[] args) {
        String filename = "E:\\Logs\\IO\\ListPerson1.dat";
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("Boris",39,183,true);
        Person p2 = new Person("Margaret",35,171,true);
        Person p3 = new Person("Tolik",26,173,false);
        Person p4 = new Person("Sergio",32,180,false);
        Person p5 = new Person("Mara",22,167,false);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
