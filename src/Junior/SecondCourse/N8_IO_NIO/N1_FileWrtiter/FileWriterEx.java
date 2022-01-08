package Junior.SecondCourse.N8_IO_NIO.N1_FileWrtiter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Свежий вечерний ветер колыхает колоски. \n" +
                "Бабочки порхают у пруда в тени. \n" +
                "Карпы сонно качаются у берега. \n" +
                "Звуки птиц дарят умиротворение. \n";
        FileWriter writer = null;
        try {
            writer = new FileWriter("E:\\Logs\\IO\\test1.txt",true);
//            for(int i =0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
