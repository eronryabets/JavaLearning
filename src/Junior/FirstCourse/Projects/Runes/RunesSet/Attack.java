package Junior.FirstCourse.Projects.Runes.RunesSet;

//Attack set + 15% Attack rate

import Junior.FirstCourse.Projects.Runes.RuneEnhance.Enhancement;

public class Attack extends CreateRunes implements Enhancement {
    @Override
    public String toString() {
        return "[Attack rune]: " +
                getFirst() +
                getSecond() +
                getThird() +
                getFour() +
                " enhance = (" + getEnhanceRate() + ");";

    }
}
