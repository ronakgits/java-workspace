public class Ex07 {
    
    static void printStars(int num) {

		int i, j, n = 1; 
        
		for(i = 1; i <= num; i++) {

			for(j = 1; j <= i; j++) {

				System.out.print(n + " ");
				n = n + 1; 
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int num = 4; 
		printStars(num); 

	}
    
}
