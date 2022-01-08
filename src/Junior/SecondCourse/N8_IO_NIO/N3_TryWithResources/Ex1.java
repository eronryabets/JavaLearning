package Junior.SecondCourse.N8_IO_NIO.N3_TryWithResources;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        String rubai = "Свежий вечерний ветер колыхает колоски. \n" +
                "Бабочки порхают у пруда в тени. \n" +
                "Карпы сонно качаются у берега. \n" +
                "Звуки птиц дарят умиротворение. \n";
        try(FileWriter writer = new FileWriter
                ("E:\\Logs\\IO\\test1.txt",true);) {
            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}