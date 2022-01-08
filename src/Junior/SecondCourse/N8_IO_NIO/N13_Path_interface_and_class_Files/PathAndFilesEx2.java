package Junior.SecondCourse.N8_IO_NIO.N13_Path_interface_and_class_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("E:\\Logs\\IO\\M");
        Path directoryBPath = Paths.get("E:\\Logs\\IO\\B");

//        Files.copy(filePath,directoryPath.resolve(filePath)
//                , StandardCopyOption.REPLACE_EXISTING);
//        //Files.copy(filePath,directoryPath.resolve("test11.txt"));
//        Files.copy(directoryBPath,directoryPath.resolve("B"));
//        System.out.println("Done");

//        Files.move(filePath,directoryPath.resolve("test15"));
//        Files.move(Paths.get("test10.txt"),(Paths.get("test11.txt")));
        //System.out.println(Paths.get(String.valueOf(directoryPath)));
//       Files.delete(Paths.get("E:\\Logs\\IO\\M\\test16.txt"));
        Path filePath2 = Paths.get("E:\\Logs\\IO\\M\\test16.txt");
        Files.delete(filePath2);



    }
}
