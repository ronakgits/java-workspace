
public class Ex22 {
	
	public static void printNum(int n, char c) {
		
		System.out.println(" Num is : " + n + "\n Character is : " + c);
	}
	
	public static void printNum(char c, int n) {
		
		System.out.println(" Character is : " + c + "\n Num is : " + n);
	}
	
	public static void main(String[] args) {
		
		printNum(0, 'r');
		printNum('o', 1);
	}
}