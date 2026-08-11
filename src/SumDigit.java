import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r,sum=0,t;
		t=n;
		while(n>0) {
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("Sum of digits "+t+" is "+sum);

	}

}
