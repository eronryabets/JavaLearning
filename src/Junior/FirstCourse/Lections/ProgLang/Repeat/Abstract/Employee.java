package Junior.FirstCourse.Lections.ProgLang.Repeat.Abstract;

public abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public abstract void tellAboutYourself();


}

