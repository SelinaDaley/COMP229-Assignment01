
public class BankAccount {
	//Variables
	private String _accountNumber;
	private String _ownersName;
	private double _balance;
	
	//Getters and setters
	public String getAccountNumber() {
		return _accountNumber;
	}

	public String getOwnersName() {
		return _ownersName;
	}

	public double getBalance() {
		return _balance;
	}

	public void withdraw(double _balance) {
		this._balance -= _balance;
	}
	
	public void deposit(double _balance) {
		this._balance += _balance;
	}
	
	//Constructors
	public BankAccount(String accountNumber, String ownersName, double balance)
	{
		this._accountNumber = accountNumber;
		this._ownersName = ownersName;
		this._balance = balance;
	}

	//Methods
	public void getAccountInfo()
	{
		System.out.printf("Account Number: %s, Owner: %s, Balance: %s%n",
				this._accountNumber, this._ownersName, this._balance);
		
	}
}
