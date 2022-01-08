package Junior.FirstCourse.HomeWork.HW20_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HW20 {
    public static ArrayList<String> stringToList(String ...s){
        ArrayList<String> listAll = new ArrayList<>();
        for (String s1 : s){
            listAll.add(s1);
        }
        Collections.sort(listAll);
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < listAll.size(); i++){
            if(list2.contains(listAll.get(i)) == false){
                list2.add(listAll.get(i));
            }
        }
        System.out.println(list2);
        return list2;
    }

    public static void main(String[] args) {
        stringToList("a","c","b","d","a","d");
    }
}

/*
      ArrayList<String> list = new ArrayList<>();
        String s1 = "A";
        String s2 = "D";
        String s3 = "C";
        String s4 = "B";
        String s5 = "D";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Next : ");
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            if(list2.contains(list.get(i)) == false){
                list2.add(list.get(i));
            }
        }
        System.out.println("list2");
        System.out.println(list2);
    }
}
 */