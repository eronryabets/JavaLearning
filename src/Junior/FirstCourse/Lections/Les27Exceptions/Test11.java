package Junior.FirstCourse.Lections.Les27Exceptions;

public class Test11 {
    public static void main(String[] args) {
        createPwd("123456");
        Airplane a1 = new Airplane();
        a1.status = "pending";
        a1.pending();
        a1.toFly();
        //a1.pending();
        a1.flightCanceled();
    }

    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Длина паролья слишком маленькая");
        } else if (pwd.length() > 12) {
            throw new IllegalArgumentException("Длина пароля слишком большая");
        }
        System.out.println("Пароль принят");
    }

}

class Airplane {
    String status = "pending"; // pending; in the air; flight canceled;

    public void toFly() {
        status = "in the air";
        System.out.println("Airplane in the air");
    }

    public void pending() {
        if (status.equals("in the air"))
            throw new IllegalArgumentException("Airplane in the air now!");
        status = "pending";
        System.out.println("Airplane pending to fly");

    }

    public void flightCanceled() {
        if (status.equals("in the air"))
            throw new IllegalArgumentException("Airplane in the air now!");
        status = "pending";
        System.out.println("Airplane pending to fly");

    }
}
