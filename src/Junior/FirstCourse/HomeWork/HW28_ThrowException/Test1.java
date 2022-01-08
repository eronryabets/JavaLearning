package Junior.FirstCourse.HomeWork.HW28_ThrowException;


public class Test1 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("myaso");

        try {
            t1.drink("voda");
            try {
                t1.drink("pivo");
            }
            catch (NeVodaException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finally block");
            }
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
