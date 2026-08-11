import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int r=sc.nextInt();
		System.out.println("Enter Column size");
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				System.out.println("mat["+i+"]["+j+"]");
				mat[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(mat[i][j]+" ");
				
			}
			System.out.println("");
		}
	}
}