package Junior.SecondCourse.Projects.Repeat.MyINterfaces;

public interface Speakable {
    default void speak(){
        System.out.println("Hello I am " + this);
    }
}
