package MainPackage;

public class Test{
	
	public static void main(String[] args) throws InsufficientFundsException{
	
		Account account = new Account(1122, 20000);

		account.setAnnualInterestRate(.045);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		System.out.println("Balance is: " + account.getBalance());
		
		System.out.println("Monthly interest is: " + account.getMonthlyInterestRate());
		
		System.out.println("Date Created: " + account.getDateCreated());
		
	}

}
