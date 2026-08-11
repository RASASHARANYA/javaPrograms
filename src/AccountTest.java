import java.util.Scanner;
class Customer{
	int custId;
	String custName,custAddress;
	Customer(int custId,String custName,String custAddress){
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		
	}
	void display() {
		System.out.println("Customer Id: "+custId+" Customer Name: "+custName+" Customer Address: "+custAddress);
	}
}
class Account4{
	int acctId;
	String acctType;
	Customer cust;
	double acctBalance;
	
	
	Account4(int acctId, String acctType, Customer cust, double acctBalance){
		this.acctId=acctId;
		this.acctType=acctType;
		this.cust=cust;
		this.acctBalance = acctBalance;
		}
	void display() {
		cust.display();
		System.out.println("Account Id: "+acctId+"Account Type: "+acctType+" Accont Balance: "+acctBalance);
	}
	}
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id,Name,Address: ");
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        String addr=sc.nextLine();
        Customer c=new Customer(id,name,addr);
        System.out.println("Enter Account Id,Type, Balance");
        int aid=sc.nextInt();
        sc.nextLine();
        String type=sc.nextLine();
        double bal=sc.nextDouble();
        Account4 acc=new Account4(aid,type,c,bal);
        acc.display();
        sc.close();
        
	}       
}
