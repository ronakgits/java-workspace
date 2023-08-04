public class Ex13 {

	public static void main(String args[]) {

        int i, num = 100; 

        System.out.println("\nDivided by 3: ");	

		for (i=1; i<=num; i++) {

			if (i%3 == 0) 
				System.out.print(i +", ");			
		}			
    
    		
    	System.out.println("\n\nDivided by 5: ");
    
		for (i=1; i<=num; i++) {

			if (i%5 == 0) 
				System.out.print(i +", ");			
		}
    
    				
    	System.out.println("\n\nDivided by 3 & 5: ");	
    
		for (i=1; i<=num; i++) {
			
			if (i%3 == 0 && i%5 == 0) 
				System.out.print(i +", ");			
		}

		System.out.println("\n");
	}
}
