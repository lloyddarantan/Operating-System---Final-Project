public class Validation {
    
    public static boolean validPin (String pin){
        return pin.matches("^[0-9]{4}$");
    }

    public static boolean validAmount (double amount){
        return amount > 0;
    }

    public static boolean validLogin (BankAccount account, int bankNumber, int pin){
        return account.getBankNumber() == bankNumber && account.getPin() == pin;
    } 

    public static String returnMsg(String msg){
        return "Invalid " + msg + ". Try again.";

    }

}
