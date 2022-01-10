package Junior.SecondCourse.Projects.FtpLogFiltration;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String s = "2021-12-29 06:52:34 connected USER speedy 4455";
        s.contains("speed");
        System.out.println(s.contains("speed "));







        List<String> textList = new ArrayList<>();
        textList.add("2021-12-29 00:02:11 connected 21 USER speed 331");
        textList.add("2021-12-29 06:52:34 connected USER speedy ");
        textList.add("2021-12-29 06:57:11 connected USER speaker");
        textList.add("2021-12-29 06:57:11 connected USER Nata");
        textList.add("2021-12-29 06:59:53  SERVER\\Nata  PASV ");
        textList.add("2021-12-29 07:35:45 connected USER Irina ");
        textList.add("2021-12-29 00:02:11 SERVER\\speed  PWD ");
        textList.add("2021-12-29 00:02:11 connected USER speed 331");
        textList.add("2021-12-29 07:35:45 connected USER speed777 ");

        StringBuilder sb = new StringBuilder("speed");

//        textList.forEach(x ->{
//            if(!x.contentEquals(sb)){
//                System.out.println(x);
//            }
//        });

            textList.forEach(x ->{
                //System.out.println(x.contains("speed"));
            });



    }
}
