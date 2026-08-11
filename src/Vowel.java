import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("Vowel");break;
		default:System.out.println("Consonent");break;
		}

	}

}
