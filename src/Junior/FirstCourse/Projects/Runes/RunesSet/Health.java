package Junior.FirstCourse.Projects.Runes.RunesSet;

//Health set + 15% HP

import Junior.FirstCourse.Projects.Runes.RuneEnhance.Enhancement;

public class Health extends CreateRunes implements Enhancement {

    @Override
    public String toString() {
        return "[Health rune]: " +
                getFirst() +
                getSecond() +
                getThird() +
                getFour() +
                " enhance = (" + getEnhanceRate() + ");";

    }
}
