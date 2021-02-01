package Lab_06_DefiningClasses.P03_BankAccount;

public class BankAccount {
    private int id;
    private double balance;
    private final static double DEFAULT_INTEREST_RATE = 0.2;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}
