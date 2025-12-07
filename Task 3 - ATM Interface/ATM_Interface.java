import java.util.Scanner;
class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit Successful! Current Balance: ₹" + balance);
        } else
        {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance)
        {
            System.out.println("Insufficient Funds!");
        } else
        {
            balance -= amount;
            System.out.println("Withdrawal Successful! Remaining Balance: ₹" + balance);
        }
    }
}

class ATM
{
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account)
    {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void start()
    {
        while (true)
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try
            {
                choice = sc.nextInt();
            } catch (Exception e)
            {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice)
            {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!!!");
                    return;

                default:
                    System.out.println("Invalid choice! Enter a number (1-4)");
            }
        }
    }

    private void checkBalance()
    {
        System.out.println("Your Current Balance: ₹" + account.getBalance());
    }

    private void deposit()
    {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw()
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}

public class ATM_Interface
{
    public static void main(String[] args)
    {
        BankAccount userAcc = new BankAccount(5000); // starting balance
        ATM atm = new ATM(userAcc);
        atm.start();
    }
}
