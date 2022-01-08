package Junior.FirstCourse.Lections.Les25Polimorf.Casting;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
//        Doctor d1 = (Doctor) emp1; //casting у нас на один обьект ссылается и Doctor и Employee и тогда мы можем вызвать d1.skill
//        System.out.println(d1.skill);
//        d1.heal();
//        System.out.println(((Doctor)emp1).skill); //casting
//        ((Doctor)emp1).heal(); //casting - заворачиваем emp1 в доктора.
        Employee[] array = {emp1, emp2, emp3, emp4};
        for (Employee e : array) {
            if (e instanceof Driver) {
                System.out.println(((Driver) e).carName);
                ((Driver) e).work();
            }
        }

    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Employee sleeps");
    }
}

class Teacher extends Employee {
    int pupils;

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee {
    String carName = "Honda";

    void work() {
        System.out.println("Driver works");
    }
}


class Doctor extends Employee {
    String skill = "Healing";

    void work() {
        System.out.println("Doctor works");
    }

    void heal() {
        System.out.println("Healing");
    }

}


