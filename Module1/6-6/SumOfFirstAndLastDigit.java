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

/*

first solve the problem 
after code them 

Output: 

num = 134 
first digit = 1 
last digit = 4 

sum = 5 

=> find first digit 

    n = firstDigit 

    while(n >= 10)
    {
        n = n/10;
    }

    // 13.4 
    // 1.34

    n = 1


=> find last digit 

    num ne 10 vade divide kari 
    reminder ave te last digit 

    // for print division 
    num / 10 

    // for print reminder 
    num % 10


    using % 

    // reminder is 4 
    134 % 10 = 4 









 */
