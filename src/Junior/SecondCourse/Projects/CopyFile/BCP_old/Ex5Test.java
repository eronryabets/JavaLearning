package Junior.SecondCourse.Projects.CopyFile.BCP_old;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex5Test {
    public static void main(String[] args) {
        Path source = Paths.get("E:\\Logs\\IO\\CopyTEST\\B2");
        Path destination = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Path fileB2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B2\\testAB.txt");
        //Path fileB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B\\testAB.txt");
        System.out.println("source = " + source);
        System.out.println("destination = " + destination);
        System.out.println("file = " + fileB2);
        System.out.println("fileName = " + fileB2.getFileName());
        //destination + fileName
        Path destinationCheck = Paths.get(destination.toString() + "\\" +fileB2.getFileName());
        System.out.println(Files.exists(destinationCheck));


        //System.out.println(destination.resolve(fileB2));






        //System.out.println(destination.resolve(fileB));
        //System.out.println();
        //System.out.println(fileA.toAbsolutePath());
        //System.out.println(source.relativize(fileA));
//        if(source.resolve(fileB2) == ){
//            System.out.println("+");
//        }
//        else {
//            System.out.println("-");
//        }

    }
}
/*
if(fileA.getFileName().toString().equals(fileB.getFileName().toString())){
            System.out.println("Названия файлов одинковые");
        }
        else {
            System.out.println("Названия файлов разные");
        }
 */
