abstract class Shape{
	void display() {
		System.out.println("Shape base class");
		
	}
	abstract double area();
}
class Rectangle extends Shape{
	double l,b;
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
		
	}
	double area() {
		return l*b;
		
	}
}
class Circle11 extends Shape{
	double r; 
	Circle11(double r){
		this.r=r;
		
	}
	double area() {
		return Math.PI*r*r;
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(12,5);
		System.out.println("Area of rectangle:"+r.area());
		Circle11 c=new Circle11(12.50);
		System.out.println("Area of Circle:"+c.area());
		// TODO Auto-generated method stub

	}

}
