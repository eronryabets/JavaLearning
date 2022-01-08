package Junior.FirstCourse.Projects.GasCounter;

import java.io.IOException;

import static Junior.FirstCourse.Projects.GasCounter.Counter.*;


/*
Ввод1 - часы, минуты. кубатура газа. 1-12:24 8038.756;
Ввод2 - часы, минуты. кубатура газа. 1-21:08 8044.476;
input :
1-12:24
8038.756
==
1-21:08
8044.476
Расчет даннвые ввода2 - данные ввода1. = данные расчета ( за Х часов Y минут расход газа = xxx ( на сумму ххх) средняя трата Х.х куба в час)
через регексп отсеять минуты от часов, что бы одной строкой вводить. или так 12 44 8088.88
v1.3 сделать сохранение в файл, и дозапись данных поверх старой инфы.
v1.4  что бы записывалась дата и время
v1.5 переписать что бы можно было вводить дату расчетов, и соотвествии с дня по день расчитывать сколько намотало и стоимость среднюю.
расход в день, расход в час, расход в минуту.(хотя в минуту не нужно я думаю)
1-11:39
8475.383
31-16:05
9046.149
 */
public class Main{

    public static void main(String[] args) throws IOException {

        //===
        System.out.println("Изначально вводим первый день, затем последний!");
        Counter first = new Counter();
        first.createAdmission();
        Counter last = new Counter();
        last.createAdmission();
        resultInfo(first,last);
        //===
        String tg = resultToFile(first,last);
        Logger.log(tg);



    }

}
