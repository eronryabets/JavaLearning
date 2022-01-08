package Junior.FirstCourse.Lections.Les21ArrayList;

import java.util.*;

public class Notice {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        ArrayList <String> list11 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Bye");
        list.add(sb1);
        list.add(new StringBuilder("Bye"));
        list.get(0).append("!!!!"); //для стрингБилдера
        list.remove(0); //удаление
        list.addAll(list2); //добавление второй колекции в первую
        list.set(0, sb2);//заменяет обьект в индексе на тот что мы выбрали
        list.clear(); //очистить весь лист
        list.indexOf("Bye");
        list.indexOf(("Ok")); //находит вхождение нашего Ок, первый индекс встречающийся
        list.lastIndexOf(("Ok")); //находит вхождение нашего Ок, последний индекс встречающийся
        list.size(); // ввыодит кол-во обьектов в листе
        list.isEmpty(); //тру ор фолс, пустой или нет лист
        list.add(sb1);
        list.contains(sb1); //дает True если лист содержит данный обьект
        list.toString(); //вывести на экран наш Лист в виде стрингового массива
        ArrayList<StringBuilder> list5 = (ArrayList<StringBuilder>) list.clone(); //склонить лист в новый лист5
        Object[] array6 = list.toArray(); //добавляем в массив обьектов значения нашего листа
        StringBuilder[] array = {sb1, sb2};
        List<StringBuilder> list8 = Arrays.asList(array);//лист стринг билдера равен массиву, скопили с него всю инфу в новый лист
        ArrayList<String> list9 = new ArrayList<>();
        Collections.sort(list9); //отсортировать коллекцию
        list8.equals(list9); //сравнить листы на равенство ( в Аррэй Листе он перезаписан) равны если в них одинаковые елементы (в том же порядке)
        Iterator<StringBuilder> it = list.iterator(); //проверяет есть ли след обьект в листе и выдает нам его, пока он не будет последним
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //удалим елементы нашего листа
        while (it.hasNext()) { //Есть след елемент?
            it.next(); //выдает нам этот елемент
            it.remove(); //удалем елемент
        }
        list1.removeAll(list2); //удаляет из 1й коллекции все данные которые есть у 1й и у  2й коллекции (которые совпадут)
        list1.retainAll(list2);//сохранит все елементы у 1й коллекции которые (совпадают) есть и у 1й и у 2й коллекции - остальные удалит.
        boolean result = list1.containsAll(list2); // содержит ли 1ая коллекция все теже данные которые есть во 2й кол. тру ор фолс.
        List<StringBuilder> mySublist = list1.subList(1, 3); // добавляет в mySublist все елементры с 1го до 3го индекса. (не включительно! 1-2)
        //это вью в наш арейлист. Это не отдельная сущность.
        Object[] myArray = list1.toArray(); //возвращает массив типа Обьект
        String[] myArray2 =  list11.toArray(new String [5]); //возвращает массив типа Стринг ( вернее создаем его, и влаживаем инфу с Листа)


    }
}
