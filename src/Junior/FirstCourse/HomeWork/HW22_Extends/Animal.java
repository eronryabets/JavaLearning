package Junior.FirstCourse.HomeWork.HW22_Extends;

public class Animal {

    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    public void eat (){
        System.out.println("Animal eating");
    }
    public void drink (){
        System.out.println("Animal drink");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
