public interface BankAccount {
    //withdraw money
    boolean withdrawMoney(int money);
//    add money
    boolean addMoney(int money);
//    checkBalance
    int checkBalance();
//    get rate of interest
    int getROI();
//    get total interest
    int getTotalInterest(int amount , int timeInyears);
}
