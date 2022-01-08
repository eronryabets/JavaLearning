package Junior.FirstCourse.HomeWork.HW4_ClassStudent;

public class StudentTest {
    public static void main(String[] args) {
        Student drunar = new Student(1,"Igor","Drunar",2012,4.3,5.0,4.7);
        Student topot= new Student(2,"Ingvar","Topot",2017,4.2,4.3,4.1);
        Student cat = new Student(3,"Fire","Cat",2011,4.4,4.1,4.9);

        //System.out.println(cat);
        //System.out.println(cat.ar_math);

        double average_rating = 0;
        //System.out.println("Cat's average rating of all subjects = " + (cat.ar_math + cat.ar_economy + cat.ar_fLanguage)/3);
        double catsAR = cat.average_ratingV1(cat.arMath,cat.arEconomy,cat.arLanguage);
        //System.out.println("Cat's average rating of all subjects = " + catsAR);

        double catsAR2 = cat.average_ratingV2();
        //System.out.println("Cat's average rating of all subjects = " + catsAR2);

        cat.average_ratingOnDisplay(cat);



    }
}
