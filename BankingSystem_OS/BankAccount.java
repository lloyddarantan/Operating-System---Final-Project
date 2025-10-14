public class BankAccount extends User {
    private double balance;

    public BankAccount(String firstName, String lastName, int pin, double initialBalance){
        super(firstName, lastName, pin);
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
                System.out.println("Deposited: P" + amount);
                System.out.println("Current Balance: P" + balance);
        } else {
                System.out.println("Enter a valid amount to deposit.");
        }
    }

    public void withdraw (double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
                System.out.println("Withdrawn: P" + amount);
                System.out.println("Current Balance: P" + balance);
        } else if (amount > balance) {
                System.out.println("Insufficient Balance.");
        } else {
                System.out.println("Enter a valid amount to withdraw.");
        }
    }

    public void checkBalance (){
        System.out.println("Current Balance: P" + balance);
    }
}
