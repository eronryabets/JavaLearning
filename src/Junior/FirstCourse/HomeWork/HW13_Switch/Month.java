package Junior.FirstCourse.HomeWork.HW13_Switch;

public class Month {
    String name;
    int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public static void getMonthDays(int numberOfMonth) {
        switch (numberOfMonth) {
            case 2 :
                System.out.println( numberOfMonth + " this is month have 28 days.");
                break;
            case 4 :
            case 6 :
            case 8 :
            case 9 :
            case 11 :
                System.out.println( numberOfMonth + " this is month have 30 days.");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 10 :
            case 12 :
                System.out.println( numberOfMonth + " this is month have 31 days.");
                break;
            default:
                System.out.println("Wrong format.");
        }

    }

    public static void getYearPeriod(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1 :
            case 2 :
            case 12 :
                System.out.println( numberOfMonth + " this is month of Winter.");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println(numberOfMonth + " this is month of Spring.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println(numberOfMonth + " this is month of Summer.");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println(numberOfMonth + " this is month of Autumn.");
                break;
            default:
                System.out.println("Wrong format.");
        }

    }

    public static void getDaysAndPeriodOfMonth(int numberOfMonth){
        getMonthDays(numberOfMonth);
        getYearPeriod(numberOfMonth);
    }

}


/*

1) January - 31 - winter
2) February - 28 - winter
3) March - 31 - spring
4) April - 30 - spring
5) May - 31 - spring
6) June - 30 - summer
7) July - 31 - summer
8) August - 30 - summer
9) September - 30 - autumn
10) October - 31 - autumn
11) November - 30 - autumn
12) December - 31 - winter

28 days - 2 February;
30 days - 4 April; 6 June; 8 August; 9 September; 11 November;
31 days - 1 January; 3 March; 5 May; 7 July; 10 October; 12 December;
 */