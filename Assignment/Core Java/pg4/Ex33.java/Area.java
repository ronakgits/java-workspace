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
