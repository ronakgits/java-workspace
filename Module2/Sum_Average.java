import java.util.Scanner;

public class Sum_Average {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in); 

        double n1, n2, n3, n4, n5, sum; 

        System.out.print("Enter Value 1 : "); 
        n1 = sc.nextDouble(); 

        System.out.print("Enter Value 2 : "); 
        n2 = sc.nextDouble(); 
        
        System.out.print("Enter Value 3 : "); 
        n3 = sc.nextDouble(); 
        
        System.out.print("Enter Value 4 : "); 
        n4 = sc.nextDouble(); 
        
        System.out.print("Enter Value 5 : "); 
        n5 = sc.nextDouble(); 

        sum = n1 + n2 + n3 + n4 + n5; 

        System.out.println("Sum is : " + sum);
      
        double avg = sum/5; 

        System.out.println("Average : " + avg);
        
    }
}
