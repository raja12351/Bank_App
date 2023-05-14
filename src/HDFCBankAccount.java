import java.util.UUID;

public class HDFCBankAccount implements BankAccount{
    private String accountNumber;
    private int balance;
    private int roi;  // default 5% if nothing is given

    public HDFCBankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public HDFCBankAccount(int balance, int roi) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    @Override
    public boolean withdrawMoney(int money){
        if(this.balance >= money){
            this.balance -= money;
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInyears) {
        return amount * timeInyears * roi / 100;
    }
}
// roi should be dependent on age more age -> more roi --> homework

