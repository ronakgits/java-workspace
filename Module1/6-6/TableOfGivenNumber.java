import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {

        int num, i, mul; 
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        for(i=1; i<=10; i++)
        {
            mul = num * i; 
            System.out.println(num + " * " + i + " = " + mul);
        }

    }
}

/*
 
Enter Number : 3
3 * 1 = 3 
3 * 2 = 6 
3 * 3 = 9 
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30

*/