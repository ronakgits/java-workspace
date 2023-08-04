
class Shape {

    public void displayShape() {

        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape {

    public void displayShape() {

        System.out.println("This is rectangular shape.");
    }
}

class Circle extends Shape {

    public void displayShape() {

        System.out.println("This is circular shape.");
    }
}

class Square extends Rectangle {

    public void displayShape() {

        System.out.println("Square is a rectangle.");
    }
}

public class Ex35 {

    public static void main(String[] args) {
        
        Square squareObj = new Square();

        squareObj.displayShape();
        squareObj.displayShape();
    }
}
