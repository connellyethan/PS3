package MainPackage;

import java.util.Date;

class Account {
	
	//define all variables
	private int id;
	private double balance; 
	private static double annualInterestRate; 
	private Date dateCreated; 

	//set default account
	Account () {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	//constructor with specific id and initial balance
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	java.util.Date date = new java.util.Date();
	
	public Date getDateCreated() {
		return date;
	}

	public void setId(int id) {
		this.id=id;
	}

	public void setBalance(double balance) {
		this.balance= balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//define method getMonthlyInterestRate
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	//define method withdraw
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount<=balance){
			balance -= amount;
		}
		else{

			double short_by = amount - balance;

			throw new InsufficientFundsException(short_by);
		}

		}		


	//define method deposit
	double deposit(double amount) {
		return balance += amount;   
	}

}



