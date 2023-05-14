import java.util.UUID;

public class SBIBankAccount implements BankAccount{
    private String AccountNumber;
    private int age;
    private int balance;
    private int roi;
    //age 45 and below : 5%
    //age 45 - 68 : 6%
    //68 and above : 7%

    public SBIBankAccount(int age, int balance) {
        this.age = age;
        this.balance = balance;
        this.AccountNumber = String.valueOf(UUID.randomUUID());
        if(this.age < 45){
            this.roi = 5;
        }
        else if(this.age >=45 && this.age < 68){
            this.roi = 6;
        }
        else{
            this.roi = 7;
        }
    }

    public SBIBankAccount(int age, int balance, int roi) {
        this.age = age;
        this.balance = balance;
        this.AccountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
