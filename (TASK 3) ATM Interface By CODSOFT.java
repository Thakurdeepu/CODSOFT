import java.util.Scanner;

// CREATING A CLASS TO REPRESENT THE ATM MACHINE 
public class Atm {
    private static Scanner sc;
    private static float balance=0;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("\nWELCOME TO YOUR ATM MACHINE\n");
        Transaction();
    }
    
    // METHOD FOR TRANSACTION 
    private static void Transaction()
    {
    int choice;
    System.out.println("\nPLEASE CHOOSE AN OPTION\n ");
    System.out.println("Press 1 for Withdraw ");
    System.out.println("Press 2 for Deposite");
    System.out.println("Press 3 for CheckBalance");
    System.out.println("press 4 for exit");
    choice =sc.nextInt();
    user_bank_account obj=new user_bank_account();
    switch(choice)
    {
        case 1: // amount withdrawn case
                System.out.println("enter the amount for withdrawing");
                int amount=sc.nextInt(); 
                obj.withdraw(amount);
        break;
        case 2: //amount deposited case
                System.out.println("enter the amount you want to deposite ");
                int NetAmount = sc.nextInt();
                obj.deposite(NetAmount);
        break;
        case 3: // for checking balance
               obj.CheckBalance();
        break;
        case 4: // case for exit out from the program
            System.out.println("THANK YOU FOR CHOOSING OUR SERVICES ");
            System.exit(0);
        default:
            System.out.println("we do not have this choice please enter some valid choice");
            AgainTransaction();
        break;
    }
    }

    // CODE FOR FACILITATE USER FOR MORE TRANSACTIONS 
    private static void AgainTransaction()
    {
        System.out.println("\nPRESS 1 FOR MORE TRANSACTION ELSE PRESS ANY KEY FOR EXIT ");
        int choice = sc.nextInt();
        if(choice==1)
        {
            Transaction();
        }
        else
        {
            System.out.println("THANK YOU FOR CHOOSING OUR SERVICES");
        }
    }
   
    // CLASS TO STORE ACCOUNT BALANCE OF USER
    static class  user_bank_account{
    void withdraw(int amount)  // method for withdrawing amount
    {
        if(amount>balance) // Validating user input to ensure it is within acceptable limits or not
        {    
            System.out.println("your amount can not be withdrawn due to insufficent amount");
            AgainTransaction();
        }
        else
        {
            balance=balance-amount;
            System.out.println("Your account has debited succesfully with amount "+amount);
            AgainTransaction();
        }
    }
    void deposite(int NetAmount) // method for depositing amount
        {
            balance=balance+NetAmount;
            System.out.println("Your account has credited successfully with amount "+NetAmount);
            AgainTransaction();
        }
    void CheckBalance() // method for checking balance amount
        {
            System.out.println("your available account balance is "+ balance);
            AgainTransaction();
        }
    }   
    
}
