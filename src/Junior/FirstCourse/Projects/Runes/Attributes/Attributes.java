package Junior.FirstCourse.Projects.Runes.Attributes;

import static Junior.FirstCourse.Lections.Random.Random.myRandom;

public class Attributes {
    private String name;
    private int attributeValue = myRandom(4,8);

    public Attributes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " [1] " +
                name + " = " +
                + attributeValue +
                ';';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(int attributeValue) {
        this.attributeValue = attributeValue;
    }
}
