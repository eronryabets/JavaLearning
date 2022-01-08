package Junior.FirstCourse.Lections.Les15WhileLoop;
import static Junior.FirstCourse.Lections.Random.Random.myRandom;
/*
Орел или решка. Если выпадает 1 = выигриывает игрок, если 2 = игрок проигрывает.
Ставка 10 монет. Игрок ставит 10, если выпадает 1 = получает 20 монет, если 2 = теряет свои 10 вложеных.
 */
public class Casino {
    public static void main(String[] args) {

        int money = 100;
        int count = 0;
        int maxMoney = 0;
        int stop = myRandom(0,500);
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
            System.out.println(money + " coin | count " + count);
            if (count == stop){
                break;
            }

        }
        if (money > 100){
            System.out.println("Выигрыш игрока за все игры : " + (money - 100) + " коинов.");
            System.out.printf("Всего было %d попыток :) Максимум коинов на руках %d \n", count, maxMoney );
            System.out.printf("Игрок решил остановится на %d игре \n", stop);
        }
        else if(money < 100 ){
            System.out.println("Игрок проиграл своих : " + (100 - money) + " коинов.");
            System.out.printf("Всего было %d попыток :) Максимум коинов на руках %d \n", count, maxMoney );
            if(money == 0){
                System.out.println("Игрок не решился вовремя остановится");
            }
            else {
                System.out.printf("Игрок решил остановится на %d игре \n", stop);
            }
        }
        else if (money == 100 ){
            System.out.println("Игрок ушел с тойже суммой что и пришел : " + 100);
            System.out.printf("Всего было %d попыток :) Максимум коинов на руках %d \n", count, maxMoney );
            System.out.printf("Игрок решил остановится на %d игре \n", stop);
        }


    }
}
