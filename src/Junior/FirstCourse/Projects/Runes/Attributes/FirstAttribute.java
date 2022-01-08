package Junior.FirstCourse.Projects.Runes.Attributes;

public class FirstAttribute  extends Attributes {
    public FirstAttribute(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " [1] " +
                getName() + " = " +
                 + getAttributeValue() +
                ';';
    }
}
