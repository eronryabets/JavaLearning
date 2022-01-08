package Junior.FirstCourse.Projects.Runes.Attributes;

public class FourthAttribute extends Attributes{
    public FourthAttribute(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " [4] " +
                getName() + " = " +
                + getAttributeValue() +
                ';';
    }
}
