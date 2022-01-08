package Junior.FirstCourse.HomeWork.HW28_ThrowException;

public class Tiger {

    public void eat(String s) {
        if (!s.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + s);
        } else {
            System.out.println("Tigr est myaso");
        }
    }

    public void drink(String s) throws NeVodaException {
        if (!s.equals("voda")){
            throw new NeVodaException("Tiger ne piot " + s);
        }
        else {
            System.out.println("Tiger piot vody");
        }
    }
}
