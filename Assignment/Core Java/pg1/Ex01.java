
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n1, n2, n3; 
		
		System.out.print("Enter 1 Number : ");
		n1 = sc.nextInt(); 
		
		System.out.print("Enter 2 Number : ");
		n2 = sc.nextInt(); 
		
		System.out.print("Enter 3 Number : ");
		n3 = sc.nextInt(); 
		

		if(n1 > n2 && n1 > n3) 
		{
			System.out.println(n1 + " is the largest number.");
		}
		else if(n2 > n1 && n2 > n3) 
		{
			System.out.println(n2 + " is the largest number.");
		}
		else if(n3 > n1 && n3 > n2) 
		{
			System.out.println(n3 + " is the largest number.");
		}
		else if(n1 == n2 && n2 == n3) 
		{
			System.out.println("Numbers are same.");
		}
		else if(n1 == n2)
		{
			System.out.println(" 1 & 2 Numbers are same.");
		}
		else if(n2 == n3) 
		{
			System.out.println(" 2 & 3 Numbers are same.");
		}
	}
}
