
public class savingsAccount extends functions {
	int Sbalance;
	

	public savingsAccount(int initialBalance) {
		super(initialBalance);
		Sbalance = initialBalance;
		
	}
	public void deposit(int amount){
		int amountDeposited = amount;
		
	  	if (amountDeposited > 10000) {
	  		System.out.println("You cannot deposit over $10,000 in a day!");
	  	}
	  	else {
	  		Sbalance = Sbalance + amountDeposited;
	  		System.out.println("Your new savings balance is $"+Sbalance);
	  	}
	}

	public void withdraw(int amount){
		int amountWithdrawed = amount;

	  if (Sbalance <= 0) {
		  System.out.println("You have insufficient funds");
		  
	  }
	  else if (Sbalance < amountWithdrawed) {
		  System.out.println("You have insufficient funds");
	  }
	  else if (amountWithdrawed < 20) {
		  System.out.println("You cannot withdraw an amount lower than $20!");
	  }
	  else {
		  Sbalance = Sbalance - amountWithdrawed;
		  System.out.println("Your new savings balance is $"+ Sbalance);
	  }
	  
	}
	public void currentBalance() {
		System.out.println("Your current savings balance is $"+Sbalance);
	}
}