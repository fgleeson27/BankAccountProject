public class BankTester
{

	public static void main(String[] args)
	{

		Bank harrysChecking = new Bank();
		Bank mySavings = new Bank(1000);

		harrysChecking.deposit(2000);
		mySavings.deposit(999);
		System.out.println(mySavings.getBalance());

		harrysChecking.withdraw(500);
		mySavings.withdraw(1001);

		System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 1500");      
	}
}
