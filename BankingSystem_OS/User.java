class User {
    private static int nextBankNumber = 100000;
    private String firstName;
    private String lastName;
    private int bankNumber;
    private int pin;

    public User (String firstName, String lastName, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankNumber = nextBankNumber++;
        this.pin = pin;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public int getPin() {
        return pin;
    }
}