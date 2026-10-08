import java.util.*;
public class BankAccount
{
    static double deposit;
    static double withdraw;
    static double balance;
    static String name;
    static String accno ;
    BankAccount(double d , double w)
    {
        deposit = d;
        withdraw = w;
    }
    static double checkBalance()
    {  
        if(withdraw < (balance + deposit))
        {
            balance = balance + deposit - withdraw;
            return balance;
        }
        else
        {
            System.out.println("Insufficient Balance");
            System.out.println("--------------------------------");
            return balance;
        }
    }
    static void displayAccount()
    {
         System.out.println("Holder Name: "  +  name);
         System.out.println("Account Number: "  +  accno);
         System.out.println("Deposit Amount: "  +  deposit);
         System.out.println("Withdrawl Amount: "  +  withdraw);
         System.out.println("Balance: "  +  balance);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Holder Name");
        name = sc.nextLine();
        System.out.println("Enter Account Number");
        accno = sc.nextLine();
        System.out.println("Enter Balance");
        balance = sc.nextDouble();
        System.out.println("Enter Deposit Amount");
        deposit = sc.nextDouble();
        System.out.println("Enter Withdrawl Amount");
        withdraw = sc.nextDouble();
        System.out.println("--------------------------");
        
        BankAccount.checkBalance();
        BankAccount.displayAccount();
        
        sc.close();
    }
}