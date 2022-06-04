package Junior.FirstCourse.HomeWork.HW18_Arrays;
//ДОДЕЛАТЬ КАК В ДЗ, С КРАСИВЫМ ВЫВОДОМ - DONE

public class Test2Arrays {

    public static void arraysOnDisplay(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    //для двумерных массивов с разной величиной
    public static void arraysOnDisplay(String[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j] + " = ["+i+"]" + "["+j+"]" );
            }
        }
    }

    //по заданию, с красивым выводом
    public static void arraysOnDisplayHW(String[][] array) {
        System.out.print("{ ");
        for(int i = 0; i < array.length; i++){
            System.out.print("{ ");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
                if(j != (array[i].length-1)){ // если не последний элемент в массиве ставь "," !=0[2]
                    System.out.print(", ");
                }
            }
            System.out.print(" }");
            if(i != (array[i].length-1)){ //если это не последний вложенный масив, ставь ","
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
    
    public static void main(String[] args) {
        String[][] s1 = new String[2][4];

        s1[0][0] = "Hello";
        s1[0][1] = "World";
        s1[0][2] = "I'm";
        s1[0][3] = "Fine";

        s1[1][0] = "Good Bye";
        s1[1][1] = "World";
        s1[1][2] = "I'm";
        s1[1][3] = "Sleeping";

        //arraysOnDisplay(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < s1[i].length; j++) {
                System.out.print( s1[i][j] +", ");
            }
            System.out.print(" }");
        }


    }
}
/*
for(int i=0; i < s1.length; i++){
            for(int j=0; j < s1[i].length; j++){
                System.out.println(s1[i][j]);
            }
        }
 */
