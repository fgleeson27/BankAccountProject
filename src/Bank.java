public class Bank
{  

	private double balance;


	public Bank()
	{   
		balance = 0;
	}


	public Bank(double initialBalance)
	{   
		balance = initialBalance;
	}


	public void deposit(double amount)
	{  
		balance = balance + amount;
	}


	public void withdraw(double amount)
	{   
		if (balance > amount) {
			balance = balance - amount;
			
		}
		
		else {
			System.out.println("Balance is not enough");
		}
			
		
	}


	public double getBalance()
	{   
		return balance;
	}
}




