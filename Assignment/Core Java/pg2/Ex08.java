import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
		
		int num, count = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" Input an integer number\n less than ten billion: ");
		
		num = sc.nextInt();
		
		while(num != 0){
			num /= 10; 
			++count; 
		}
		
		System.out.println(" Number of digits in the number: " + count);
	}
    
}
