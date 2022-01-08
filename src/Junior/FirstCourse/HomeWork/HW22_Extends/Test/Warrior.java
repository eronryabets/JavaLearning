package Junior.FirstCourse.HomeWork.HW22_Extends.Test;

class Warrior {
    private StringBuilder name;
    private int age;

    public Warrior(String name, int age) {
        setName(name);
        this.age = age;
    }

    public Warrior() {
    }

    public StringBuilder getName() {
        StringBuilder sb = name;
        return sb;
    }

    public void setName(String name) {
        if (name.length() >= 2){
            this.name = new StringBuilder(name);
        }
        else {
            this.name = new StringBuilder("newUser");
        }
    }
    public int ageDifference(Object obj){
        int dif = this.age - ((Warrior)obj).age;
        return dif;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Warrior w1 = new Warrior("Alex",22);
        System.out.println(w1.getName());
        String surname = "borov";
        String sn2 = surname.replace("o","a");
        System.out.println(sn2);
        Warrior w2 = new Warrior("Petr",33);
        int def1 = w1.ageDifference(w2);
        System.out.println(def1);
    }

}