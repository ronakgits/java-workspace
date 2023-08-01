
public class PrintNumber {

	public static void printn(char n1, char n2) {
		
		System.out.println(n1 + " " + n2);
	}
	public static void printn(String s) {
		
		System.out.println(s);
	}
	public static void printn(boolean b) {
		
		System.out.println(b);
	}
	public static void printn(int n1, int n2) {
		
		System.out.println(n1 + n2);
	}
	public static void printn(double n1, double n2) {
		
		System.out.println(n1 + n2);
	}
	
	public static void main(String[] args) {
	
		printn('a', 'b');
		printn("Java World");
		printn(true);
		printn(2, 2);
		printn(2.2, 4.2); 
		
	}
}
