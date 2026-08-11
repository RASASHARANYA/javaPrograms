
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("Enter"+(i+1)+"st/rd/th number:");
			n=sc.nextInt();
			sum+=n;
			
		}
		System.out.println("sum:"+sum);
		

	}

}
