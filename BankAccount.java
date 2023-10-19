//----------------- TSAK 3-ATM INTERFACE ---------------------------

import java.util.Scanner;
class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance=initialBalance;
    }
    public double getBalance()

    {
        return balance;
    }
//    ------------- METHOD FOR DEPOSITING THE AMOUNT INTO ACCOUNT -----------------------

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit of RS" + amount + "Succesfull. Current Balance : Rs " + balance);
        } else
        {
            System.out.println("Invalid deposit amount.");
        }
    }
//    ---------------- METHOD FOR WITHDRAWING THE AMOUNT FROM ACCOUNT -------------------------

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawl of Rs" + amount + "Succesful. Current balance: Rs"+balance);
        }
        else
        {
            System.out.println("Invalid withdrawl amount or insufficient balance.");
        }
    }
}


