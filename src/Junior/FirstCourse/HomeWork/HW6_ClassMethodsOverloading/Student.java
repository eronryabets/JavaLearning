package Junior.FirstCourse.HomeWork.HW6_ClassMethodsOverloading;

//ar == average rating

public class Student {
    int studentId;
    String name;
    String surname;
    int startDate;
    double arMath;
    double arEconomy;
    double arLanguage;

    //что бы лишний раз не писать, добавили сюда конструктор с 4я параметрами
    public Student(int studentId, String name, String surname, int startDate, double arMath, double arEconomy, double arLanguage) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.startDate = startDate;
        this.arMath = arMath;
        this.arEconomy = arEconomy;
        this.arLanguage = arLanguage;
    }

    public Student(int studentId, String name, String surname, int startDate) {
        this(studentId,name,surname,startDate,0,0,0);
    }

    public Student() {
    }

    //переписать, что бы у вызванного обьекта сами подставлялись нужные поля
    public double average_ratingV1(double arMath, double arEconomy, double arLanguage){
        double average_rating = (arMath + arEconomy + arLanguage)/3;
        return average_rating;
    }

    //теперь просто вызываем под обьектом и не нужно подставлять данные
    public double average_ratingV2(){
        double average_rating = (arMath + arEconomy + arLanguage)/3;
        return average_rating;
    }


    public void average_ratingOnDisplay(Student stud){
        double average_rating = (stud.arMath + stud.arEconomy + stud.arLanguage)/3;
        System.out.println(stud.surname + "'s average rating of all subjects = " + average_rating + ";");
    }

    @Override
    public String toString() {
        return "Student{" +
                " student ID = " + studentId +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", date of study = " + startDate +
                ", math average rating = " + arMath +
                ", economy average rating = " + arEconomy +
                ", foreign language average rating = " + arLanguage + " " +
                '}';
    }



}
