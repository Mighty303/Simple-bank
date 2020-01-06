import java.util.Scanner;

public class functions {
	int balance;
	boolean runProgram;
	
	public functions(int initialBalance) {
		balance = initialBalance;
	}
	
		public void withdraw(int amount){
			int amountWithdrawed = amount;

		  if (balance <= 0) {
			  System.out.println("You have insufficient funds");
			  
		  }
		  else if (balance < amountWithdrawed) {
			  System.out.println("You have insufficient funds");
		  }
		  else if (amountWithdrawed < 20) {
			  System.out.println("You cannot withdraw an amount lower than $20!");
		  }
		  else {
			  balance = balance - amountWithdrawed;
			  System.out.println("Your new balance is $"+ balance);
		  }
		  
		}
		public void deposit(int amount){
			int amountDeposited = amount;
			
		  	if (amountDeposited > 10000) {
		  		System.out.println("You cannot deposit over $10,000 in a day!");
		  	}
		  	else {
		  		balance = balance + amountDeposited;
		  		System.out.println("Your new balance is $"+balance);
		  	}
		}
		public void currentBalance() {
			System.out.println("Your current chequing balance is $"+balance);
		}
		public void accountActions() {
			System.out.println("Is there anything else you would like us to do for you today?(y/n)");
			Scanner scanner = new Scanner(System.in);
			String Continue = scanner.nextLine();
			if (Continue.equals("n")) {
				System.out.println("Have a nice day!");
				System.exit(0);
				
				
			}
			
			
		
		}
	}

