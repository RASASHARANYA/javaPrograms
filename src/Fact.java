import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		long f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
        System.out.println("Factorial of "+n+"is:"+f);
	}

}
