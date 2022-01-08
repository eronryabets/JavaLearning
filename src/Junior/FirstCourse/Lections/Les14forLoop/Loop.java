package Junior.FirstCourse.Lections.Les14forLoop;

public class Loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Next loop");

        for(int i = 1; i <= 10; i++){
            if(i == 7){
                break; //заканчивает нашу итеррацию на данном условии
            }
            System.out.println(i);
        }
        System.out.println("Next loop");
        for(int i = 1; i <= 10; i++){
            if(i == 7){
                continue; //скипает операцию с условием i == 7
            }
            System.out.println(i);
        }

    }
}
