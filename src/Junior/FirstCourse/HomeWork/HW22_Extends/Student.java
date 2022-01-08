package Junior.FirstCourse.HomeWork.HW22_Extends;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(String name, int course, int grade) {
        if (name.length() > 3 ){
            this.name = new StringBuilder(name);
        }
        else {
            this.name = new StringBuilder("user");
        }
        if (course >= 1 & course <= 4){
            this.course = course;
        }
        else{
            this.course = 0;
        }
        if (grade >= 1 & grade <= 10){
            this.grade = grade;
        }
        else {
            this.grade = 0;
        }

    }
    public Student() {
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(String name) {
        if (name.length() > 3 ){
            this.name = new StringBuilder(name);
        }
        else this.name = new StringBuilder("user");
    }

    public int getCourse() {
        int cr = course;
        return cr;
    }

    public void setCourse(int course) {
        if (course >= 1 & course <= 4){
            this.course = course;
        }
        else this.course = 0;
    }

    public int getGrade() {
        int gr = grade;
        return gr;
    }

    public void setGrade(int grade) {
        if (grade >= 1 & grade <= 10){
            this.grade = grade;
        }
        else this.grade = 0;
    }

    public static void showInfo (Student student){
        System.out.printf("Name: %s; Course: %d; Grade: %d; \n" ,student.getName(),student.getCourse(),student.getGrade());
    }

    @Override
    public String toString() {
        return "Students{" +
                "name=" + name +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alex",2,3);
    }
}

/*
 public void setName(StringBuilder name) {

        if (name.length() <= 3 ){
            this.name = new StringBuilder(name);
        }
    }
    ====================================
    public static void showInfo (Student student){
        System.out.printf("Name: %s; Course: %d; Grade: %d;" ,student.name,student.course,student.grade);
    }
    ====================================
 */