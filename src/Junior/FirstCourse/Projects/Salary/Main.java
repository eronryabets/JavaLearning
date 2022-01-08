package Junior.FirstCourse.Projects.Salary;

import static Junior.FirstCourse.Projects.Salary.SalaryBonus.bonus;
public class Main {
    public static void main(String[] args) {
        Engineer eng1 = new Engineer("Ihor","Repair",3000);
        Security sc1 = new Security("Sergio","Watvhing",800);
        Cook ck1 = new Cook("Alex","Cooking",1200);
        bonus(eng1);
        bonus(sc1);
        bonus(ck1);
        eng1.sleep();
        Employee eng2 = new Engineer("Max","Repair",2300);
        eng2.sleep();
//будет работать, так как у нас sleep в интерфейсе, и его наследует Employee, а переопределяет его уже каждый сотрудник

        Journeyman j1 = new Journeyman("Newy","Work",600);
        j1.skills();
        j1.work();
        j1.sleep();
        bonus(j1);

    }
}
