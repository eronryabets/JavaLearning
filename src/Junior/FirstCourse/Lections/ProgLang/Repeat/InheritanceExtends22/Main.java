package Junior.FirstCourse.Lections.ProgLang.Repeat.InheritanceExtends22;

public class Main {
    public static void main(String[] args) {
        Animal dg = new Dog("Bob",4,4);
        dg.voice();
        Taxa taxa = new Taxa ("Luci",4,4);
        taxa.jump();
        taxa.bark();
        taxa.voice();
        Dog xim = new Taxa("Jim",4,4);
        xim.bark();
    }
}
