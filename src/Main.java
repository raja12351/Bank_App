// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HDFCBankAccount obj = new HDFCBankAccount(500);
        System.out.println(obj.getAccountNumber());
        obj.addMoney(300);
        System.out.println(obj.checkBalance());
        obj.withdrawMoney(200);
        System.out.println(obj.getROI());
        System.out.println(obj.getTotalInterest(500,2));
        System.out.println(obj.checkBalance());
    }
}