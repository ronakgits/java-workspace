class Area extends Shape {

    @Override
    public double RectangleArea(double length, double breadth) {

        return length * breadth;
    }

    @Override
    public double SquareArea(double side) {

        return side * side;
    }

    @Override
    public double CircleArea(double radius) {

        return Math.PI * radius * radius;
    }
}

abstract class Shape {
    
    public abstract double RectangleArea(double length, double breadth);

    public abstract double SquareArea(double side);

    public abstract double CircleArea(double radius);
}


public class Ex33 {

    public static void main(String[] args) {

        Area areaObj = new Area();

        double rectangleArea = areaObj.RectangleArea(5, 3);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double squareArea = areaObj.SquareArea(4);
        System.out.println("Area of Square: " + squareArea);

        double circleArea = areaObj.CircleArea(3);
        System.out.println("Area of Circle: " + circleArea);
    }
}
