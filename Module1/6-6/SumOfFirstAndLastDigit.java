import java.util.Scanner; 

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int num, lastDigit; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        // find last digit 
        lastDigit = num % 10; 

        // find first digit
        while(num >= 10){
            num = num/10; 
        }

        System.out.println("First Digit : " + num);
        System.out.println("Last Digit : " + lastDigit);
        System.out.println("Sum : " + (num + lastDigit));

    }
}
