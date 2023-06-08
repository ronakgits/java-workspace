import java.util.Scanner;

public class ReverseOrderOfNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int num, m, rev=0; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        // 0 thi mota 
        while(num>0)
        {
            // num ne 10 vade divide kari modulo ne a ma store kari 
            m = num % 10; 

            // (0*10) + modulo; 
            rev = (rev*10) + m; 

            num = num/10; 
        }

        System.out.println("Reverse value is : " + rev);

    }    
}

/* 
 
Enter Number : 123
Reverse value is : 321

 */