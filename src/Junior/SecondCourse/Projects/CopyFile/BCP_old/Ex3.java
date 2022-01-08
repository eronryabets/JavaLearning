package Junior.SecondCourse.Projects.CopyFile.BCP_old;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Path file1 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B\\testB.txt");
        Path file2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B2\\testB.txt");
        System.out.println(Files.exists(dir));
        System.out.println(Files.exists(file1));
        //скопировать testB.txt из В2 в В с заменой
        if(!Files.exists(file1)){
            Files.copy(file2,dir.resolve("testB.txt"));
        }
        else {
            Files.delete(file2);
        }

    }
}
