package Junior.FirstCourse.Lections.Random;

public class Random {
    public static int myRandom(int min, int max){
        int random = min + (int) (Math.random() * (max - min + 1));
        return random;
    }
}
