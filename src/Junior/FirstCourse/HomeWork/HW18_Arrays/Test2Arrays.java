package Junior.FirstCourse.HomeWork.HW18_Arrays;
//ДОДЕЛАТЬ КАК В ДЗ, С КРАСИВЫМ ВЫВОДОМ

public class Test2Arrays {

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
