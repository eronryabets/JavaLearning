package Junior.SecondCourse.Projects.Repeat.LogFilter;
/*
Ksenia
Aleksandra
Galina
Irina
Nata
Marina
Olga
Natalia
Denis
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogOneNameOnlyDirectories {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\Work\\Logs\\log.log"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Work\\Logs\\logOneName.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("F:\\Work\\Logs\\logOneName.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("F:\\Work\\Logs\\LogOneNameOnlyDirectories.txt"));
        ) {
            String line;
            while((line = reader.readLine())!=null){
                Pattern pattern = Pattern.compile("Denis"); //"SERVER\Denis"
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(line);
                    writer.write("\n");
                }
            }
            while((line = reader2.readLine())!=null){
                Pattern pattern = Pattern.compile(" /ms");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer2.write(line);
                    writer2.write("\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Done!");
    }
}
