package Junior.SecondCourse.N10_Other_Important_subjects.N2_Scanner;


import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx2 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        try(Scanner scanner = new Scanner(new FileReader(
                "F:\\Work\\Logs\\IO\\stih.txt"))){
            scanner.useDelimiter("\\W");
            while(scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for(String word:set){
                System.out.println(word);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("We have a problem");
        }


    }
}
