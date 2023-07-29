public class Ex38 {

    public static void main(String[] args) {

        try 
        {
            int[] a = new int[5];

            try {
                a[5] = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Error - Division by zero is not allowed.");
            }

        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Outer Catch: Error - Array index out of bounds.");
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program completed.");
    }
}
