package Junior.FirstCourse.Projects.Runes.RunesSet;

//Speed set + 15% HP

import Junior.FirstCourse.Projects.Runes.RuneEnhance.Enhancement;

public class Speed extends CreateRunes implements Enhancement {
    @Override
    public String toString() {
        return "[Speed rune]: " +
                getFirst() +
                getSecond() +
                getThird() +
                getFour() +
                " enhance = (" + getEnhanceRate() + ");";

    }
}
