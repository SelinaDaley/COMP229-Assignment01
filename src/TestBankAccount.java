
public class TestBankAccount {

	public static BankAccount bankAccount = new BankAccount("300792","John Smith", 230.11);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount.getAccountInfo();
		
		bankAccount.withdraw(50.50);
		System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getOwnersName() + " " + bankAccount.getBalance());
		
		bankAccount.deposit(100.25);
		bankAccount.getAccountInfo();
	}

}
