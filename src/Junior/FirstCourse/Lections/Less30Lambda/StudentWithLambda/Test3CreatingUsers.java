package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

public class Test3CreatingUsers {
    public static void main(String[] args) {

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());
    }
}
interface UserBuilder{
    User create(String name);
}

class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}
