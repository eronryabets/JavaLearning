package Junior.FirstCourse.Projects.GasCounter;

/*
Ввод1 - часы, минуты. кубатура газа. 12:24 8038.756;
Ввод2 - часы, минуты. кубатура газа. 21:08 8044.476;
Расчет даннвые ввода2 - данные ввода1. = данные расчета ( за Х часов Y минут расход газа = xxx ( на сумму ххх) средняя трата Х.х куба в час)

через регексп отсеять минуты от часов, что бы одной строкой вводить. или так 12 44 8088.88

 */
public class Bcp{

//
//    public static void main(String[] args) throws IOException {
//        Counter first = new Counter();
//        first.createAdmission(first);
//        Counter last = new Counter();
//        last.createAdmission(last);
//
//        double  gasAmount = last.getValueGas() - first.getValueGas();
//        double timeHoursAmount = last.getTime().getHour() - first.getTime().getHour();
//        double timeMinutesAmount = last.getTime().getMinute() - first.getTime().getMinute();
//
//        double timeAllMinutes = (timeHoursAmount*60) + timeMinutesAmount;
//        double gasInMinute = gasAmount / timeAllMinutes;
//        double gasInHour = gasInMinute * 60;
//        double gasAllCost = gasAmount * gasCost;
//        double gasHourCost = gasInHour * gasCost ;
//        double gasMinuteCost = gasInMinute * gasCost * 100;
//
//        if (first.getTime().getMinute() < 10 && last.getTime().getMinute() < 10) {
//            System.out.println("Расчет с " + first.getTime().getHour() +":0" + first.getTime().getMinute() + " до " + last.getTime().getHour() +":0"+last.getTime().getMinute() + "." );
//        } else if (first.getTime().getMinute() < 10 && last.getTime().getMinute() >= 10) {
//            System.out.println("Расчет с " + first.getTime().getHour() +":0" + first.getTime().getMinute() + " до " + last.getTime().getHour() +":"+last.getTime().getMinute() + "." );
//        } else if (first.getTime().getMinute() >= 10 && last.getTime().getMinute() < 10){
//            System.out.println("Расчет с " + first.getTime().getHour() +":" + first.getTime().getMinute() + " до " + last.getTime().getHour() +":0"+last.getTime().getMinute() + "." );
//        } else if (first.getTime().getMinute() > 10 && last.getTime().getMinute() > 10){
//            System.out.println("Расчет с " + first.getTime().getHour() +":" + first.getTime().getMinute() + " до " + last.getTime().getHour() +":"+last.getTime().getMinute() + "." );
//        }
//
//        System.out.println("За " + (int)timeAllMinutes/60 + " часов  : " + (int)timeAllMinutes%60 + " минут.");
//        System.out.println("Насчитано " + String.format("%.3f",gasAmount) + " кубов газа (стоимостью на " + String.format("%.2f",gasAllCost) + " грн);"  );
//        System.out.println("Среднее потребление в час " + String.format("%.3f",gasInHour) + " кубов ( на " + String.format("%.3f",gasHourCost) + " грн)" +
//                "\n в минуту " + String.format("%.3f",gasInMinute) + " кубов  (на " + String.format("%.2f",gasMinuteCost) +  " копеек);"  );
//        System.out.println("Всё :)");
//
//    }

}
