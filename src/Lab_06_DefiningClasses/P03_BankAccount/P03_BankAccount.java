package Lab_06_DefiningClasses.P03_BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P03_BankAccount {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> vault = new HashMap<>();

        String input = reader.readLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            String output;
            switch (tokens[0]) {
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    vault.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                    break;

                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[2]);
                    BankAccount.setInterestRate(newInterest);
                    output = null;
                    break;

                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    double interest = vault.get(id).getInterest(years);
                    output = String.format("%.2f", interest);
                    break;

                default:
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    output = "Account " + bankAccount.getId() + " created";
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }
            input = reader.readLine();
        }
    }
}
