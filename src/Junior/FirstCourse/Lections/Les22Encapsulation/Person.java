package Junior.FirstCourse.Lections.Les22Encapsulation;

public class Person {
    final String pol;
    private StringBuilder name;
    private int age;
    private int weight;

    public Person(String pol) {
        this.pol = pol;
    }

    public Person(String pol,int age) {
        this.pol = pol;
        if (age > 0 & age < 150){
            this.age = age;
        }
        else this.age = 1;

    }

    public String getPol() {
        return pol;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(String name) {
        this.name = new StringBuilder(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 & age < 150){
            this.age = age;
        }

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 15 & weight <250){
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "pol='" + pol + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

/*
 public StringBuilder getName() {
        return name;
    }
    так нельзя, ибо будет возможным то что ниже
    xena.getName().append("!"); //мы должны получать обьект, и не можем изменять его, а так можем)))
 */