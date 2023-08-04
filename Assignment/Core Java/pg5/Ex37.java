import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program completed.");
        scanner.close();
    }
}

