package Junior.FirstCourse.Projects.Runes.RunesSet;
//Руна должна создаваться с рандомными 4я свойствами.
//нужно убрать создание нескольких одинаковых атрибутов
import Junior.FirstCourse.Projects.Runes.Attributes.FirstAttribute;
import Junior.FirstCourse.Projects.Runes.Attributes.FourthAttribute;
import Junior.FirstCourse.Projects.Runes.Attributes.SecondAttribute;
import Junior.FirstCourse.Projects.Runes.Attributes.ThirdAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Junior.FirstCourse.Lections.Random.Random.myRandom;

public abstract class CreateRunes {
    private int enhanceRate = 0;
    private FirstAttribute first;
    private SecondAttribute second;
    private ThirdAttribute third;
    private FourthAttribute four;

    public CreateRunes() {

        List<String> attribute = new ArrayList();
        attribute.addAll(Arrays.asList("strange", "speed", "health", "defense", "criDamage", "criRate", "accuracy", "resist"));

        FirstAttribute f1 = new FirstAttribute(attribute.get(myRandom(0,attribute.size()-1)));
        attribute.remove(f1.getName());
        SecondAttribute s1 = new SecondAttribute(attribute.get(myRandom(0,attribute.size()-1)));
        attribute.remove(s1.getName());
        ThirdAttribute t1 = new ThirdAttribute(attribute.get(myRandom(0,attribute.size()-1)));
        attribute.remove(t1.getName());
        FourthAttribute fr1 = new FourthAttribute(attribute.get(myRandom(0,attribute.size()-1)));
        attribute.remove(fr1.getName());
        this.first = f1;
        this.second = s1;
        this.third = t1;
        this.four = fr1;
        this.enhanceRate = enhanceRate;
    }

    public int getEnhanceRate() {
        return enhanceRate;
    }

    public void setEnhanceRate(int enhanceRate) {
        this.enhanceRate = enhanceRate;
    }

    public FirstAttribute getFirst() {
        return first;
    }

    public void setFirst(FirstAttribute first) {
        this.first = first;
    }

    public SecondAttribute getSecond() {
        return second;
    }

    public void setSecond(SecondAttribute second) {
        this.second = second;
    }

    public ThirdAttribute getThird() {
        return third;
    }

    public void setThird(ThirdAttribute third) {
        this.third = third;
    }

    public FourthAttribute getFour() {
        return four;
    }

    public void setFour(FourthAttribute four) {
        this.four = four;
    }
}
/*
//можно было использовать этот мэтот в этом классе, но более логично перенести в интерфейс  Enhancement
public static CreateRunes runesLevelUp(CreateRunes runes){
        if (runes.enhanceRate < 4){
            int runUp = myRandom(4,8);
            switch (myRandom(1,4)) {
                case 1:
                    System.out.printf("Точим 1й атрибут %s на %d \n", runes.first.getName(), runUp);
                    runes.first.setAttributeValue(runes.first.getAttributeValue()+runUp);
                    break;
                case 2:
                    System.out.printf("Точим 2й атрибут %s на %d \n", runes.second.getName(), runUp);
                    runes.second.setAttributeValue(runes.second.getAttributeValue()+runUp);
                    break;
                case 3:
                    System.out.printf("Точим 3й атрибут %s на %d \n", runes.third.getName(), runUp);
                    runes.third.setAttributeValue(runes.third.getAttributeValue()+runUp);
                    break;
                case 4:
                    System.out.printf("Точим 4й атрибут %s на %d \n", runes.four.getName(), runUp);
                    runes.four.setAttributeValue(runes.four.getAttributeValue()+runUp);
                    break;
            }
            runes.enhanceRate ++;
        }
        else {
            System.out.println("Рунна зачарована на максимум. Больше зачаровать не возможно");
        }

        return runes;
    }
 */