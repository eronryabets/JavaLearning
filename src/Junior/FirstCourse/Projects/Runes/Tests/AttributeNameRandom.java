package Junior.FirstCourse.Projects.Runes.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Junior.FirstCourse.Lections.Random.Random.myRandom;
//этот метод не нужен, встроил сразу в конструктор рун. Что бы не дублирывались атрибуты.

public class AttributeNameRandom {

    public static String attributeRandom(){
        List<String> attribute = new ArrayList();
        attribute.addAll(Arrays.asList("strange", "speed", "health", "defense", "criDamage", "criRate", "accuracy", "resist"));
        return attribute.get(myRandom(0,attribute.size()-1));
    }
}
/*
List<String> attribute = Arrays.asList("strange", "speed", "health", "defense", "criDamage", "criRate", "accuracy", "resist");
 */