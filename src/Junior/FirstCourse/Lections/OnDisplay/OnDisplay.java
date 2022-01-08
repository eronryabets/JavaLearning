package Junior.FirstCourse.Lections.OnDisplay;

public class OnDisplay {

    public static void arraysOnDisplay(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void arraysOnDisplay(String[][] array){
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
