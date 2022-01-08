package Junior.FirstCourse.Lections.Les25Polimorf.Animal;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal("AnimalAnimal");
        Dog dog = new Dog("DogDog");
        Animal animalDog = new Dog("AnimalDog");
        //Dog dogAnimal = (Dog) new Animal("dogAnimal");
        System.out.println("********* animal = new Animal : ");
        animal.eat();
        animal.voice();
        System.out.println("********* animalDog = new Dog :");
        animalDog.eat();
        animalDog.voice();
        System.out.println("********* dog = new Dog :");
        dog.voice();
        dog.eat();
        dog.bark();

    }
}
/*
Когда создаем обьект через родительский тип, то мы имеем доступ только к родительским методам.
Animal an1 = new Dog();
an1 не будет иметь к методу an1.bark();
так как рассматриваем an1 как животное ( а не как собаку).
Animal an2 = new Dog();
an2.eat(); будет вызван тот метод переопределенный который в потомке (позднее связывание)
Если етого метода нет в потомке, то будет вызвана та реализация, которая у родителя.
Преимущество полиморфизма - Возможность передовать в метод разные типы, если у них есть один и тот же родитель.
    public static void test(Animal animal){
        animal.eat();
    }
    test(dog);
 */
