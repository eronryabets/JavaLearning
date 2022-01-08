package Junior.FirstCourse.Projects.Runes.Attributes;

public class SecondAttribute extends Attributes{
    public SecondAttribute(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " [2] " +
                getName() + " = " +
                + getAttributeValue() +
                ';';
    }
}
