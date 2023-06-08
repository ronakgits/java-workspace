import java.util.Scanner;

public class ReverseOrderOfNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int num, m, rev=0; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        while(num>0)
        {
            m = num % 10; 
            rev = (rev*10) + m; 
            num = num/10; 
        }
        System.out.println("Reverse value is : " + rev);

    }    
}

