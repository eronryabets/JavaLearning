package Junior.SecondCourse.N5_Lambda.N0_LambdasAlex;

public class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.CanHop();
    }
}
