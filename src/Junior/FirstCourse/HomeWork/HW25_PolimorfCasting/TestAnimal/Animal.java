package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting.TestAnimal;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name){
        if (name.length() > 3){
            this.name = name;
        }
    }

    public void eat(){
        System.out.println("Animal eat");
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }
    public void isAnimal(){
        System.out.println("This is an animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
