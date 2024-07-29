import java.util.Scanner;

public class ATMtask3 {

    private double accountBalance;

    public ATMtask3(double initialBalance) 
    {
        this.accountBalance = initialBalance;
    }

    public void displayBalance() 
    {
        System.out.println("Your current balance is:" + accountBalance);
    }

    public void withdrawAmount(double amount)
     {
        if (amount > accountBalance) {
            System.out.println("Error: Insufficient funds.");
        } 
        else 
        {
            accountBalance -= amount;
            System.out.println("Successfully withdrew:" + amount);
            displayBalance();
        }
    }

    public void depositAmount(double amount) 
    {
            accountBalance += amount;
            System.out.println("Successfully deposited:" + amount);
            displayBalance();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATMtask3 atm = new ATMtask3(10000);

        while (true) {
            System.out.println("ATM facilities:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    atm.displayBalance();
                    break;

                case 2:

                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawal = input.nextDouble();
                    atm.withdrawAmount(withdrawal);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = input.nextDouble();
                    atm.depositAmount(deposit);
                    break;
                case 4:

                    System.out.println("Exiting ATM....");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
