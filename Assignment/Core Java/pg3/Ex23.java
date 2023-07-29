
public class Ex23 {
	
	// area of Square 
	public static void printArea(double side) {
		
		double areaOfSquare = side * side; 
		System.out.println("Area of Side: " + areaOfSquare);
	}
	// area of Rectangle
	public static void printArea(double length, double breadth ) {
		
		double areaOfRectangle = length * breadth; 
		System.out.println("Area of Rectangle is: " + areaOfRectangle);
	}

	
	public static void main(String[] args) {
		
		printArea(10); 
		printArea(10,20);	
	}
}

