
import java.util.Scanner;

public class Ex7 
{
    
    public static void main(String[] args) {
        
        float s1, s2, s3, s4, s5, sum;
        int total = 500;  
        double percentage; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter Marks ");

        System.out.print(" Subject 1 : ");
        s1 = sc.nextFloat(); 
        
        System.out.print(" Subject 2 : ");
        s2 = sc.nextFloat(); 

        System.out.print(" Subject 3 : ");
        s3 = sc.nextFloat(); 

        System.out.print(" Subject 4 : ");
        s4 = sc.nextFloat(); 

        System.out.print(" Subject 5 : ");
        s5 = sc.nextFloat(); 

        sum = s1 + s2 + s3 + s4 + s5; 

        System.out.println("\n Sum : " + sum);

        percentage = (sum * 100)/total; 

        System.out.println(" Percentage : " + percentage);

    }
}
