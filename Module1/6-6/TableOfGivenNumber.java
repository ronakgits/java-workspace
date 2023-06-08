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

 
