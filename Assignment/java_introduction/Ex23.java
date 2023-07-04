import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] a) {
    
        Scanner sc = new Scanner(System.in); 

        System.out.println("\n => Find out the Area of: ");
        System.out.println("\n 1. Triangle \n 2. Rectangle \n 3. Circle");
            
        System.out.print("\n Enter Any One : ");
        int choice = sc.nextInt(); 

        System.out.println("--------------------");

        switch(choice)
        {
            case 1: 

                float base, height, areaOfTriangle; 

                System.out.print(" Enter Base : ");
                base = sc.nextFloat(); 

                System.out.print(" Enter Height : ");
                height = sc.nextFloat(); 

                areaOfTriangle = (base * height) / 2; 

                System.out.print(" Area of Triangle is : " + areaOfTriangle);

                break; 

            case 2: 
                float length, breadth, areaOfRectangle; 

                System.out.print(" Enter Length of Rectangle : ");
                length = sc.nextFloat(); 

                System.out.print(" Enter Breadth of Rectangle : ");
                breadth = sc.nextFloat(); 

                areaOfRectangle = length * breadth; 

                System.out.println(" Area of Rectangle is : " + areaOfRectangle);
                break; 

            case 3: 

                System.out.print(" Enter Radius : ");
                int radius = sc.nextInt(); 

                double pi = 3.142, areaOfCircle; 

                areaOfCircle = pi * radius * radius; 

                System.out.println(" Area of Circle is : " + areaOfCircle);
                break; 

            default: 
                System.out.println("\n INVALID VALUE...");
                break; 
        }
    }

}
