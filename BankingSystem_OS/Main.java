public class Main {
    public static void main (String[] args){
        BankSystem system = new BankSystem();

        System.out.println("\n=== Welcome to OS Banking System ===");
            system.accountCreation();

        if (system.login()){
            system.mainSystem();
        }
    }
}
