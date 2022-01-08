package Junior.FirstCourse.Lections.Les22Encapsulation;

public class Test1 {
    public static void main(String[] args) {

        Person xena = new Person("Woman");
        xena.setAge(30);
        xena.setName("Xena");
        xena.setWeight(70);
        System.out.println(xena);
        xena.getName().append("!"); //после изменения Гэта теперь не можем менять обьект
        xena.setAge(666);
        System.out.println(xena);
        Person aron = new Person("Male",666);
        aron.setName("Aron");
        aron.setWeight(90);
        System.out.println(aron);
        aron.setAge(33);
        System.out.println(aron);
    }
}
