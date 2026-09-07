import java.util.Scanner;
class  Rectangle1{
	double length,breadth;
	Rectangle1(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	double area() {
		return length*breadth;
	}
}
public class RetangleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length& breadth ");
		double l=sc.nextDouble();
		double b =sc.nextDouble();
		Rectangle1 r=new Rectangle1(l,b);
		System.out.println("Area of Rectangle :"+r.area());
		sc.close();
		// TODO Auto-generated method stub

	}

}
