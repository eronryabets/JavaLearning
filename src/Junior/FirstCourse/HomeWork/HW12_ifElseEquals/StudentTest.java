package Junior.FirstCourse.HomeWork.HW12_ifElseEquals;

public class StudentTest {

    public static void studentEquals(Student std1, Student std2){
        if(std1.equals(std2) == true){
            System.out.println("Student1 = Student2");
        }
        else{
            System.out.println("Student1 != Student2");
        }
    }

    public static void studVsStud(Student std1, Student std2){
        if (std1.name.equals(std2.name) && std1.surname.equals(std2.surname) && std1.course == std2.course) {
            System.out.println("Студенты одинаковые");
        }
        else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void student1VsStudent2(Student std1, Student std2){
        if (std1.name.equals(std2.name)){
            if (std1.surname.equals(std2.surname) && std1.course == std2.course){
                System.out.println("Имя Фамилия Курс - одинаковые");
            }
            else if(std1.surname.equals(std2.surname)){
                System.out.println("Имя Фамилия - одинаковые");
            }
            else if(std1.course == std2.course){
                System.out.println("Имя и Курсы - одинаковые");
            }
            else {
                System.out.println("Имя - одинаковое");
            }
        }
        else if(std1.surname.equals(std2.surname)){
            if(std1.course == std2.course){
                System.out.println("Фамилия и курс - одинаковые");
            }
            else {
                System.out.println("Фамилии - одинаковые");
            }

        }
        else if(std1.course == std2.course){
            System.out.println("Курсы - одинаковые");
        }
        else{
            System.out.println("У студентвой всё разное");
        }
    }

    public static void main(String[] args) {
        //Все данные студентов идентичны ++
        Student std1 = new Student("Max","Gogol",1);
        Student std2 = new Student("Max","Gogol",1);
        System.out.println("std1,std2");
        studentEquals(std1,std2);
        student1VsStudent2(std1,std2);
        //Имя одинаковое
        Student std3 = new Student("Max","Gogol",1);
        Student std4 = new Student("Max","Bing",4);
        System.out.println("std3,std4");
        studentEquals(std3,std4);
        student1VsStudent2(std3,std4);
        //Фамилия и Курсы одинаковые
        Student std5 = new Student("Max","Gogol",1);
        Student std6 = new Student("Sergio","Gogol",1);
        System.out.println("std5,std6");
        student1VsStudent2(std5,std6);
        //Фамилии одинаковые
        Student std7 = new Student("Max","Gogol",3);
        Student std8 = new Student("Sergio","Gogol",1);
        System.out.println("std7,std8");
        student1VsStudent2(std7,std8);
        //Курсы и Имена одинаковые
        Student std9 = new Student("Max","Gogol",1);
        Student std10 = new Student("Max","Bing",1);
        System.out.println("std9,std10");
        student1VsStudent2(std9,std10);
        //Курсы одинаковые
        Student std11 = new Student("Sergio","Gogol",1);
        Student std12 = new Student("Max","Bing",1);
        System.out.println("std11,std12");
        student1VsStudent2(std11,std12);
        //Все данные разные ++
        Student std13 = new Student("Sergio","Gogol",4);
        Student std14 = new Student("Max","Bing",1);
        System.out.println("std13,std14");
        student1VsStudent2(std13,std14);
        //Одинаковые имя и фамилия, курс разный
        Student std15 = new Student("Sergio","Gogol",2);
        Student std16 = new Student("Sergio","Gogol",1);
        System.out.println("std15,std16");
        student1VsStudent2(std15,std16);

        studVsStud(std1,std2);
        studVsStud(std7,std8);

    }


}