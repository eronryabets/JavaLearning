package Junior.SecondCourse.N8_IO_NIO.N16_walkFileTree_delete_directory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Logs\\IO\\CopyHere");
        Files.walkFileTree(path,new MyFileVisitor3());
        System.out.println("Done");

    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("Delete name: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        System.out.println("Delete Directory: " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
