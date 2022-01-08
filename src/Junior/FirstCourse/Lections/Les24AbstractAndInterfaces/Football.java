package Junior.FirstCourse.Lections.Les24AbstractAndInterfaces;

public interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}