
import java.util.Scanner;
public class Leap{

	public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year:");
	int year=sc.nextInt();
	if(year%400==0) {
		
		System.out.println("leap year");
		
	}
	else
	{
		System.out.println("not a leap year");
	}
	
}



	}


