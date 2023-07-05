import java.util.Scanner;

public class Ex17 {
    public static void main(String[] r) 
    {
        
        Scanner sc = new Scanner(System.in); 

        int number, remainder, reverse = 0; 

        System.out.print("Enter numberber : ");
        number = sc.nextInt(); 

        while(number != 0)
        {
            remainder = number % 10; 
            reverse = (reverse*10) + remainder; 
            number = number/10; 
        }
        System.out.println("Reverse value is : " + reverse);

    }    
}
