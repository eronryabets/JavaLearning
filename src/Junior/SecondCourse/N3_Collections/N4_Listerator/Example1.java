package Junior.SecondCourse.N3_Collections.N4_Listerator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//проверка полиндрома
public class Example1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list.add(ch);
        }
        list.forEach(System.out::println);

        ListIterator<Character> iterator = list.listIterator();
        //в reverseIterator мы указали что б он с конца листа шел в начало.
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
            while(iterator.hasNext() && reverseIterator.hasPrevious()){
                if(iterator.next() != reverseIterator.previous()){
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome){
                System.out.println("It is palindrom");
            }
            else{
                System.out.println("Not a palindrom");
            }

    }
}
