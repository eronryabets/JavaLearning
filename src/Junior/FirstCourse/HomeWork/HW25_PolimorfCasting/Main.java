package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

//Создайте два массива типа Speakable и типа Animal, которые будут содержать все возможные ссылочные переменные,
//ссылающиеся на всевозможные обьекты. Используя if и instanceof проверяйте на какой обьект ссылается переменная и
//выводите на экран соотвествующие переменные данного обьекта и вызывайте его методы.
public class Main {
    public static void main(String[] args) {
        Mechenosec sword = new Mechenosec("Sword");
        Penguin pingy = new Penguin("Pingy");
        Lion lev = new Lion("Lev");
        Mammal lev2 = new Lion("Lviv");

        Speakable[] arraySpeak = {pingy, lev, lev2};
        for (Speakable s : arraySpeak) {
            if (s instanceof Mammal) {
                System.out.printf("It is a %s : \n", ((Mammal) s).name);
                ((Mammal) s).run();
                ((Mammal) s).eat();
                ((Mammal) s).sleep();
            } else if (s instanceof Bird) {
                System.out.printf("It is a %s : \n", ((Bird) s).name);
                ((Bird) s).fly();
                ((Bird) s).eat();
                ((Bird) s).sleep();
            }
        }

        Animal[] arrayAnimal = {sword, pingy, lev, lev2 ,sword};
        for (Animal a : arrayAnimal){
            if ( a instanceof Mammal){
                System.out.printf("It is a %s : \n", ((Mammal) a).name);
               ((Mammal) a).run();
                a.eat();
                a.sleep();
            }
            else if (a instanceof Bird){
                System.out.printf("It is a %s : \n", ((Bird) a).name);
                ((Bird) a).fly();
                a.eat();
                a.sleep();
            }
            else if (a instanceof Fish){
                System.out.printf("It is a %s : \n", ((Fish) a).name);
                a.sleep();
                a.eat();
            }
        }


    }
}
