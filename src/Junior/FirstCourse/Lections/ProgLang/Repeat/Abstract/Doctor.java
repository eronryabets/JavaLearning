package Junior.FirstCourse.Lections.ProgLang.Repeat.Abstract;

public class Doctor extends Employee {
    private String profession;

    public Doctor(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }


    @Override
    public void tellAboutYourself() {
        System.out.printf("Hello my name is %s! I am %d years old. My profession is %s \n", getName(), getAge(), getProfession());
    }
}
