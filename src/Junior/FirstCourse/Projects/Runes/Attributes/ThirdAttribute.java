package Junior.FirstCourse.Projects.Runes.Attributes;

public class ThirdAttribute extends Attributes {
    public ThirdAttribute(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " [3] " +
                getName() + " = " +
                + getAttributeValue() +
                ';';
    }
}
