package Junior.FirstCourse.Projects.Runes.RunesSet;

//Defense set + 15% HP

public class Defense extends CreateRunes {
    @Override
    public String toString() {
        return "[Defense rune]: " +
                getFirst() +
                getSecond() +
                getThird() +
                getFour() +
                " enhance = (" + getEnhanceRate() + ");";

    }
}
