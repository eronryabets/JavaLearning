package Junior.FirstCourse.Projects.Casino;
import static Junior.FirstCourse.Lections.Random.Random.myRandom;

/*
Орел или решка. Если выпадает 1 = выигриывает игрок, если 2 = игрок проигрывает.
Ставка 10 монет. Игрок ставит 10, если выпадает 1 = получает 20 монет, если 2 = теряет свои 10 вложеных.
 */
public class CasinoWithoutStop {
    public static void main(String[] args) {

        int money = 100;
        int count = 0;
        int maxMoney = 0;
        while (money >= 10) {
            money -= 10;
            int coin = myRandom(1,2);
            if (coin == 1){
                money += 20;
            }
            count++;
            if (maxMoney <= money){
                maxMoney = money;
            }
            //System.out.println(money + " coin | count " + count);
        }
        System.out.printf("Игрок проиграл за  %d попыток :) Максимум коинов на руках %d \n", count, maxMoney );
    }
}
