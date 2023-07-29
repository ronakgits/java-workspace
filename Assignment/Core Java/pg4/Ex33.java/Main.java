public class Main {
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
