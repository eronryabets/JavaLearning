package Junior.SecondCourse.N8_IO_NIO.N13_Path_interface_and_class_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Hello!\n-Hello)\n-Howe are you?" +
//                "\n- Thanks, I am fine, and you?\n-I am fine too!";
//        Files.write(filePath,dialog.getBytes());
        List<String> list = Files.readAllLines(filePath);
        list.forEach(System.out::println);


    }
}
