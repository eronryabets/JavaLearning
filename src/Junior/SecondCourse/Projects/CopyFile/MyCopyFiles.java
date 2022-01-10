package Junior.SecondCourse.Projects.CopyFile;

/*
Копирование папки "А" в другую директорию с переименованием в "В" и заменой существующих файлов.
 В директории уже будет папка "В" - все файлы с папки "А" будут вставлены в папку "В" с заменой файлов.
Осуществил так : папка "В" переименовывается в "B_TMP_CopyFolders",
затем папка А перекидывается ( переименовывается в В).
 С папки "B_TMP_CopyFolders" копируются в новую папку "В" файлы которых там нет, если файлы с таким названиям есть
 - они игнорируются и не перекидываются.
По завершению работы программы - папка "B_TMP_CopyFolders" удалится.
*/


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyCopyFiles {
    public static void main(String[] args) throws IOException {
        Path myA = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path myB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        myCopyRun(myA, myB);
    }

    public static void myCopyRun(Path source, Path destination) throws IOException {
        if (!Files.exists(destination)) {
            Files.walkFileTree(source, new CopyFile(source, destination));
        } else {
            StringBuilder sb2 = new StringBuilder(destination.toString());
            sb2.append("_TMP_CopyFolders");
            Path tmp = Paths.get(String.valueOf(sb2));
            Files.walkFileTree(destination, new RenameFolder(destination, tmp));
            Files.walkFileTree(source, new CopyFile(source, destination));
            Files.walkFileTree(tmp, new MoveFile(tmp, destination));
            Files.walkFileTree(tmp, new DeleteFile());
        }

        System.out.println("Done");

    }

}

class RenameFolder extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public RenameFolder(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.move(dir, newDestination);
        return FileVisitResult.SKIP_SIBLINGS;
    }
}


class CopyFile extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public CopyFile(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }

}

class MoveFile extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MoveFile(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        if (!(dir == source)) {
            Files.move(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        if (!Files.exists(newDestination)) {
            Files.move(file, newDestination);
        }
        return FileVisitResult.CONTINUE;
    }
}

class DeleteFile extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
