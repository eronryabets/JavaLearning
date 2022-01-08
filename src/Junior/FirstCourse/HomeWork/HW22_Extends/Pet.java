package Junior.FirstCourse.HomeWork.HW22_Extends;

public class Pet extends Animal{
    private String name;
    int tail = 1;
    int paw = 4;

    public Pet(String name) {
        this.eyes = 2;
        this.name = name;
        System.out.println("I am a pet");
    }
    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jump");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", tail=" + tail +
                ", paw=" + paw +
                ", eyes=" + eyes +
                '}';
    }
}

/*
public Pet(int eyes,String name, int tail, int paw) {
        //this.eyes = 2;
        super(eyes);
        this.name = name;
        this.tail = tail;
        this.paw = paw;
        System.out.println("I am a pet");
    }
 */