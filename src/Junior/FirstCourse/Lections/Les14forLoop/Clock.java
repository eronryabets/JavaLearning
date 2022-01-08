package Junior.FirstCourse.Lections.Les14forLoop;

public class Clock {
    public static void main(String[] args) {
        OUTER : for(int i = 0; i < 24; i++){
            INNER : for (int j = 0; j < 60; j++){
                if (i == 23){
                    continue INNER; //or continue OUTER;
                }
                System.out.print(i + " : ");
                System.out.println(j + "");
            }
        }
    }
}
