package Junior.FirstCourse.HomeWork.HW4_ClassStudent;

//ar == average rating

public class Student {
    int studentId;
    String name;
    String surname;
    int startDate;
    double arMath;
    double arEconomy;
    double arLanguage;

    public Student(int studentId, String name, String surname, int startDate, double arMath, double arEconomy, double arLanguage) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.startDate = startDate;
        this.arMath = arMath;
        this.arEconomy = arEconomy;
        this.arLanguage = arLanguage;
    }

    public int getstudentId() {
        return studentId;
    }

    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public double getArMath() {
        return arMath;
    }

    public void setArMath(double arMath) {
        this.arMath = arMath;
    }

    public double getArEconomy() {
        return arEconomy;
    }

    public void setArEconomy(double arEconomy) {
        this.arEconomy = arEconomy;
    }

    public double getArLanguage() {
        return arLanguage;
    }

    public void setArLanguage(double arLanguage) {
        this.arLanguage = arLanguage;
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
