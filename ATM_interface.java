import java.util.Scanner;
//----- THE CLASS WITH MAIN METHOD ------------------------------

public class ATM_interface
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner (System.in);

        System.out.println("Enter initial account balance:");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount= new BankAccount(initialBalance);

        ATM atm = new ATM(bankAccount);

        while(true)
        {
            atm.displayMenu();
            System.out.print("Select an option :");
            int choice= scanner.nextInt();

            atm.performTransaction(choice, scanner);

        }
    }

}

