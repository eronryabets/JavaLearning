package Junior.FirstCourse.HomeWork.HW5_CLassMethods;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount petro = new BankAccount(1,"Petro",500);
        BankAccount alex = new BankAccount(2,"Alex",100);

        BankAccount.decreaseSum(petro,100);
        BankAccount.balanceOnDisplay(petro);
        BankAccount.increaseSum(petro,222);
        BankAccount.balanceOnDisplay(petro);

        alex.increaseSum(777);
        alex.balanceOnDisplay();

        //вопрос, правильнее же такие методы статическими делать, верно?
    }
}
