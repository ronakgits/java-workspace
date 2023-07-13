import java.util.Scanner; 

public class Ex14 {

    public static void main(String[] a) 
    {
        
        Scanner sc = new Scanner(System.in);

        int num, factorial=1; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        for(int i=1; i<=num; i++)
        {
            factorial = factorial * i; 
            System.out.println(factorial);
        }
        System.out.println("Factorial : " + factorial);
    }
}


