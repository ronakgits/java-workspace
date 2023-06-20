import java.util.Scanner;

class Ex14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter String : ");
        String s = sc.nextLine(); 
        
        char z, t; 
      
        // Position 0 
        z = s.charAt(0); 
        System.out.println(" The character at position 0 is : " + z);

        // Position 10 
        t = s.charAt(10); 
        System.out.println(" The character at position 0 is : " + t);

    }
}

