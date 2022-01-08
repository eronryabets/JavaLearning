package Junior.SecondCourse.Projects.CopyFile.BCP_old;
/*
ex2 - работает в ручном режиме
ex3 - копирование с заменой
ex4 попробовать автоматически сделать для лубых папок
ТЗ - перемещаем в корень папку А ( переименовав ее в В) - с заменой файлов, если такие уже есть в В.
А зачем я вообще мучался с COPY если по логике мне нужно использовать MOVE !?)

Мне нужно 2а класса, копирование(перемещение, переименование) и удаление.
сначала мы копируем папку ( папки)  а потом копируем содержимое - и перемещаем в те папки.
КОПИРУЕМ!
[+]1)Переименовываем В в В2 - Files.move()
[+]1.1 - поместить папку myB в директорию В //будет работать с параметром SKIP_SIBLINGS
[+]2)Переименовываем А в В - Files.move()
[+]3)Перемещаем файлы с В2 в папку В ( переименованная с А) //moveFolder than moveFile
[+]3.1 файл testAB будет и в A и в B его не нужно перетаскивать и перезаписывать (!)
[+]4) если файлы такие уже есть в папке В, тогда мы их не трогаем, перемещаем только те - которых там нет
--
с А все копируеться.
тестим В. у В папки копируються, но есть проблемы с файлами в этих внутренних папках
Path destinationCheck = Paths.get(destination.toString() + "\\" + file.getFileName()); не корректная строка изза нее БАГ
 */
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyCopyFiles {
    public static void main(String[] args) throws IOException {
        Path myA = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path myB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        StringBuilder sb2 = new StringBuilder(myB.toString());
        sb2.append("_TMP_CopyFolders");
        Path myB2 = Paths.get(String.valueOf(sb2));
        //Переименовываем В в "B_TMP_CopyFolders"
        Files.walkFileTree(myB, new RenameFolder(myB,myB2));
        //Ниже аналог операции "Вырезать" -> "Вставить"
        //Files.walkFileTree(myA, new RenameFolder(myA,myB)); //Переименовываем А в В
        //Копируем нашу папку A в В
        Files.walkFileTree(myA, new CopyFile(myA,myB));
        //Перемещаем файлы с "B_TMP_CopyFolders" в папку В
        //нам нужно скипнуть перемещение самой B2 , но ПЕРЕМЕСТИТЬ myB
       Files.walkFileTree(myB2,new MoveFile(myB2,myB));
        //"B_TMP_CopyFolders"
        Files.walkFileTree(myB2, new DeleteFile());


    }
}

class CopyFile extends SimpleFileVisitor<Path>{
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
        Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING );
        System.out.println("-------class CopyFile [method preVisitDirectory] завершил работу--------");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file,newDestination);
        System.out.println("-------class CopyFile [method visitFile] завершил работу--------");
        return FileVisitResult.CONTINUE;
    }

}

//class my Delete Files
class DeleteFile extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("Delete name: " + file.getFileName());
        Files.delete(file);
        System.out.println("-------class DeleteFile [method visitFile] завершил работу--------");
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        System.out.println("Delete Directory: " + dir.getFileName());
        Files.delete(dir);
        System.out.println("-------class DeleteFile [method postVisitDirectory] завершил работу--------");
        return FileVisitResult.CONTINUE;
    }

}

//если такая папка есть, переименовать ее в В2_2
class RenameFolder extends SimpleFileVisitor<Path>{
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
        System.out.println(dir + "Переименована в  " + newDestination);
        Files.move(dir,newDestination);
        System.out.println("-------class RenameFolder [method postVisitDirectory] завершил работу--------");
        return FileVisitResult.SKIP_SIBLINGS; // в данной директории продолжать обход по файлам не нужно
    }
}

class MoveFile extends SimpleFileVisitor<Path> {
    Path source; //FROM ->
    Path destination; //-> TO

    public MoveFile(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        System.out.println("source - " + source);
        System.out.println("destination - " + destination);
        if(dir == source){
            System.out.println("скипнули " + dir);;
        } else {
            Files.move(dir,newDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("перекинули " + dir + " в " + newDestination);;
        }
        System.out.println("-------class MoveFile [ method preVisitDirectory ]завершил работу--------");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        //нужно проверить есть ли в destination файл с таким именем? есть - скип
        System.out.println("source = " + source);
        System.out.println("destination = " + destination);
        //нам нужно выяснить есть ли файл из source в destination
        if(Files.exists(newDestination)){
            System.out.println("скипнули " + file);;
        } else {
            System.out.println("Перекидываем " + file + " в " + " newDestination = " + newDestination );
            Files.move(file,newDestination);
        }
        System.out.println("-------class MoveFile [ method visitFile ]завершил работу--------");
        return FileVisitResult.CONTINUE;
    }
}
//        StringBuilder sb2 = new StringBuilder(myB.toString());
//        sb2.append("_TMP_CopyFolders");
//        Path myB2 = Paths.get(String.valueOf(sb2));
//        //Переименовываем В в "B_TMP_CopyFolders"
//        Files.walkFileTree(myB, new RenameFolder(myB, myB2));
//        //Ниже аналог операции "Вырезать" -> "Вставить"
//        //Files.walkFileTree(myA, new RenameFolder(myA,myB)); //Переименовываем А в В
//        //Копируем нашу папку A в В
//        Files.walkFileTree(myA, new CopyFile(myA, myB));
//        //Перемещаем файлы с "B_TMP_CopyFolders" в папку В
//        //нам нужно скипнуть перемещение самой B2 , но ПЕРЕМЕСТИТЬ myB
//        Files.walkFileTree(myB2, new MoveFile(myB2, myB));
//        //"B_TMP_CopyFolders"
//        Files.walkFileTree(myB2, new DeleteFile());
//        System.out.println("Done");