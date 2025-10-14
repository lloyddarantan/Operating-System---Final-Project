import java.util.*;

public class BankSystem {
    private Scanner scan = new Scanner(System.in);
    private BankAccount account;

    public void accountCreation(){

        System.out.println("\n=== Creating Account... ===");    

        System.out.print("Enter First Name: ");
            String firstName = scan.nextLine();

        System.out.print("Enter Last Name: ");
            String lastName = scan.nextLine();

        int pin;
        while(true){
            System.out.print("Enter a 4-digit PIN: ");
                String pinInput = scan.nextLine();

            if (Validation.validPin(pinInput)){
                pin = Integer.parseInt(pinInput);
                break;
            } else {
                System.out.println(Validation.returnMsg("length, limit to 4 digits"));
            }
        }
        
        account = new BankAccount (firstName, lastName, pin, 0.0);
            System.out.println("\nAccount created successfully!");
            System.out.println("Account Name: " + account.getName());
            System.out.println("Bank Number: " + account.getBankNumber());
    }

    public boolean login() {
        System.out.println("\n=== Log In... ===");

        while(true){
            System.out.print("Enter Bank Number: ");
                int confirmBankNumber = scan.nextInt();

            System.out.print("Enter Pin: ");
                int confirmPin = scan.nextInt();

                if (Validation.validLogin(account, confirmBankNumber,confirmPin)){
                    System.out.println("\nLogin successful! Welcome, " + account.getName() + "!");
                    return true;
                } else {
                    System.out.println(Validation.returnMsg("bank number or pin"));
                }
        }
    }

    public void mainSystem(){
        boolean running = true;

        while (running) {
            System.out.println("=== Banking Menu ===");
            System.out.println("[1] Deposit");
            System.out.println("[2] Withdraw");
            System.out.println("[3] Check Balance");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        while(true){
                            System.out.print("Enter amount to be deposited: ");
                                int depositAmount = scan.nextInt();

                                    if (Validation.validAmount(depositAmount)){
                                        account.deposit(depositAmount);
                                        break;
                                    } else {
                                        System.out.println(Validation.returnMsg("amount"));
                                    }      
                            } 
                        break;
                    case 2:

                        while(true){
                            System.out.print("Enter amount to be withdrawn: ");
                                int withdrawAmount = scan.nextInt();
                                
                                    if (Validation.validAmount(withdrawAmount)){
                                        account.withdraw(withdrawAmount);
                                        break;
                                    } else {
                                        System.out.println(Validation.returnMsg("amount"));
                                    }      
                            } 
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.print("Thank you");
                        running = false;
                        break;    
                    default:
                        System.out.println(Validation.returnMsg("input"));
                        break;
                }

                if (running) {
                System.out.println("\nWould you like to choose again? (y/n): ");
                char again = scan.next().toLowerCase().charAt(0);
                if (again != 'y') {
                    running = false;
                    System.out.println("Thank you for using the banking system!");
                }
            }
        }
    }
}
