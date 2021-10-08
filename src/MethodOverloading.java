
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Area of rectangle: " + area(14.25d, 10.5d));
		System.out.println("Area of rectangle: " + area(5.0d));
		System.out.println("Area of rectangle: " + area(5));
		
		printSomething("hoge", 15);

	}
	
	public static double area(double length, double width) {
		return length * width;
	}
	
	public static double area(double side) {
		return side * side;
	}
	
	public static int area(int side) {
		return side * side;
	}
	
	public static void printSomething(String s, int num) {
		System.out.printf("%s %d%n", s, num);
	}

}
