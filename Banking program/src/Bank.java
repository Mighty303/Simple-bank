import java.util.Scanner;

public class Bank {
int balance;
boolean runProgram;

public Bank(int initialBalance){
balance = initialBalance;

}

public static void main(String[] args) {
	boolean runProgram;
	functions Caccount = new functions(0);
	savingsAccount Saccount = new savingsAccount(1000);
	
  System.out.println("You begin with $0 in your chequing account and $1000 in your savings");
  while (runProgram = true) {
	  Caccount.currentBalance();
	  Saccount.currentBalance();
	  System.out.println("Which account would you like to access today?"+"\n"+"1-Chequing"+"\n"+"2-Savings");
	  Scanner scanner = new Scanner(System.in);
	  int account = scanner.nextInt();
    if (account == 1){
      System.out.println("You have chosen to access your chequing account");
      System.out.println("1-Withdraw"+"\n"+"2-Deposit"+"\n");
      int action = scanner.nextInt();
      
      if (action == 1){
    	System.out.println("What amount would you like to withdraw?");
    	int amountWithdrawed = scanner.nextInt();
        Caccount.withdraw(amountWithdrawed);
        
      }
      else if (action == 2){
    	System.out.println("What amount would you like to deposit?");
    	int amountDeposited = scanner.nextInt();
        Caccount.deposit(amountDeposited);
        Caccount.accountActions();
        

      }
    }
    else if (account == 2){
      System.out.println("You have chosen to access your savings account");
      System.out.println("1-Withdraw"+"\n"+"2-Deposit"+"\n");
      int action2 = scanner.nextInt();
      if (action2 == 1){
      	System.out.println("What amount would you like to withdraw?");
      	int amountWithdrawed = scanner.nextInt();
          Saccount.withdraw(amountWithdrawed);
          Saccount.accountActions();
      }
      else if (action2 == 2) {
      	System.out.println("What amount would you like to deposit?");
      	int amountDeposited = scanner.nextInt();
         Saccount.deposit(amountDeposited);
         Saccount.accountActions();
      }

      else {
    	  System.out.println("Invalid input! Please try again");
      }
    }
    else{
      System.out.print("Invalid input! Please Try again");
    }
  }
    }
}



