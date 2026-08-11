class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	
	void setAccountDetails(int accountNo,String accountType,int accountBalance) {
		this.accountNo=accountNo;
		this.accountBalance=accountBalance;
		
	}
	void withdraw(int amount) {
		if(accountBalance>amount)
		this.accountBalance-=amount;
		else
			System.out.println("InsufficientBalance");
	}
		void deposit(int amount) {
			this.accountBalance+=amount;
		}
			
	
	void dispAccountDetails() {
		System.out.println("Account No:"+accountNo+"Type:"+accountType+"Balance:"+accountBalance);
	}
}
public class AccountDemo {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccountDetails(123456, "SB", 10000);
		a1.dispAccountDetails();
		a1.deposit(1000);
		a1.dispAccountDetails();
		a1.withdraw(15000);
		a1.dispAccountDetails();
		a1.withdraw(5000);
		a1.dispAccountDetails();
		
		// TODO Auto-generated method stub

	}

}
