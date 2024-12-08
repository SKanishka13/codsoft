import java.util.Scanner;
public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}

class ATM {
    private BankAccount account;

    public ATM (BankAccount account){
        this.account =account;
    }

    public void run(){
        while (true) {
            System.out.println("\n ATM menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
             
            Scanner sc= new Scanner(System.in);
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("your current balance is :" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited: ");
                    double damount = sc.nextDouble();
                    account.deposit(damount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    double wamount =sc.nextDouble();
                    account.withdraw(wamount);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. please try again.");
                    break;
            }
            sc.close();
        }
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        }
    public boolean deposit(double amount){
        balance += amount;
        System.out.println("Successfully deposited: "+amount);
        return true;
        }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Successful withdraw: ");
        }else{
            System.out.println("insufficient balance");
        }
        return true;
    }
    public double getBalance(){
        return balance;
    }
}
