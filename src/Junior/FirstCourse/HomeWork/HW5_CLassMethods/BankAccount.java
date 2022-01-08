package Junior.FirstCourse.HomeWork.HW5_CLassMethods;
//для тестового примера сделал статический метод и обычный

public class BankAccount {
    int id;
    String name;
    double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public static double increaseSum(BankAccount account, int amount) {
        //account.balance = account.getBalance() + amount;
        account.balance += amount;
        return account.balance;
    }

    public double increaseSum(int amount) {
        balance += amount;
        return balance;
    }

    public static double decreaseSum(BankAccount account, int amount) {
        account.balance -= amount;
        return account.balance;

    }

    public double decreaseSum(int amount) {
        balance -= amount;
        return balance;

    }

    public static void balanceOnDisplay(BankAccount account) {
        System.out.println(account.name + "'s balance = " + account.balance + ";");
    }

    public void balanceOnDisplay() {
        System.out.println(name + "'s balance = " + balance + ";");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}


