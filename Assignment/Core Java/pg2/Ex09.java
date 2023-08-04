
import java.util.Scanner;

public class Ex09 {

	public static void count(String s) {
		
		char[] ch = s.toCharArray();
		
		int letter = 0, space = 0, num = 0, other = 0, i;
		
		for(i = 0; i<s.length(); i++) {
			
			if(Character.isLetter(ch[i]))

				letter++;
			
			else if(Character.isDigit(ch[i]))
			
				num++;
			
			else if(Character.isSpaceChar(ch[i]))
			
				space++;
			
			else 
			
				other++;
		}

		System.out.println();
		
		System.out.println(s);

		System.out.println("Letters: " + letter);
		System.out.println("Digits: " + num);
		System.out.println("Spaces: " + space);
		System.out.println("Others: " + other);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		count(str);
	}
}

