import java.util.Scanner;
class ATM
{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount)
    {
        this.bankAccount=bankAccount;
    }

    public void displayMenu()
    {
        System.out.println("ATM menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

    }


    public void performTransaction(int choice , Scanner scanner)
    {
        switch(choice)
        {
            case 1:
                System.out.println("Current balance : RS"+bankAccount.getBalance());
                break;

            case 2:
                System.out.println("Enter deposit amount: RS");
                double depositAmount = scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                break;

            case 3:
                System.out.println("Enter withdrawl amount : RS ");
                double withdrawlAmount = scanner.nextDouble();
                bankAccount.withdraw(withdrawlAmount);
                break;

            case 4:
                System.out.println("Exiting ATM. Thank you!");
                scanner.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice .please select a valid option .");
        }
    }
}

