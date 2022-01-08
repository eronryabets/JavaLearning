package Junior.SecondCourse.Projects.FilesInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        String folderInfoName = "foldersInfo.txt"; //name
        File foldersInfo = new File(folderInfoName); //create file
        //теперь через путь созданного файла .getAbsolutePath() отнимим его название и получим нашу директорию
        StringBuilder sb = new StringBuilder(foldersInfo.getAbsolutePath());
        sb.delete(sb.length() - folderInfoName.length(),sb.length());
        File folder = new File(String.valueOf(sb)); //присоим путь нашей директории в которой мы находимся
        File[] files = folder.listFiles(File::isFile);
        File[] directories = folder.listFiles(File::isDirectory);
        String test = "E:\\Programming\\JavaLearning\\foldersInfo.txt";
        test.contains("foldersInfo.txt");
        //System.out.println(test.contains("foldersInfo.txt"));
        Arrays.stream(files).forEach(System.out::println);
        for(File f:files){
            if(String.valueOf(f).contains("foldersInfo.txt") == true){
                System.out.println("содержит - foldersInfo");
            }
            else
                System.out.println("Не содержит");
        }

    }
}