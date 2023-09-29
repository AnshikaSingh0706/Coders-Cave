import java.util.Scanner;

public class ATM_Interface{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

while(true)
    {
    System.out.println("ATM Machine !!\n");
    System.out.println("Choose 1 for Withdraw");
    System.out.println("Choose 2 for Deposit");
    System.out.println("Choose 3 for Check your Balance");
    System.out.println("Choose 4 for EXIT");
    System.out.print("Choose the Operation....");
    
    int choice = sc.nextInt();

    switch(choice)
    {
        case 1: 
        System.out.print("Enter money to be withdraw:");
        withdraw = sc.nextInt();
        if(balance>=withdraw)
        {
        balance = balance - withdraw;
        System.out.println("Please take your money !!");
        }
        else
        {
          System.out.println("Insufficient Balance !!");
        }
        System.out.println("");
       break;

       case 2:
       System.out.println("Enter money to be Deposit:");
       deposit = sc.nextInt();

       balance = balance + deposit;
       System.out.println("Your Money has been successfully deposit !! ");
       System.out.println("");
      break;

      case 3: 
      System.out.println("Your Total Balance is :"+balance);
      System.out.println("");
      break;

     case 4:
     System.exit(0);
 }
}
}
}

