package Junior.SecondCourse.Projects.CopyFile.BCP_old;
/*
ex2 - работает в ручном режиме
ex3 - копирование с заменой
ex4 попробовать автоматически сделать для лубых папок
ТЗ - перемещаем в корень папку А ( переименовав ее в В) - с заменой файлов, если такие уже есть в В.
А зачем я вообще мучался с COPY если по логике мне нужно использовать MOVE !?)

Мне нужно 2а класса, копирование(перемещение, переименование) и удаление.
сначала мы копируем папку ( папки)  а потом копируем содержимое - и перемещаем в те папки.
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

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Path myA = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path myB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        StringBuilder sb2 = new StringBuilder(myB.toString());
        sb2.append(2);
        Path myB2 = Paths.get(String.valueOf(sb2));
        //Переименовываем В в В2
        Files.walkFileTree(myB, new RenameFolder(myB,myB2));
        //Переименовываем А в В
        Files.walkFileTree(myA, new RenameFolder(myA,myB));
        //Перемещаем файлы с В2 в папку В
        //ошибка если такой файл уже есть в другой директории
        //не перемещает папку
        //нам нужно скипнуть перемещение самой B2 , но ПЕРЕМЕСТИТЬ myB
        Files.walkFileTree(myB2,new MoveFile(myB2,myB));


    }
}

//class my Delete Files
class DeleteFile2 extends SimpleFileVisitor<Path> {
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

class CopyFile2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public CopyFile2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    //сначала у нас идет операция с самой папкой, а затем уже с файлами в visitFile
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        //куда мы будем копировать
        Path newDestination = destination.resolve(source.relativize(dir));
        //Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING );//добавили перезапись , StandardCopyOption.REPLACE_EXISTING)
        Files.move(dir,newDestination);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        //Files.copy(file,newDestination, StandardCopyOption.REPLACE_EXISTING);//добавили перезапись
        return FileVisitResult.CONTINUE;
    }

}

class RenameFolder2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public RenameFolder2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.move(dir,newDestination);
        return FileVisitResult.SKIP_SIBLINGS; // в данной директории продолжать обход по файлам не нужно
    }
}

class MoveFile2 extends SimpleFileVisitor<Path> {
    Path source; //FROM ->
    Path destination; //-> TO

    public MoveFile2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        //System.out.println("source - " + source);
        //System.out.println("destination - " + destination);
        if(dir == source){
            //System.out.println("скипнули " + dir);;
        } else {
            Files.move(dir,newDestination);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        //нужно проверить есть ли в destination файл с таким именем? есть - скип
        Path destinationCheck = Paths.get(destination.toString() + "\\" + file.getFileName());

//        System.out.println("destinationCheck = " + destinationCheck);
//        System.out.println("source = " + source);
//        System.out.println("destination = " + destination);

        //нам нужно выяснить есть ли файл из source в destination
        if(Files.exists(newDestination)){ //Files.exists(destinationCheck)
            System.out.println("скипнули " + file);;
        } else {
            System.out.println("Перекидываем " + file + " в " + " newDestination = " + newDestination );
            Files.move(file,newDestination);
        }
        return FileVisitResult.CONTINUE;
    }
}


/*
//Files.move(Paths.get("E:\\Logs\\IO\\CopyTEST\\B"),Paths.get("E:\\Logs\\IO\\CopyTEST\\B2"));
при if(Files.exists(destination)) //dir //source
если в начназении нет такой папки - то кидаем ее
===
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        System.out.println("source - " + source);
        System.out.println("destination - " + destination);
        if(Files.exists(destination)){
            System.out.println("скипнули " + dir);;
        } else {
            Files.move(dir,newDestination);
        }
        return FileVisitResult.CONTINUE;
    }
    ======
    if dir == souse? destination?
    ==========
    не рабочий модуль
    if(Files.exists(destination.resolve(file))){
            System.out.println("скипнули " + file);;
        } else {
            Files.move(file,newDestination);
        }
        Files.move(file,newDestination);

        ===================
            @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        System.out.println("source - " + source);
        System.out.println("destination - " + destination);
        System.out.println("file - " + file);
        System.out.println("MYTEST - " + source.resolve(file));
        System.out.println("MYTEST - " + destination.resolve(file));
        //System.out.println("MYTEST - " + destination.);
        //нужно проверить есть ли в destination файл с таким именем? есть - скип
        System.out.println("Files.exists(destination.resolve(file) : " +  destination.resolve(file) + " - " + Files.exists(destination.resolve(file)));
        System.out.println("fileSourceName " + file.getFileName().toString());
        System.out.println("fileDestinationName" + destination.getFileName().toString());

        if(file.getFileName().toString().equals(destination.getFileName().toString())){
            System.out.println("скипнули " + file);;
        } else {
            Files.move(file,newDestination);
        }
        Files.move(file,newDestination);
        return FileVisitResult.CONTINUE;
    }
}

 */