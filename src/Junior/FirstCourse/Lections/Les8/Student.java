package Junior.FirstCourse.Lections.Les8;

public class Student {
    static int count; //переменная класса
    String name;
    int course;

    public Student(String name, int course) {
        count ++;
        this.name = name;
        this.course = course;
    }

    public void countOnDisplay(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) {
        Student max = new Student("Max",3);
        max.countOnDisplay();
        Student sergio = new Student("Sergio",5);
        sergio.countOnDisplay();

    }

}
