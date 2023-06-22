
public class Triangle {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getArea() {

		double s = getPerimeter() / 2;
    // Heron's formula.
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println(" Perimeter of the triangle : " + t.getPerimeter());
		System.out.println(" Area of the triangle : " + t.getArea());
	}
}
